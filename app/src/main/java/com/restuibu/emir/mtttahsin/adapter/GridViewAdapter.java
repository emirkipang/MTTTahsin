package com.restuibu.emir.mtttahsin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.restuibu.emir.mtttahsin.R;

public class GridViewAdapter extends BaseAdapter {
    private Context mContext;

    public GridViewAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.layout_grid, null);
            holder = new ViewHolder();
            holder.linearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout1);
            holder.text = (TextView) convertView.findViewById(R.id.textView1);
            holder.image = (ImageView) convertView.findViewById(R.id.imageView1);

            // if it's not recycled, initialize some attributes
            holder.image.setImageResource(mThumbIds[position]);
            holder.text.setText(Integer.toString(position));

            int h = mContext.getResources().getDisplayMetrics().densityDpi;

            //holder.image.setLayoutParams(new LayoutParams(h-50,h-50));
            convertView.setLayoutParams(new GridView.LayoutParams(h-50, h-39));
            //holder.image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //holder.image.setScaleType(ImageView.ScaleType.FIT_XY);

            // convertView.setLayoutParams(new GridView.LayoutParams(Utils
            // .getLayoutParameter(), Utils.getLayoutParameter()+50));


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher
    };

    static class ViewHolder {
        LinearLayout linearLayout;
        ImageView image;
        TextView text;
    }

}

