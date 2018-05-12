package com.restuibu.emir.mtttahsin.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.restuibu.emir.mtttahsin.R;
import com.restuibu.emir.mtttahsin.activity.DetailActivity;
import com.restuibu.emir.mtttahsin.activity.MainActivity;
import com.restuibu.emir.mtttahsin.model.Hijaiyah;
import com.restuibu.emir.mtttahsin.util.Constant;
import com.restuibu.emir.mtttahsin.util.Helper;

import java.util.ArrayList;

public class MainGridViewAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Hijaiyah> hijaiyahs = new ArrayList<>();

    public MainGridViewAdapter(Context c) {
        mContext = c;
        hijaiyahs = Helper.getAllHijaiyah();

    }

    public int getCount() {
        return hijaiyahs.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;


        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.layout_grid, null);
            holder = new ViewHolder();
            holder.linearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout1);
            holder.text = (TextView) convertView.findViewById(R.id.textView1);
            holder.image = (ImageView) convertView.findViewById(R.id.imageView1);

            // if it's not recycled, initialize some attributes
            final Hijaiyah h = hijaiyahs.get(position);

            holder.image.setImageResource(h.getImg());
            holder.text.setText(h.getNama());


            // listener
            holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Helper.callIntent(mContext, DetailActivity.class, h);
                }
            });

            int h_ = mContext.getResources().getDisplayMetrics().densityDpi;

            convertView.setLayoutParams(new GridView.LayoutParams(h_ - 50, h_ - 39));
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    // references to our images


    static class ViewHolder {
        LinearLayout linearLayout;
        ImageView image;
        TextView text;
    }

}

