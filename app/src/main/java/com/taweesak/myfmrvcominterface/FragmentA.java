package com.taweesak.myfmrvcominterface;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

//Todo Step 2 ==> Create FM A
public class FragmentA extends Fragment {

    // Set data ArrayList
    // Set Rv Layout
    // Set Adapter
    // set Listener (Interface)
    // onAttact Listener
    // onDetact Listener

    View v;
    RecyclerView myRecyclerView;
    MyAdapter myAdapter;
    MyChidModel myChidModel;
    ArrayList<MyChidModel> lstData = new ArrayList<>();;
    MyListener listener;

    public FragmentA() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // check v = null
        //Todo Step 18
        if (v == null){
           v = inflater.inflate(R.layout.fragment_a, container, false);

           setData();
           setRvLayout(v);
           setMyAdapter();

        }

        return v;
    }

    private void setMyAdapter() {

        myAdapter = new MyAdapter(getActivity(),listener,lstData);
        myRecyclerView.setAdapter(myAdapter);

    }

    private void setRvLayout(View v) {
        myRecyclerView = v.findViewById(R.id.myRecyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void setData() {

        String country[] = {"brazil","ghana","island","japan","polynesia",
                "southkorea","spain","UK","USA"};
        double rates[] = {100.01,102.02,103.03,104.04,105.05,106.06,107.07,108.08,109.09};
        int imageFlags[] = {R.drawable.brazil,R.drawable.ghana,R.drawable.island,
                R.drawable.japan,R.drawable.polynesia,R.drawable.southkorea,
                R.drawable.spain,R.drawable.unitedkingdom,R.drawable.usa};

        int dataSize = imageFlags.length;

        for (int i = 0; i < dataSize; i++) {

            myChidModel = new MyChidModel(rates[i],country[i],imageFlags[i]);
            lstData.add(myChidModel);
        }

    }

}
