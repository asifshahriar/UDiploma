package com.example.udiploma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    int[] images;
    String[] textView1, textView2;

    public MyAdapter(Context context, int[] images, String[] textView1, String[] textView2) {
        this.context = context;
        this.images = images;
        this.textView1 = textView1;
        this.textView2 = textView2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_sample,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.images.setImageResource(images[position]);
        holder.text1.setText(textView1[position]);
        holder.text2.setText(textView2[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView images;
        TextView text1, text2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            images = itemView.findViewById(R.id.imageId);
            text1 = itemView.findViewById(R.id.titleId);
            text2 = itemView.findViewById(R.id.subTitleId);

        }
    }
}
