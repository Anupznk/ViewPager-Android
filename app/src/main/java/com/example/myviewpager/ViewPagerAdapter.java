package com.example.myviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ViewPagerAdapter extends PagerAdapter {

    private ArrayList<Model> items = new ArrayList<>();
    private Context context;
    private LayoutInflater layoutInflater;

    public ViewPagerAdapter(ArrayList<Model> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.card_item, container, false);

        ImageView image;
        TextView creator;
        TextView likes;

        image = view.findViewById(R.id.image_view);
        creator = view.findViewById(R.id.text_view_creator);
        likes = view.findViewById(R.id.text_view_likes);

        image.setImageResource(items.get(position).getImageResource());
        creator.setText(items.get(position).getCreator());
        likes.setText(Integer.toString(items.get(position).getLikes()));

        container.addView(view);

        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
