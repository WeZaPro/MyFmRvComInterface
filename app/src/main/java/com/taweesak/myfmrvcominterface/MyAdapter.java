package com.taweesak.myfmrvcominterface;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//Todo Step 6 ==> Create Adapter Class
//Todo Step 8 ==> extend Rv Adapter
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH>{

    // create Filed
        // - Listener , - Context , - ArrayList

    FragmentActivity activity; // ถ้าใช้เป็น Activity ก็ใช้ทั้งหมด อย่าใช้ this หรือ Context
    MyListener listener;
    ArrayList<MyChidModel> lstData;

    // create Method
    public MyAdapter(FragmentActivity activity, MyListener listener, ArrayList<MyChidModel> lstData) {
        this.activity = activity;
        this.listener =listener;
        this.lstData = lstData;
    }


    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder._country.setText(lstData.get(position).getCountry());
        holder._rates.setText(""+lstData.get(position).getRate());
        holder._imageFlag.setImageResource(lstData.get(position).getImageFlag());
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }


    //Todo Step7 ==> Create ViewHolder Class + extend Rv ViewHolder
    public class VH extends RecyclerView.ViewHolder{

        TextView _country;
        TextView _rates;
        ImageView _imageFlag;

        public VH(@NonNull View itemView) {
            super(itemView);

            _country = itemView.findViewById(R.id.tv_country);
            _rates = itemView.findViewById(R.id.tv_rate);
            _imageFlag = itemView.findViewById(R.id.imageFlag);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Todo
                    int clickItem = (int) view.getTag();
                    listener.myCallback(lstData.get(clickItem));
                    //Toast.makeText(activity,"data is "+lstData.get(clickItem).getCountry(),Toast.LENGTH_SHORT).show();
                    Log.d("check",lstData.get(clickItem).getCountry());
                }
            });

        }
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (activity instanceof MyListener){
            listener = (MyListener) activity;
        }
    }

    @Override
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        listener = null;
    }
}
