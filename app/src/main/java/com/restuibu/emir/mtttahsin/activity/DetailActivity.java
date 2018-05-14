package com.restuibu.emir.mtttahsin.activity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.restuibu.emir.mtttahsin.R;
import com.restuibu.emir.mtttahsin.model.Hijaiyah;
import com.restuibu.emir.mtttahsin.util.Constant;
import com.restuibu.emir.mtttahsin.util.Helper;
import com.restuibu.emir.mtttahsin.util.ScaleImageView;

public class DetailActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private String nama, nama_next, nama_prev, makhraj, sifat;
    private Integer img, index, record, kalimat;
    private boolean flag;
    private Button playBtn;
    private ImageView makhrajGuideIV, sifatGuideIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        nama = bundle.getString("nama");
        nama_next = bundle.getString("nama_next");
        nama_prev = bundle.getString("nama_prev");
        img = Integer.parseInt(bundle.getString("img"));
        makhraj = bundle.getString("makhraj");
        sifat = bundle.getString("sifat");
        index = Integer.parseInt(bundle.getString("index"));
        record = Integer.parseInt(bundle.getString("record"));
        kalimat = Integer.parseInt(bundle.getString("kalimat"));


        ImageView imgIv = (ImageView) findViewById(R.id.imageView1);
        TextView makhrajTv = (TextView) findViewById(R.id.textView1);
        TextView sifatTv = (TextView) findViewById(R.id.textView2);
        playBtn = (Button) findViewById(R.id.button1);
        Button nextBtn = (Button) findViewById(R.id.button2);
        Button prevBtn = (Button) findViewById(R.id.button3);
        makhrajGuideIV = (ImageView) findViewById(R.id.guideIV1);
        sifatGuideIV = (ImageView) findViewById(R.id.guideIV2);

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

        flag = true;
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), record);
                    mediaPlayer.start();
                    showDialogKalimat();
                } else {
                    mediaPlayer.stop();
                    playBtn.setText("PLAY");
                    flag = true;
                }
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

        makhrajGuideIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(DetailActivity.this, "guide makhraj", Toast.LENGTH_SHORT).show();
                showDialogHelpMakhraj();
            }
        });

        sifatGuideIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(DetailActivity.this, "guide sifat", Toast.LENGTH_SHORT).show();
                showDialogHelpSifat();
            }
        });
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            mediaPlayer = null;

        }

    }


    private void showDialogKalimat() {
        LayoutInflater inflater = LayoutInflater
                .from(DetailActivity.this);
        View dialogview = inflater.inflate(R.layout.help_makhraj_dialog,
                null);
        final ImageView imageView1 = (ImageView) dialogview
                .findViewById(R.id.imageView1);
        final Button button1 = (Button) dialogview
                .findViewById(R.id.button1);
        imageView1.setImageResource(kalimat);
        button1.setVisibility(View.VISIBLE);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        getApplicationContext(), record);
                mediaPlayer.start();

                mediaPlayer
                        .setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                playBtn.setText("PLAY");
                                flag = true;
                            }
                        });

                playBtn.setText("STOP");


            }
        });

        final AlertDialog alert = new AlertDialog.Builder(
                DetailActivity.this).create();
        alert.setView(dialogview);
        alert.show();

        mediaPlayer
                .setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playBtn.setText("PLAY");
                        flag = true;
                    }
                });

        playBtn.setText("STOP");
        flag = false;
    }

    public void showDialogHelpMakhraj() {
        LayoutInflater inflater = LayoutInflater.from(DetailActivity.this);
        View dialogview = inflater.inflate(R.layout.help_makhraj_dialog, null);
        final ScaleImageView imageView1 = (ScaleImageView) dialogview
                .findViewById(R.id.imageView1);
        imageView1.setImageResource(R.drawable.makhrojulhuruf);

        final AlertDialog alert = new AlertDialog.Builder(DetailActivity.this).create();
        alert.setView(dialogview);
        alert.show();
    }

    public void showDialogHelpSifat() {
        LayoutInflater inflater = LayoutInflater.from(DetailActivity.this);
        View dialogview = inflater.inflate(R.layout.help_sifat_dialog, null);
        ListView list = (ListView) dialogview.findViewById(R.id.listView1);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Constant.detil_sifat) {

                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {
                        View view = super.getView(position, convertView, parent);
                        TextView textView = (TextView) view.findViewById(android.R.id.text1);
                        textView.setTextColor(Color.parseColor("#808080"));
                        textView.setTextSize(12);

                        return view;
                    }
                };
        list.setAdapter(adapter);

        final AlertDialog alert = new AlertDialog.Builder(DetailActivity.this).create();
        alert.setView(dialogview);
        alert.show();
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
                Helper.callIntent(DetailActivity.this, AboutActivity.class);
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
