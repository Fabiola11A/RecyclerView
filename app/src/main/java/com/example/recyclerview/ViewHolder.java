package com.example.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ViewHolder extends RecyclerView.ViewHolder {

    private final List<Source> sourceList;

    private final Button button1;
    private final Button button2;
    private final ImageView image;
    private final TextView title;

    public ViewHolder(@NonNull View itemView, List<Source> sourceList) {
        super(itemView);
        button1=itemView.findViewById(R.id.button1);
        button2=itemView.findViewById(R.id.button2);
        image= itemView.findViewById(R.id.image);
        title= itemView.findViewById(R.id.title);

       /* button1.setOnClickListener(this);
        button2.setOnClickListener(this);*/
        this.sourceList=sourceList;
    }
}
