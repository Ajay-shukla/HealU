package com.codeclays.cancercare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DiseaseActivity extends AppCompatActivity implements View.OnClickListener {


    Button d1b1,d1b2,d1b3;
    Button d2b1,d2b2,d2b3;
    Button d3b1,d3b2,d3b3;
    Button d4b1,d4b2,d4b3;
    LinearLayout disease1linear,layoutd1f,layoutd1symp,layoutd1stage;
    LinearLayout disease2linear,layoutd2f,layoutd2symp,layoutd2stage;
    LinearLayout disease3linear,layoutd3f,layoutd3symp,layoutd3stage;
    LinearLayout disease4linear,layoutd4f,layoutd4symp,layoutd4stage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        initLayout();
        String name = getIntent().getStringExtra("desease");

        if (name.equalsIgnoreCase("breast")){
            disease1linear.setVisibility(View.VISIBLE);

        }else if(name.equalsIgnoreCase("vaginal")){
            disease4linear.setVisibility(View.VISIBLE);

        }else if(name.equalsIgnoreCase("lip")){
            disease3linear.setVisibility(View.VISIBLE);

        }else if(name.equalsIgnoreCase("cervix")){
            disease2linear.setVisibility(View.VISIBLE);

        }

    }

    private void initLayout() {
        disease1linear = findViewById(R.id.disease1linear);
        layoutd1f = findViewById(R.id.layoutd1f);
        layoutd1symp = findViewById(R.id.layoutd1symp);
        layoutd1stage = findViewById(R.id.layoutd1stage);

        disease2linear = findViewById(R.id.disease2linear);
        layoutd2f = findViewById(R.id.layoutd2f);
        layoutd2symp = findViewById(R.id.layoutd2symp);
        layoutd2stage = findViewById(R.id.layoutd2stage);

        disease3linear = findViewById(R.id.disease3linear);
        layoutd3f = findViewById(R.id.layoutd3f);
        layoutd3symp = findViewById(R.id.layoutd3symp);
        layoutd3stage = findViewById(R.id.layoutd3stage);

        disease4linear = findViewById(R.id.disease4linear);
        layoutd4f = findViewById(R.id.layoutd4f);
        layoutd4symp = findViewById(R.id.layoutd4symp);
        layoutd4stage = findViewById(R.id.layoutd4stage);

        d1b1 =  findViewById(R.id.d1b1);
        d1b2 =  findViewById(R.id.d1b2);
        d1b3 =  findViewById(R.id.d1b3);
        d1b1.setOnClickListener(this);
        d1b2.setOnClickListener(this);
        d1b3.setOnClickListener(this);


        d2b1 =  findViewById(R.id.d2b1);
        d2b2 =  findViewById(R.id.d2b2);
        d2b3 =  findViewById(R.id.d2b3);
        d2b1.setOnClickListener(this);
        d2b2.setOnClickListener(this);
        d2b3.setOnClickListener(this);

        d3b1 =  findViewById(R.id.d3b1);
        d3b2 =  findViewById(R.id.d3b2);
        d3b3 =  findViewById(R.id.d3b3);
        d3b1.setOnClickListener(this);
        d3b2.setOnClickListener(this);
        d3b3.setOnClickListener(this);

        d4b1 =  findViewById(R.id.d4b1);
        d4b2 =  findViewById(R.id.d4b2);
        d4b3 =  findViewById(R.id.d4b3);
        d4b1.setOnClickListener(this);
        d4b2.setOnClickListener(this);
        d4b3.setOnClickListener(this);

    }

    @SuppressLint({"UseCompatLoadingForDrawables", "NonConstantResourceId"})
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.d1b1:
                if (layoutd1f.getVisibility() == View.VISIBLE) {
                    layoutd1f.setVisibility(View.GONE);
                    d1b1.setBackground(d1b1.getContext().getResources().getDrawable(R.drawable.down));
                } else {
                    layoutd1f.setVisibility(View.VISIBLE);
                    d1b1.setBackground(d1b1.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
            case R.id.d1b2:
                if (layoutd1symp.getVisibility() == View.VISIBLE) {
                    layoutd1symp.setVisibility(View.GONE);
                    d1b2.setBackground(d1b2.getContext().getResources().getDrawable(R.drawable.down));
                } else {
                    layoutd1symp.setVisibility(View.VISIBLE);
                    d1b2.setBackground(d1b2.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
            case R.id.d1b3:
                if (layoutd1stage.getVisibility() == View.VISIBLE) {
                    layoutd1stage.setVisibility(View.GONE);
                    d1b3.setBackground(d1b3.getContext().getResources().getDrawable(R.drawable.down));
                }else {
                    layoutd1stage.setVisibility(View.VISIBLE);
                    d1b3.setBackground(d1b3.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;


            case R.id.d2b1:
                if (layoutd2f.getVisibility() == View.VISIBLE) {
                    layoutd2f.setVisibility(View.GONE);
                    d2b1.setBackground(d2b1.getContext().getResources().getDrawable(R.drawable.down));
                } else {
                    layoutd2f.setVisibility(View.VISIBLE);
                    d2b1.setBackground(d2b1.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
            case R.id.d2b2:
                if (layoutd2symp.getVisibility() == View.VISIBLE) {
                    layoutd2symp.setVisibility(View.GONE);
                    d2b2.setBackground(d2b2.getContext().getResources().getDrawable(R.drawable.down));
                } else {
                    layoutd2symp.setVisibility(View.VISIBLE);
                    d2b2.setBackground(d2b2.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
            case R.id.d2b3:
                if (layoutd2stage.getVisibility() == View.VISIBLE) {
                    layoutd2stage.setVisibility(View.GONE);
                    d2b3.setBackground(d2b3.getContext().getResources().getDrawable(R.drawable.down));
                }else {
                    layoutd2stage.setVisibility(View.VISIBLE);
                    d2b3.setBackground(d2b3.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;

            case R.id.d3b1:
                if (layoutd3f.getVisibility() == View.VISIBLE) {
                    layoutd3f.setVisibility(View.GONE);
                    d3b1.setBackground(d3b1.getContext().getResources().getDrawable(R.drawable.down));
                } else {
                    layoutd3f.setVisibility(View.VISIBLE);
                    d3b1.setBackground(d3b1.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
            case R.id.d3b2:
                if (layoutd3symp.getVisibility() == View.VISIBLE) {
                    layoutd3symp.setVisibility(View.GONE);
                    d3b2.setBackground(d3b2.getContext().getResources().getDrawable(R.drawable.down));
                } else {
                    layoutd3symp.setVisibility(View.VISIBLE);
                    d3b2.setBackground(d3b2.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
            case R.id.d3b3:
                if (layoutd3stage.getVisibility() == View.VISIBLE) {
                    layoutd3stage.setVisibility(View.GONE);
                    d3b3.setBackground(d3b3.getContext().getResources().getDrawable(R.drawable.down));
                }else {
                    layoutd3stage.setVisibility(View.VISIBLE);
                    d3b3.setBackground(d3b3.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;



            case R.id.d4b1:
                if (layoutd4f.getVisibility() == View.VISIBLE) {
                    layoutd4f.setVisibility(View.GONE);
                    d4b1.setBackground(d4b1.getContext().getResources().getDrawable(R.drawable.down));
                } else {
                    layoutd4f.setVisibility(View.VISIBLE);
                    d4b1.setBackground(d4b1.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
            case R.id.d4b2:
                if (layoutd4symp.getVisibility() == View.VISIBLE) {
                    layoutd4symp.setVisibility(View.GONE);
                    d4b2.setBackground(d4b2.getContext().getResources().getDrawable(R.drawable.down));
                } else {
                    layoutd4symp.setVisibility(View.VISIBLE);
                    d4b2.setBackground(d4b2.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
            case R.id.d4b3:
                if (layoutd4stage.getVisibility() == View.VISIBLE) {
                    layoutd4stage.setVisibility(View.GONE);
                    d4b3.setBackground(d4b3.getContext().getResources().getDrawable(R.drawable.down));
                }else {
                    layoutd4stage.setVisibility(View.VISIBLE);
                    d4b3.setBackground(d4b3.getContext().getResources().getDrawable(R.drawable.ic_up));
                }
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent accountsIntent = new Intent(DiseaseActivity.this, MainActivity.class);
        startActivity(accountsIntent);
    }
}