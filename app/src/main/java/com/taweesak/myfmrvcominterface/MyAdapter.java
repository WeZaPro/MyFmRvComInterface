package com.taweesak.myfmrvcominterface;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//Todo Step 6 ==> Create Adapter Class
//Todo Step 8 ==> extend Rv Adapter
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH>{
    // create Filed
        // - Listener , - Context , - ArrayList

    // create Method

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    //Todo Step7 ==> Create ViewHolder Class + extend Rv ViewHolder
    public class VH extends RecyclerView.ViewHolder{

        public VH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
