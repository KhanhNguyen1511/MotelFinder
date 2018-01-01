package com.example.mrm82.motelfinder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mrm82 on 23/12/2017.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>  {

    ArrayList<BaiDangConstruct> listPost;
    Context context;


    public PostAdapter(ArrayList<BaiDangConstruct> listPost, Context context){
        this.listPost=listPost;
        this.context=context;
    }

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.post_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtTitle.setText(listPost.get(position).getPostTitle());
        holder.txtArea.setText(listPost.get(position).getPostArea());
        holder.txtPrice.setText(listPost.get(position).getPostPrice());
        holder.txtType.setText(listPost.get(position).getPostType());
    }



    @Override
    public int getItemCount() {
        return listPost.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle,txtArea,txtPrice,txtType;
        CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            txtTitle= itemView.findViewById(R.id.txtPostTitle);
            txtArea = itemView.findViewById(R.id.txtArea);
            txtType= itemView.findViewById(R.id.txtpostType);
            txtPrice = itemView.findViewById(R.id.txtprice);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(context,Post_Info.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);
                }
            });
        }


    }

}
