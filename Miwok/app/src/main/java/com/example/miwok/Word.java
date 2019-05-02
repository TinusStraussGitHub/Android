package com.example.miwok;

public class Word {

    private String mEnglishWord;
    private String mMiwokWord;
    private int mImageSourceResourceId;

    public Word(String EnglishWord, String MiwokWord) {
        this.mEnglishWord = EnglishWord;
        this.mMiwokWord = MiwokWord;
    }

    public Word(String EnglishWord, String MiwokWord,int ImageResourceId) {
        this.mEnglishWord = EnglishWord;
        this.mMiwokWord = MiwokWord;
        this.mImageSourceResourceId = ImageResourceId;
    }

    public String getEnglishWord() {
        return this.mEnglishWord;
    }

    public String getMiwokWord() {
        return this.mMiwokWord;
    }


    public int getImageResouceId() {
        return this.mImageSourceResourceId;
    }
}
