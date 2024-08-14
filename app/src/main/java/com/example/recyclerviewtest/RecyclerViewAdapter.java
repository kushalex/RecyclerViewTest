package com.example.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<ContactData> contactData;

    public RecyclerViewAdapter(Context context, ArrayList<ContactData> contactData) {
        this.context = context;
        this.contactData = contactData;
    }

    // inflate the layout (giving a look to our rows)

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_view_layout, parent, false);

        return new RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {

        // assigning value to the views we created in the recycler_view_layout layout file
        // based on the position of the recycler view

        holder.imageView.setImageResource(contactData.get(position).getContactImage());
        holder.textViewName.setText(contactData.get(position).getContactName());
        holder.textViewPhone.setText(contactData.get(position).getContactPhone());
    }

    @Override
    public int getItemCount() {

        // how many total items for the recycler view

        return contactData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        // grabbing the views from the recycler_view_layout layout file
        // similar to an onCreate method

        ImageView imageView;
        TextView textViewName, textViewPhone;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textView1);
            textViewPhone = itemView.findViewById(R.id.textView2);
        }
    }
}
