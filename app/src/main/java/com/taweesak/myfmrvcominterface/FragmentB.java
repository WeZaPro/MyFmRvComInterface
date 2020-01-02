package com.taweesak.myfmrvcominterface;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

//Todo Step 3 ==> Create FM B
public class FragmentB extends Fragment {

    // get Agruments

    TextView tvCountry;

    public FragmentB() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_b, container, false);
        tvCountry = v.findViewById(R.id.tvCountry);

        MyChidModel myChidModel = new MyChidModel();
        if(getArguments() != null){
            myChidModel = getArguments().getParcelable("key");
            //Toast.makeText(getActivity(),"data is "+myChidModel.getCountry(),Toast.LENGTH_SHORT).show();
            tvCountry.setText(myChidModel.getCountry());
        }

        return v;
    }

}
