package com.example.desktop.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements
        AdapterView.OnItemSelectedListener {

    String[] options = { "(March 21-April 19)","(April 20-May 20)"," (May 21-June 20)","(June 21-July 22)","(July 23-August 22)","(August 23-September 22)"," (September 23-October 22)","(October 23-November 21)"," (November 22-December 21)","(December 22-January 19)","(January 20 to February 18)","(February 19 to March 20)", };
    TextView t1,t2;
    Spinner spin;
    ImageView i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        spin = (Spinner) findViewById(R.id.spinner1);
        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text2);
        i1 = (ImageView) findViewById(R.id.image1);
        i2 = (ImageView) findViewById(R.id.image2);

        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the Recipie list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,options);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {

        switch(position) {
            case(0): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aries);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("Look forward to success, praise, and pleasure, Aries!\n Settle down and work relentlessly toward career and self-improvement goals.\n  Prepare to rule! ");
                break;}
            case(1): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.taurus);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("Your goals and aspirations will not be denied.\nDon't be reluctant to make a big change if needed.\nRelationships benefit from extra attention.  ");
                break;}
            case(2): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.gemini);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("You'll have the chance to connect with more people\n and engage in more new situations as never before.\n Begin exploring new avenues in life.");

                break;}
            case(3): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.cancer);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("If it's work, family, finances, love, or anything else,\n there will be a planet ready to give you a hand. \nYou'll always have the skills and instincts to keep everything in balance and working smoothly. ");
                break;}
            case(4): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.leo);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("The year 2018 blazes with energy, challenges, and\n opportunities of the most practical and far-reaching kind.\nPlan and proceed wisely. Push slightly less hard now, give more thought before taking action.  ");
                break;}
            case(5): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.virgo);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("Virgo, 2018 is your year to get intense! Intensity has its ups and downs, \nand you can make the most of the ups while coping skillfully with any downs.\n This intensity colors your whole year. ");
                break;}
            case(6): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.libra);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("The focus is on you for 2018, Libra.\n Be prepared for people to look to you for advice and leadership.\n It will be easy and it will come naturally, so relax and enjoy the attention.");
                break;}
            case(7): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scorpio);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("You're a powerful person and a force of nature in 2018, Scorpio! \nOnce you decide on a plan of action, nothing and no one will be able to slow you down.\nYour intensity could scare people away. ");
                break;}
            case(8): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sagittarius);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("You will keep  going full blast in the direction that moves you forward.\n There is no time to waste in 2018. \nYou have big things to do, people to see, and places to go..  ");
                break;}
            case(9): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.capricorn);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("Life makes more and better sense in 2018, Capricorn.\n A clearer perspective will make it much easier to achieve your goals and dreams. ");
                break;}
            case(10): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aquarius);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("The year 2018 is full of changes, Aquarius, and they all make you more influential and important.\n You may not always take yourself seriously, but please take what you do seriously, and see great progress and success this year. ");
                break;}
            case(11): {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.pisces);
                i2.startAnimation(animation);
                animation.setFillAfter(true);
                t2.setText("The year 2018 is one for hard work, Pisces, and the stars are working hard for you.\nFundamental daily life issues will be handled promptly and easily. ");
                break;}


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }


}