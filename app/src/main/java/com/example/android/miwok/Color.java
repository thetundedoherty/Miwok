package com.example.android.miwok;

/**
 * Created by USER on 5/18/2017.
 */

public class Color {

    //Default translation for the color

     private String mDefaultTranslation;

    // Miwok translation for the color

     private String mMiwokTranslation;

    // Create a new object Color

    public Color(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;
          }
    // Get the English translation of the color

    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    // Get the Milwok translation of the color

    public String getmMiwokTranslation() {

        return mMiwokTranslation;
    }
}
