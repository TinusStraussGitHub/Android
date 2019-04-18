package com.example.miwok;

public class Word {

    private String englishWord;
    private String miwokWord;

    public Word(String EnglishWord, String MiwokWord)
    {
        this.englishWord = EnglishWord;
        this.miwokWord = MiwokWord;
    }

    public String getEnglishWord()
    {
        return this.englishWord;
    }

    public String getMiwokWord()
    {
        return this.miwokWord;
    }
}
