package com.taweesak.myfmrvcominterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyListener{//Todo Step 17 ==> implement interface
    // set add Fragment
    // implement Interface
    // getData from Interface(Bundle) + setAgruments
    // replace FM

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // check savedInstanceState = null
        //Todo Step 16 ==> add Fragment
        if(savedInstanceState == null){
            Fragment fragmentA = new FragmentA();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentContainer_top,fragmentA)
                    .commit();
        }

    }

    @Override
    public void myCallback(MyChidModel myChidModel) {

        //Toast.makeText(this,"data is "+myChidModel.getCountry(),Toast.LENGTH_SHORT).show();
        FragmentB fragmentB = new FragmentB();
        Bundle b = new Bundle();
        b.putParcelable("key",myChidModel);
        fragmentB.setArguments(b);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contentContainer_top,fragmentB)
                .addToBackStack("")
                .commit();

    }
}
