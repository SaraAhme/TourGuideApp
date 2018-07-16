package com.example.android.miwok;

public class Word {
    private int mDefaultTranslationId;
    private int mMiwokTranslationId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(int defaultTranslationId, int miwokTranslationId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
    }
    public Word(int defaultTranslationId, int miwokTranslationId, int imageResourceId
    ) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mImageResourceId = imageResourceId;
    }
    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    public int getMiwokTranslationId() {
        return mMiwokTranslationId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}