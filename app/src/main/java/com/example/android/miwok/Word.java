package com.example.android.miwok;

/**
 * Created by alfred on 1/3/17.
 */

public class Word {

    private String miwokTranslation;
    private String englishTranslation;

    public Word(String miwok, String english){
        miwokTranslation = miwok;
        englishTranslation = english;
    }

    public String getEnglishTranslation(){
        return englishTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }
}
