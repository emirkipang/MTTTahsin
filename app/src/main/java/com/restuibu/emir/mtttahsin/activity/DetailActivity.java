package com.restuibu.emir.mtttahsin.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.restuibu.emir.mtttahsin.R;
import com.restuibu.emir.mtttahsin.model.Hijaiyah;
import com.restuibu.emir.mtttahsin.util.Helper;

public class DetailActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("nama");
        final String nama_next = bundle.getString("nama_next");
        final String nama_prev = bundle.getString("nama_prev");
        Integer img = Integer.parseInt(bundle.getString("img"));
        String makhraj = bundle.getString("makhraj");
        String sifat = bundle.getString("sifat");
        final Integer index = Integer.parseInt(bundle.getString("index"));

        ImageView imgIv = (ImageView) findViewById(R.id.imageView1);
        TextView makhrajTv = (TextView) findViewById(R.id.textView1);
        TextView sifatTv = (TextView) findViewById(R.id.textView2);
        Button playBtn = (Button) findViewById(R.id.button1);
        Button nextBtn = (Button) findViewById(R.id.button2);
        Button prevBtn = (Button) findViewById(R.id.button3);

        Helper.changeActionBarTitle(this, nama);
        imgIv.setImageResource(img);
        makhrajTv.setText(makhraj);
        makhrajTv.setMovementMethod(new ScrollingMovementMethod());
        sifatTv.setText(sifat);
        sifatTv.setMovementMethod(new ScrollingMovementMethod());

        if ((index + 1) == 28) {
            nextBtn.setEnabled(false);
        }

        if ((index - 1) == -1) {
            prevBtn.setEnabled(false);
        }

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.alif_hamzah);

                mediaPlayer.start();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hijaiyah h = Helper.getDetilHijaiyah(index + 1);
                Helper.callIntent(DetailActivity.this, DetailActivity.class, h);
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hijaiyah h = Helper.getDetilHijaiyah(index - 1);
                Helper.callIntent(DetailActivity.this, DetailActivity.class, h);
            }
        });
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
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
                Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();

    }


}
