package com.example.android.miwok;

public class Word {

    /** defaulat translation of the word*/
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;
/** this is the constructon and it should have teh same name as the method **/
    public Word(String defaultTranslation , String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
        /**get the default translation of hte word*/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    /** Get the Miwok translation of hte word **/

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    }




