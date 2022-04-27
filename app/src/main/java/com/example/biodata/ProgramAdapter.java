package com.example.biodata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    Context context;
    String[] name;
    String[] subject;
    String[] degree;
    int[] images;
    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        TextView textview1 ;
        TextView textView2;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textview1 = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);
            textView2=itemView.findViewById(R.id.textView3);

        }
    }
    public ProgramAdapter(Context context, String[] name, String[] subject, String[] degree, int[] images){
        this.context = context;
        this.name = name;
        this.subject = subject;
        this.images = images;
        this.degree=degree;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.biodata, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(name[position]);
        holder.textview1.setText(subject[position]);
        holder.imageView.setImageResource(images[position]);
        holder.textView2.setText(degree[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}


