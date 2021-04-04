package com.example.miwokapp;

public class Word {
  private   String miwokTranslation;
  private    String defaultTranslation;
  private  int resImageId=-1;
  private  int resSoundId;

    public Word( String defaultTranslation,String miwokTranslation,int resSoundId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.resSoundId =resSoundId;
    }

    public int getResSoundId() {
        return resSoundId;
    }

    public void setResSoundId(int resSoundId) {
        this.resSoundId = resSoundId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resImageId, int resSoundId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.resImageId = resImageId;
        this.resSoundId =resSoundId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public int getResImageId() {
        return resImageId;
    }

    public void setResImageId(int resImageId) {
        this.resImageId = resImageId;
    }
    public boolean hasImage(){
        return resImageId !=-1;

    }
}
