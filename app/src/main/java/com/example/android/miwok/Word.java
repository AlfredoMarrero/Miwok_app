package com.example.android.miwok;

/**
 * Created by alfred on 1/3/17.
 */

public class Word {

    private String miwokTranslation;
    private String englishTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int audioResourceId;


    public Word(String miwok, String english, int mediaId){
        miwokTranslation = miwok;
        englishTranslation = english;
        audioResourceId= mediaId;
    }

    public Word(String miwok, String english, int image, int mediaId){
        miwokTranslation = miwok;
        englishTranslation = english;
        imageResourceId = image;
        audioResourceId = mediaId;
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

    public int getAudioResourceId(){
        return audioResourceId;
    }

}
