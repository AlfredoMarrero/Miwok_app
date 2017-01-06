package com.example.android.miwok;

/**
 * Created by alfred on 1/3/17.
 */

public class Word {

    private String miwokTranslation;
    private String englishTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String miwok, String english){
        miwokTranslation = miwok;
        englishTranslation = english;
    }

    public Word(String miwok, String english, int image){
        miwokTranslation = miwok;
        englishTranslation = english;
        imageResourceId = image;
    }

    public String getEnglishTranslation(){
        return englishTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public Boolean hasAnImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
