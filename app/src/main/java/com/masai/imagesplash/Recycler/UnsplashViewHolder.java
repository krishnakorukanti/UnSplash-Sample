package com.masai.imagesplash.Recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.masai.imagesplash.Data.ResultsItem;
import com.masai.imagesplash.R;

public class UnsplashViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private ImageView imageView;

    public UnsplashViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        textView = itemView.findViewById(R.id.textContainer);
        imageView = itemView.findViewById(R.id.imageContainer);
    }

    public void setData(ResultsItem data) {
        textView.setText(data.getAltDescription());
        Glide.with(imageView.getContext()).load(data.getUrls().getRegular()).into(imageView);
    }
}
