package com.restuibu.emir.mtttahsin.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import com.restuibu.emir.mtttahsin.R;
import com.restuibu.emir.mtttahsin.adapter.MainGridViewAdapter;
import com.restuibu.emir.mtttahsin.util.Helper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Helper.changeActionBarTitle(this, "Huruf Hijaiyah");
        setContentView(R.layout.activity_main);


        GridView gridview = (GridView) findViewById(R.id.gridView1);
        gridview.setAdapter(new MainGridViewAdapter(this));



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the main_menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
                //your action
                //Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
                Helper.callIntent(MainActivity.this, AboutActivity.class);
                break;
            case R.id.item2:
                //your action
                Toast.makeText(this, "Install other apps", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}
