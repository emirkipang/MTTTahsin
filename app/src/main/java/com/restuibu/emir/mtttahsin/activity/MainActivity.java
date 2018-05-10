package com.restuibu.emir.mtttahsin.activity;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.restuibu.emir.mtttahsin.R;
import com.restuibu.emir.mtttahsin.adapter.GridViewAdapter;
import com.restuibu.emir.mtttahsin.util.Helper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Helper.hideActionBar(this);

        GridView gridview = (GridView) findViewById(R.id.gridView1);
        gridview.setAdapter(new GridViewAdapter(this));


    }
}
