package com.example.android.miwok;

/**
 * Created by USER on 5/18/2017.
 */

public class Number {

    //Default translation for the word

    private String mDefaultTranslation;

    // Miwok translation for the word

    private String mMiwokTranslation;

    // Create a new object word

    public Number(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;
    }

    // Get the English translation of the word

    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    // Get the Milwok translation of the word

    public String getmMiwokTranslation() {

        return mMiwokTranslation;

    }

}
