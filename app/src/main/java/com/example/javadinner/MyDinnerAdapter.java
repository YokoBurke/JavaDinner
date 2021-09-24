package com.example.javadinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyDinnerAdapter extends RecyclerView.Adapter<MyDinnerAdapter.MyViewHolder> {

    private static final String LOG_TAG = MyDinnerAdapter.class. getSimpleName();

    private List<Dinner> myDinners;
    private Context myContext;

    public MyDinnerAdapter(Context mContext, List<Dinner> mDinners) {
        myDinners = mDinners;
        myContext = mContext;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView myImageView;
        public TextView myTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myImageView = (ImageView) itemView.findViewById(R.id.item_image);
            myTextView = (TextView) itemView.findViewById(R.id.item_title);
        }
    }


    @NonNull
    @Override
    public MyDinnerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        int myLayoutId = R.layout.my_list;
        View itemView = LayoutInflater.from(parent.getContext()).inflate(myLayoutId, parent, false);
        MyViewHolder dinnerViewHolder = new MyViewHolder(itemView);
        return dinnerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyDinnerAdapter.MyViewHolder holder, int position) {

        int myDinnerName = myDinners.get(position).getDinnerMenu();
        int myDinnerImage = myDinners.get(position).getMyImage();

        holder.myTextView.setText(myDinnerName);
        holder.myImageView.setImageResource(myDinnerImage);
    }

    @Override
    public int getItemCount() {
        return myDinners.size();
    }


}
