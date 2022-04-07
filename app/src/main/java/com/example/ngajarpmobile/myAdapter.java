package com.example.ngajarpmobile;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ListViewHolder>{
    private ArrayList<SetGetItem> listKaryawan;
    Context context;

    public myAdapter(ArrayList<SetGetItem> list, Context context) {
        this.context = context;
        this.listKaryawan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tampilan_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        SetGetItem item = listKaryawan.get(position);
        holder.tvNama.setText(item.getNama());
        holder.tvGender.setText(item.getGender());
        holder.ivAvatar.setImageResource(item.getAvatar());

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DescriptionActivity.class);
                intent.putExtra("nama", item.getNama());
                intent.putExtra("gender", item.getGender());
                intent.putExtra("avatar", item.getAvatar());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKaryawan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvNama, tvGender;
        ImageView ivAvatar;
        ConstraintLayout mainLayout;

        public ListViewHolder(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvGender = itemView.findViewById(R.id.tvGender);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
