package com.codeclays.cancercare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {

    RadioGroup radioGroup1,radioGroup2,radioGroup3;
    RadioGroup radioGroupsub1,radioGroupsub2,radioGroupsub3;
    RadioButton rbsys1sub1,rbsys1sub2,rbsys1sub3,rbsys1sub4;
    RadioButton rbsys2sub1,rbsys2sub2,rbsys2sub3,rbsys2sub4;
    RadioButton rbsys3sub1,rbsys3sub2,rbsys3sub3,rbsys3sub4;
    RadioButton rbhome,rbcolor,rbdischarge;
    Button buttonsubmit;
    RadioButton rb1,rb2,rb3;
    int breast =0, cervix =0,lip =0 ,vaginal = 0;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }



    private void initLayout(View view) {

        radioGroupsub1 = view.findViewById(R.id.radioGroupSymptom1);
        radioGroupsub2 = view.findViewById(R.id.radioGroupSymptom2);
        radioGroupsub3 = view.findViewById(R.id.radioGroupSymptom3);

        radioGroupsub1.setOnCheckedChangeListener(this);
        radioGroupsub2.setOnCheckedChangeListener(this);
        radioGroupsub3.setOnCheckedChangeListener(this);

        buttonsubmit = view.findViewById(R.id.buttonsubmit);
        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String rb1text = null,rb2text = null,rb3text = null;
                int selectedRadioButtonId1 = radioGroupsub1.getCheckedRadioButtonId();
                int selectedRadioButtonId2 = radioGroupsub2.getCheckedRadioButtonId();
                int selectedRadioButtonId3 = radioGroupsub3.getCheckedRadioButtonId();
//                Log.d("11 = ",""+selectedRadioButtonId1);
//                Log.d("22= ",""+selectedRadioButtonId2);
//                Log.d("33= ",""+selectedRadioButtonId3);
//                selectedRadioButtonId1 = selectedRadioButtonId1%10;
//                selectedRadioButtonId2 = selectedRadioButtonId2%10;
//                selectedRadioButtonId3 = selectedRadioButtonId3%10;
//
//
////                if (selectedRadioButtonId1 != -1) {
////                    rb1 = view.findViewById(selectedRadioButtonId1);
////                     rb1text = rb1.getText().toString();
//                    Log.d("1 = ",""+selectedRadioButtonId1);
////                }
////                if (selectedRadioButtonId2 != -1) {
////                    rb2 = view.findViewById(selectedRadioButtonId2);
////                     rb2text = rb2.getText().toString();
//                    Log.d("2 = ",""+selectedRadioButtonId2);
////                }
////                if (selectedRadioButtonId3 != -1) {
////                    rb3 = view.findViewById(selectedRadioButtonId3);
////                     rb3text = rb3.getText().toString();
//                Log.d("3 = ",""+selectedRadioButtonId3);
////                }
                if (selectedRadioButtonId1 >= 0 || selectedRadioButtonId2 >=0 || selectedRadioButtonId3 >=0){
                    guessDesease();
                }



               }
        });
        radioGroupsub1 = view.findViewById(R.id.radioGroupSymptom1);
        radioGroupsub2 = view.findViewById(R.id.radioGroupSymptom2);
        radioGroupsub3 = view.findViewById(R.id.radioGroupSymptom3);

        rbsys1sub1 = view.findViewById(R.id.sym1sub1);
        rbsys1sub2 = view.findViewById(R.id.sym1sub2);
        rbsys1sub3 = view.findViewById(R.id.sym1sub3);
        rbsys1sub4 = view.findViewById(R.id.sym1sub4);

        rbsys2sub1 = view.findViewById(R.id.sym2sub1);
        rbsys2sub2 = view.findViewById(R.id.sym2sub2);

        rbsys3sub1 = view.findViewById(R.id.sym3sub1);
        rbsys3sub2 = view.findViewById(R.id.sym3sub2);
        rbsys3sub3 = view.findViewById(R.id.sym3sub3);
        rbsys3sub4 = view.findViewById(R.id.sym3sub4);

        rbhome = view.findViewById(R.id.lump);
        rbcolor = view.findViewById(R.id.color);
        rbdischarge = view.findViewById(R.id.discharge);
        rbhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbsys1sub1.setVisibility(View.VISIBLE);
                rbsys1sub2.setVisibility(View.VISIBLE);
                rbsys1sub3.setVisibility(View.VISIBLE);
                rbsys1sub4.setVisibility(View.VISIBLE);

            }
        });
        rbcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbsys2sub1.setVisibility(View.VISIBLE);
                rbsys2sub2.setVisibility(View.VISIBLE);
            }
        });

        rbdischarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbsys3sub1.setVisibility(View.VISIBLE);
                rbsys3sub2.setVisibility(View.VISIBLE);
                rbsys3sub3.setVisibility(View.VISIBLE);
                rbsys3sub4.setVisibility(View.VISIBLE);

            }
        });

    }

    private void guessDesease() {


//       if (rb1text == 0){
//           breast = ++breast;
//       }
//        if (rb2text == 4){
//            breast = ++breast;
//        }
//        if (rb3text == 6){
//            breast = ++breast;
//        }
//
//        if (rb1text == 1){
//            cervix = ++cervix;
//        }
//        if (rb3text == 7){
//            cervix = ++cervix;
//        }
//
//        if (rb1text == 2){
//            lip = ++lip;
//        }
//        if (rb2text == 5){
//            lip = ++lip;
//        }
//        if (rb3text == 8){
//            lip = ++lip;
//        }
//
//        if (rb1text == 3){
//            vaginal = ++vaginal;
//        }
//        if (rb3text == 9){
//            vaginal = ++vaginal;
//        }
        Log.d("breast = ",""+breast);
        Log.d("vaginal = ",""+vaginal);
        Log.d("lip = ",""+lip);
        Log.d("cervix = ",""+cervix);
if (breast>1||vaginal>1||lip>1||cervix>1){
    int max = breast;
    String name = "breast";

    if (vaginal > max) {
        max = vaginal;
        name = "vaginal";
    }
    if (lip > max) {
        max = lip;
        name = "lip";
    }
    if (cervix > max) {
        max = cervix;
        name = "cervix";
    }
    Log.d("desease : ", name + " = count = " + max);
    Intent i = new Intent(getContext(), DiseaseActivity.class);
    i.putExtra("desease", name);
    startActivity(i);
    getActivity().finish();
}else {
    if (breast == vaginal && vaginal == lip || vaginal == lip && lip == cervix || breast == vaginal && vaginal == cervix || breast == lip && lip == cervix) {
        //ABC || BCD || ABD || ACD
        Toast.makeText(getActivity(), "Cannot identify the desease please reselect the symptons",
                Toast.LENGTH_LONG).show();
    }

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        initLayout(view);

        return view;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if (checkedId == R.id.sym1sub1){
            breast = breast+1;
        }
        if (checkedId == R.id.sym1sub2){
            cervix = cervix+1;
        }
        if (checkedId == R.id.sym1sub3){
            lip = lip+1;
        }
        if (checkedId == R.id.sym1sub4){
            vaginal = vaginal+1;
        }



        if (checkedId == R.id.sym2sub1){
            breast = breast+1;
        }
        if (checkedId == R.id.sym2sub2){
            lip = lip+1;
        }


        if (checkedId == R.id.sym3sub1){
            breast = breast+1;
        }
        if (checkedId == R.id.sym3sub2){
            cervix = cervix+1;
        }
        if (checkedId == R.id.sym3sub3){
            lip = lip+1;
        }
        if (checkedId == R.id.sym3sub4){
            vaginal = vaginal+1;
        }
    }
}