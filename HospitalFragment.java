package com.codeclays.cancercare;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HospitalFragment extends Fragment implements View.OnClickListener{

    LinearLayout layout1,layout2,layout3,layout4,layout5,layout6,layout7,layout8;
    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hospital, container, false);

        initLayout(view);
        b1.setOnClickListener(this);
        return view;
    }


    private void initLayout(View view) {
        layout1 = view.findViewById(R.id.layout1);
        layout2 = view.findViewById(R.id.layout2);
        layout3 = view.findViewById(R.id.layout3);
        layout4 = view.findViewById(R.id.layout4);
        layout5 = view.findViewById(R.id.layout5);
        layout6 = view.findViewById(R.id.layout6);
        layout7 = view.findViewById(R.id.layout7);
        layout8 = view.findViewById(R.id.layout8);
        b1 = view.findViewById(R.id.b1);
        b2 = view.findViewById(R.id.b2);
        b3 = view.findViewById(R.id.b3);
        b4 = view.findViewById(R.id.b4);
        b5 = view.findViewById(R.id.b5);
        b6 = view.findViewById(R.id.b6);
        b7 = view.findViewById(R.id.b7);
        b8 = view.findViewById(R.id.b8);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);

    }

    public static HospitalFragment newInstance(String param1, String param2) {
        HospitalFragment fragment = new HospitalFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onClick(View v) {
        Log.d("click","clickk");
        if (v.getId() == R.id.b1){
            if (layout1.getVisibility() == View.VISIBLE) {
                layout1.setVisibility(View.GONE);
            Drawable d = getResources().getDrawable(R.drawable.ic_up);
            b1.setBackground(d);
            }else{
                layout1.setVisibility(View.VISIBLE);
                Drawable d = getResources().getDrawable(R.drawable.down);
                b1.setBackground(d);
            }
        }

        if (v.getId() == R.id.b2){
            if (layout2.getVisibility() == View.VISIBLE) {
                layout2.setVisibility(View.GONE);
                Drawable d = getResources().getDrawable(R.drawable.ic_up);
                b2.setBackground(d);
            }else{
                layout2.setVisibility(View.VISIBLE);
                Drawable d = getResources().getDrawable(R.drawable.down);
                b2.setBackground(d);
            }
        }

        if (v.getId() == R.id.b3){
            if (layout3.getVisibility() == View.VISIBLE) {
                layout3.setVisibility(View.GONE);
                Drawable d = getResources().getDrawable(R.drawable.ic_up);
                b3.setBackground(d);
            }else{
                layout3.setVisibility(View.VISIBLE);
                Drawable d = getResources().getDrawable(R.drawable.down);
                b3.setBackground(d);
            }
        }

        if (v.getId() == R.id.b4){
            if (layout4.getVisibility() == View.VISIBLE) {
                layout4.setVisibility(View.GONE);
                Drawable d = getResources().getDrawable(R.drawable.ic_up);
                b4.setBackground(d);
            }else{
                layout4.setVisibility(View.VISIBLE);
                Drawable d = getResources().getDrawable(R.drawable.down);
                b4.setBackground(d);
            }
        }

        if (v.getId() == R.id.b5){
            if (layout5.getVisibility() == View.VISIBLE) {
                layout5.setVisibility(View.GONE);
                Drawable d = getResources().getDrawable(R.drawable.ic_up);
                b5.setBackground(d);
            }else{
                layout5.setVisibility(View.VISIBLE);
                Drawable d = getResources().getDrawable(R.drawable.down);
                b5.setBackground(d);
            }
        }

        if (v.getId() == R.id.b6){
            if (layout6.getVisibility() == View.VISIBLE) {
                layout6.setVisibility(View.GONE);
                Drawable d = getResources().getDrawable(R.drawable.ic_up);
                b6.setBackground(d);
            }else{
                layout6.setVisibility(View.VISIBLE);
                Drawable d = getResources().getDrawable(R.drawable.down);
                b6.setBackground(d);
            }
        }

        if (v.getId() == R.id.b7){
            if (layout7.getVisibility() == View.VISIBLE) {
                layout7.setVisibility(View.GONE);
                Drawable d = getResources().getDrawable(R.drawable.ic_up);
                b7.setBackground(d);
            }else{
                layout7.setVisibility(View.VISIBLE);
                Drawable d = getResources().getDrawable(R.drawable.down);
                b7.setBackground(d);
            }
        }

        if (v.getId() == R.id.b8){
            if (layout8.getVisibility() == View.VISIBLE) {
                layout8.setVisibility(View.GONE);
                Drawable d = getResources().getDrawable(R.drawable.ic_up);
                b8.setBackground(d);
            }else{
                layout8.setVisibility(View.VISIBLE);
                Drawable d = getResources().getDrawable(R.drawable.down);
                b8.setBackground(d);
            }
        }


//        if (layout11.getVisibility() == View.VISIBLE){
//            layout11.setVisibility(View.GONE);
//            Drawable d = getResources().getDrawable(R.drawable.ic_up);
//            b1.setBackground(d);
//        }else{
//            layout11.setVisibility(View.VISIBLE);
//            Drawable d = getResources().getDrawable(R.drawable.down);
//            b1.setBackground(d);
//        }
    }
}