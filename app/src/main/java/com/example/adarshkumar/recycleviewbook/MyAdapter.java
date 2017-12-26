package com.example.adarshkumar.recycleviewbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem=listItems.get(position);

        holder.heading.setText(listItem.getHead());
        holder.description.setText(listItem.getDesc());
        Picasso.with(context)
                .load(listItem.getImageurl())
        .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public  class  ViewHolder extends  RecyclerView.ViewHolder{

        public TextView heading;
        public TextView description;
        public ImageView image;

            public ViewHolder(View itemView) {
                super(itemView);

                heading=(TextView) itemView.findViewById(R.id.heading);
                description=(TextView) itemView.findViewById(R.id.description);
                image=(ImageView) itemView.findViewById(R.id.image);
            }
    }
}
