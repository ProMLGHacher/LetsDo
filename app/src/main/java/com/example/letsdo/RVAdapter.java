package com.example.letsdo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {

    Context context;

    public RVAdapter(MainActivity mainActivity) {
        context = mainActivity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.view_holder, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String user = MainActivity.rvAdapterValuesList.get(position);
        String[] str = user.split("\n");

        holder.pageName.setText(str[0]);
        holder.tasksCountInPage.setText(str[1]);
    }

    @Override
    public int getItemCount() {
        return MainActivity.rvAdapterValuesList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView pageName, tasksCountInPage;
        public ImageView pageIco;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            pageIco = itemView.findViewById(R.id.pageIco6);
            pageName = itemView.findViewById(R.id.pageName);
            tasksCountInPage = itemView.findViewById(R.id.tasksCountInPage);

        }

        public void bind() {

        }
    }

}
