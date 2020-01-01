package com.taweesak.myfmrvcominterface;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//Todo Step 2 ==> Create FM A
public class FragmentA extends Fragment {

    // Set data ArrayList
    // Set Rv Layout
    // Set Adapter
    // set Listener (Interface)
    // onAttact Listener
    // onDetact Listener

    public FragmentA() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // check v = null

        View v = inflater.inflate(R.layout.fragment_a, container, false);
        return v;
    }

}
