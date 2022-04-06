package com.example.storyapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;

public class Adp_for_book extends RecyclerView.Adapter<Adp_for_book.ViewHolder> {
    ArrayList<modle> list;
    Context context;

    public Adp_for_book(ArrayList<modle> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View sView = LayoutInflater.from(context).inflate(R.layout.symplelayout, parent, false);
        return new ViewHolder(sView);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        modle mmodel = list.get(position);
        holder.tv.setText(mmodel.text_for_book);


        holder.itemView.setOnClickListener(v -> {

            Intent intent = new Intent(context, Pdf_view.class);
            intent.putExtra("textforbook", mmodel.getText_for_book());
            intent.putExtra("pos", position);


            context.startActivity(intent);

        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        PDFView pd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.textbook_name);

        }
    }
}
