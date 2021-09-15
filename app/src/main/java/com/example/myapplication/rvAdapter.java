package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.UserViewHolder>{

    private ArrayList<User> userlist;

    public rvAdapter(ArrayList<User> userlist){
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.card_view_id.setText(String.valueOf(position));
        holder.card_view_nama.setText(userlist.get(position).getNama());
        holder.card_view_umur.setText(userlist.get(position).getUmur());
        holder.card_view_alamat.setText(String.valueOf(userlist.get(position).getAlamat()));

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private TextView card_view_id, card_view_nama, card_view_umur, card_view_alamat;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            card_view_id = itemView.findViewById(R.id.cv);
            card_view_nama = itemView.findViewById(R.id.namaView);
            card_view_umur = itemView.findViewById(R.id.umurView);
            card_view_alamat = itemView.findViewById(R.id.alamatView);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){

                }
            });
        }
    }
}
