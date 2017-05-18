package com.example.android.miwok;

/**
 * Created by USER on 5/18/2017.
 */

public class Phrase {

    //Default translation for the phrase

    private String mDefaultTranslation;

    // Miwok translation for the phrase

    private String mMiwokTranslation;

    // Create a new object phrase

    public Phrase(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;
    }
    // Get the English translation of the phrase

    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    // Get the Milwok translation of the phrase

    public String getmMiwokTranslation() {

        return mMiwokTranslation;


    }
}