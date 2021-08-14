package com.masai.imagesplash.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masai.imagesplash.Data.ResultsItem;
import com.masai.imagesplash.R;

import java.util.List;

public class UnsplashAdapter extends RecyclerView.Adapter<UnsplashViewHolder> {
    private List<ResultsItem> resultsItemList;

    public UnsplashAdapter(List<ResultsItem> resultsItemList){
        this.resultsItemList = resultsItemList;
    }
    @NonNull
    @Override
    public UnsplashViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new UnsplashViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UnsplashViewHolder holder, int position) {
        ResultsItem resultsItem = resultsItemList.get(position);
        holder.setData(resultsItem);

    }

    @Override
    public int getItemCount() {
        return resultsItemList.size();
    }
    public void updateData(List<ResultsItem> resultsItemList){
        this.resultsItemList = resultsItemList;
        notifyDataSetChanged();

    }
}
