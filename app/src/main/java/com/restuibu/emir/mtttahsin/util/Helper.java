package com.restuibu.emir.mtttahsin.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.restuibu.emir.mtttahsin.activity.DetailActivity;
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

}
