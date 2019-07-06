package com.example.vickyshahi.ecommerce.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vickyshahi.ecommerce.Interface.ItemClickListner;
import com.example.vickyshahi.ecommerce.R;

public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtUserName,txtUserPhone,txtUserAddress;
    public ImageView image;
   public  ItemClickListner listner;

    public void setItemClickListner(ItemClickListner listner)
    {
        this.listner = listner;
    }

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        image = (ImageView) itemView.findViewById(R.id.user_image);
        txtUserName = (TextView) itemView.findViewById(R.id.user_name);
        txtUserPhone = (TextView) itemView.findViewById(R.id.user_address);
        txtUserAddress = (TextView) itemView.findViewById(R.id.user_phone);
    }

    @Override
    public void onClick(View v) {
        listner.onClick(v, getAdapterPosition(), false);

    }
}
