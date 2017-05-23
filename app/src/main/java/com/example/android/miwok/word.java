package com.example.android.miwok;

/**
 * Created by jsnkrm on 28/4/17.
 */

public class word {

    private String mDefaulTranslation;
    private String mMiwokTranslation;
    private int mMusicResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public int getmMusicResourceId() {
        return mMusicResourceId;
    }

    private int mImageResourceId = NO_IMAGE_PROVIDED ;

    public String getmDefaulTranslation() {
        return mDefaulTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmResourceId() {  return mImageResourceId;  }


    public word(String defaulTranslation, String miwokTranslation, int rId, int musicId)
    {
        mDefaulTranslation = defaulTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = rId;
        mMusicResourceId = musicId;
    }

    public word(String defaulTranslation, String miwokTranslation,int musicId)
    {
        mDefaulTranslation = defaulTranslation;
        mMiwokTranslation = miwokTranslation;
        mMusicResourceId = musicId;
    }

    public boolean hasImage()
    {
       return (mImageResourceId != NO_IMAGE_PROVIDED);
    }
}
