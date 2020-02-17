package com.nk.student;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.nk.student.databinding.ItemContentBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<ContentValue> contentValueList;
    private RecyclerRootListener listener;

    public RecyclerAdapter() {
        contentValueList = new ArrayList<>();
    }

    public void setListener(RecyclerRootListener listener) {
        this.listener = listener;
    }

    public void setContentValueList(List<ContentValue> contentValueList){
        this.contentValueList = contentValueList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContentBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_content,parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.binding.setItem(getItemAtPosition(position));
        holder.binding.executePendingBindings();
    }

    public ContentValue getItemAtPosition(int position){
        return contentValueList.get(position);
    }

    @Override
    public int getItemCount() {
        return contentValueList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ItemContentBinding binding;
        public MyViewHolder(ItemContentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (listener != null){
                listener.onRootClick(getAdapterPosition());
            }
        }
    }
}
