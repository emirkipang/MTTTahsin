package com.restuibu.emir.mtttahsin.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.restuibu.emir.mtttahsin.R;
import com.restuibu.emir.mtttahsin.adapter.AboutListViewAdapter;
import com.restuibu.emir.mtttahsin.util.Constant;
import com.restuibu.emir.mtttahsin.util.Helper;

import java.util.ArrayList;

import static com.restuibu.emir.mtttahsin.util.Helper.setListViewHeightBasedOnChildren;

public class AboutActivity extends AppCompatActivity {
    private AboutListViewAdapter adapter;
    private ListView sosmed_list, konten_list, donasi_list;
    private ArrayAdapter<String> donasiArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Helper.changeActionBarTitle(this, "Tentang");

        konten_list = (ListView) findViewById(R.id.listView1);
        sosmed_list = (ListView) findViewById(R.id.listView2);
        donasi_list = (ListView) findViewById(R.id.listView3);

        adapter = new AboutListViewAdapter(AboutActivity.this, "konten");
        konten_list.setAdapter(adapter);

        adapter = new AboutListViewAdapter(AboutActivity.this, "sosmed");
        sosmed_list.setAdapter(adapter);

        ArrayAdapter<String> donasiArrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Constant.donasi) {

                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {
                        View view = super.getView(position, convertView, parent);
                        TextView textView = (TextView) view.findViewById(android.R.id.text1);
                        textView.setTextColor(Color.parseColor("#808080"));

                        return view;
                    }
                };
        ;
        donasi_list.setAdapter(donasiArrayAdapter);

        setListViewHeightBasedOnChildren(konten_list);
        setListViewHeightBasedOnChildren(sosmed_list);
        setListViewHeightBasedOnChildren(donasi_list);

    }
}
