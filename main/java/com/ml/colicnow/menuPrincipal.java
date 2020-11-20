package com.ml.colicnow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.HashMap;

public class menuPrincipal extends AppCompatActivity {

    public ViewPager viewPager;
    public TabLayout tabLayout;

    public RadioButton r11,r12,r21,r22,r31,r32,r41,r42, r51,r52,r61,r62,r71,r72,r81,r82;

    public Button button;

    private Integer[] intList;
    private Integer[] checkList;

    private int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        intList = new Integer[8];
        checkList = new Integer[8];

        viewPager = (ViewPager) findViewById(R.id.viewPagerMenu);
        tabLayout = (TabLayout) findViewById(R.id.tabLayoutMenu);

        tabLayout.addOnTabSelectedListener(tabSelectedListener);

        viewPager.setAdapter(new myAdapter());
        viewPager.addOnPageChangeListener(pageChangeListener);

    }


//----------------------------- PAGER ADAPTER ------------------------------------------------------------------------------------------------------

    public class myAdapter extends PagerAdapter{

        LayoutInflater layoutInflater;

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return (view == (LinearLayout) object);

        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View one = (View) layoutInflater.inflate(R.layout.activity_sobre, container, false);
            View two = (View) layoutInflater.inflate(R.layout.activity_exame, container, false);
            View three = (View) layoutInflater.inflate(R.layout.activity_ref, container, false);
            View fourth = (View) layoutInflater.inflate(R.layout.activity_saiba_mais, container, false);
            View viewarray[] = {one, two, three, fourth};
            container.addView(viewarray[position]);

            return viewarray[position];

        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((LinearLayout) object);
        }

    }

//----------------------------- TAB LISTENER -----------------------------------------------------------------------

    TabLayout.OnTabSelectedListener tabSelectedListener = new TabLayout.OnTabSelectedListener(){

        @Override
        public void onTabSelected(TabLayout.Tab tab) {

            switch (tab.getPosition()) {

                case 0:
                    viewPager.setCurrentItem(0);
                    break;
                case 1:
                    viewPager.setCurrentItem(1);
                    break;
                case 2:
                    viewPager.setCurrentItem(2);
                    break;
                case 3:
                    viewPager.setCurrentItem(3);
                    break;
            }
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };

//----------------------------- PAGE CHANGE -----------------------------------------------------------------------

    public ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener(){

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            tabLayout.getTabAt(position).select();

            if (position == 1){

                r11 = (RadioButton) findViewById(R.id.radio11);
                r12 = (RadioButton) findViewById(R.id.radio12);
                r21 = (RadioButton) findViewById(R.id.radio21);
                r22 = (RadioButton) findViewById(R.id.radio22);
                r31 = (RadioButton) findViewById(R.id.radio31);
                r32 = (RadioButton) findViewById(R.id.radio32);
                r41 = (RadioButton) findViewById(R.id.radio41);
                r42 = (RadioButton) findViewById(R.id.radio42);
                r51 = (RadioButton) findViewById(R.id.radio51);
                r52 = (RadioButton) findViewById(R.id.radio52);
                r61 = (RadioButton) findViewById(R.id.radio61);
                r62 = (RadioButton) findViewById(R.id.radio62);
                r71 = (RadioButton) findViewById(R.id.radio71);
                r72 = (RadioButton) findViewById(R.id.radio72);
                r81 = (RadioButton) findViewById(R.id.radio81);
                r82 = (RadioButton) findViewById(R.id.radio82);

                button = (Button) findViewById(R.id.buttonAnalisar);

                r11.setOnClickListener(onClickListener);
                r12.setOnClickListener(onClickListener);
                r21.setOnClickListener(onClickListener);
                r22.setOnClickListener(onClickListener);
                r31.setOnClickListener(onClickListener);
                r32.setOnClickListener(onClickListener);
                r41.setOnClickListener(onClickListener);
                r42.setOnClickListener(onClickListener);
                r51.setOnClickListener(onClickListener);
                r52.setOnClickListener(onClickListener);
                r61.setOnClickListener(onClickListener);
                r62.setOnClickListener(onClickListener);
                r71.setOnClickListener(onClickListener);
                r72.setOnClickListener(onClickListener);
                r81.setOnClickListener(onClickListener);
                r82.setOnClickListener(onClickListener);

                button.setOnClickListener(onClickListener);

            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

//----------------------------- ON CLICK -----------------------------------------------------------------------

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.radio11:
                    checkList[0] =1;
                    intList[0]=1;
                    break;
                case R.id.radio12:
                    checkList[0] =1;
                    intList[0]=2;
                    break;
                case R.id.radio21:
                    checkList[1] =1;
                    intList[1]=1;
                    break;
                case R.id.radio22:
                    checkList[1] =1;
                    intList[1]=2;
                    break;
                case R.id.radio31:
                    checkList[2] =1;
                    intList[2]=1;
                    break;
                case R.id.radio32:
                    checkList[2] =1;
                    intList[2]=2;
                    break;
                case R.id.radio41:
                    checkList[3] =1;
                    intList[3]=1;
                    break;
                case R.id.radio42:
                    checkList[3] =1;
                    intList[3]=2;
                    break;
                case R.id.radio51:
                    checkList[4] =1;
                    intList[4]=1;
                    break;
                case R.id.radio52:
                    checkList[4] =1;
                    intList[4]=2;
                    break;
                case R.id.radio61:
                    checkList[5] =1;
                    intList[5]=1;
                    break;
                case R.id.radio62:
                    checkList[5] =1;
                    intList[5]=2;
                    break;
                case R.id.radio71:
                    checkList[6] =1;
                    intList[6]=1;
                    break;
                case R.id.radio72:
                    checkList[6] =1;
                    intList[6]=2;
                    break;
                case R.id.radio81:
                    checkList[7] =1;
                    intList[7]=1;
                    break;
                case R.id.radio82:
                    checkList[7] =1;
                    intList[7]=2;
                    break;

                case R.id.buttonAnalisar:

                    boolean empty = true;
                    for (int i=0; i<checkList.length; i++) {
                        if (checkList[i] != null) {
                            empty = false;
                            break;
                        }
                    }

                    if(empty) {

                        Toast.makeText(getBaseContext(), "Favor preencher todos os campos", Toast.LENGTH_LONG).show();

                    }else{

                        try{

                            for (int elements : intList) {
                                resultado = resultado + elements;
                            }

                            float score = Math.round(resultado /8);
                            String resultadoString;

                            if(score == 1){
                                resultadoString = "Clínico ";
                            }else{
                                resultadoString = "Cirúrgico ";
                            }





                            Toast.makeText(getBaseContext(), resultadoString, Toast.LENGTH_LONG).show();

                        }catch(Exception e){

                            Toast.makeText(getBaseContext(), "Favor preencher todos os campos", Toast.LENGTH_LONG).show();

                        }
                    }
                    break;
            }
        }
    };
}