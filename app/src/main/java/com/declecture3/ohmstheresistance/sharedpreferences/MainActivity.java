package com.declecture3.ohmstheresistance.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;




public class MainActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "com.declecture3.ohmstheresistance.sharedpreferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To get shared preferences:
        SharedPreferences sharedPrefs = getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        //To put things inthe sharedPreferences:
        sharedPrefs.edit()
                .putString("Color", "White")
                .putBoolean("isFirstLaunch", true)
                .apply();


        //to GET things from sharedpreferences:
        String value = sharedPrefs.getString("Color", "DEFAULT");


        /*
        these lines are same as the sharedprefs.edit lines above (20 to 26)

       SharedPreferences.Editor editor = sharedPreds.edit();

       editor.putString("Color", "White");
       editor = null;
       editor.putBoolean(isFirstLaunch", true);
       editor.apply();


        */



    }
  /*
    //ways to save data(from fastest to slowest rate of saving your data) :

    1) OnSaveInstanceState
    What: Primitives
    Who can access: Activity
    ------------------------------------------------------------------------------------------------
    2) Shared Preferences
    What: Primitives
    Who: App
    ------------------------------------------------------------------------------------------------
    Database(SQL)
    What: primitives
    Who: app/anyone
    ------------------------------------------------------------------------------------------------
    Internal Storage
    What: Anything
    Who: App
    ------------------------------------------------------------------------------------------------
    External Storage
    What: Anything
    Who: Anyone
    ------------------------------------------------------------------------------------------------
    Cloud(firebase)
    What: Anything
    Who: Anyone
    ------------------------------------------------------------------------------------------------
 */
}
