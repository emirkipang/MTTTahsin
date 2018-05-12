package com.restuibu.emir.mtttahsin.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.restuibu.emir.mtttahsin.activity.DetailActivity;
import com.restuibu.emir.mtttahsin.model.About;
import com.restuibu.emir.mtttahsin.model.Hijaiyah;
import com.restuibu.emir.mtttahsin.R;

import java.util.ArrayList;

public class Helper {
    public static void hideActionBar(AppCompatActivity activity) {
        ActionBar actionBar = activity.getSupportActionBar();
        actionBar.hide();
    }

    public static void changeActionBarTitle(AppCompatActivity activity, String title) {
        ActionBar actionBar = activity.getSupportActionBar();
        actionBar.setTitle(title);
    }

    public static ArrayList<Hijaiyah> getAllHijaiyah() {
        ArrayList<Hijaiyah> list = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            Hijaiyah h = new Hijaiyah();
            h.setIndex(Constant.index[i]);
            h.setNama(Constant.nama_hijaiyah[i]);
            h.setImg(Constant.hijaiyah[i]);
            h.setMakhraj(Constant.makhraj[i]);
            h.setSifat(Constant.sifat[i]);
            h.setRecord(Constant.record[i]);
            h.setKalimat(Constant.kalimat[i]);
            list.add(h);
        }

        return list;
    }


    public static ArrayList<About> getAllAbout(String jenis) {
        ArrayList<About> list = new ArrayList<>();
        int max = 0;
        switch(jenis){
            case "sosmed":
                max = Constant.sosmed_desc_about.length;
                break;
            case "konten":
                max = Constant.konten_desc_about.length;
                break;
        }

        for (int i = 0; i < max; i++) {
            About a = new About();

            switch (jenis){
                case "sosmed":
                    a.setImg(Constant.sosmed_img_about[i]);
                    a.setDesc(Constant.sosmed_desc_about[i]);
                    a.setUrl(Constant.sosmed_url_about[i]);
                    break;
                case "konten":
                    a.setImg(Constant.konten_img_about[i]);
                    a.setDesc(Constant.konten_desc_about[i]);
                    break;
            }
            list.add(a);
        }

        return list;
    }

    public static Hijaiyah getDetilHijaiyah(String nama) {
        ArrayList<Hijaiyah> list = getAllHijaiyah();

        for (Hijaiyah h :
                list) {
            if(h.getNama().equals(nama)){
                return h;
            }
        }

        return null;
    }

    public static Hijaiyah getDetilHijaiyah(Integer index) {
        ArrayList<Hijaiyah> list = getAllHijaiyah();

        for (Hijaiyah h :
                list) {
            if(h.getIndex() == index){
                return h;
            }
        }

        return null;
    }


    public static void callIntent(Context from, Class to, Hijaiyah h){
        Intent intent = new Intent(from, to);
        intent.putExtra("nama", h.getNama());
        intent.putExtra("img", Integer.toString(h.getImg()));
        intent.putExtra("makhraj", h.getMakhraj());
        intent.putExtra("sifat", h.getSifat());
        intent.putExtra("index", Integer.toString(h.getIndex()));
        intent.putExtra("record", Integer.toString(h.getRecord()));
        intent.putExtra("kalimat", Integer.toString(h.getKalimat()));
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        from.startActivity(intent);
    }

    public static void callIntent(Context from, Class to){
        Intent intent = new Intent(from, to);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        from.startActivity(intent);
    }

    public static void callIntent(Context from, String url){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        from.startActivity(i);
    }





    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null)
            return;

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, ViewGroup.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }



}
