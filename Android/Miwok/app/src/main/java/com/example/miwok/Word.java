package com.example.miwok;

public class Word {
    private String miwokWord;
    private String defaultWord;
    private int imageResourceId = -1;
    private int audioResourceId;

    public Word(String miwokWord, String defaultWord, int audioResourceId) {
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
        this.audioResourceId = audioResourceId;
    }

    public Word(String miwokWord, String defaultWord, int imageResourceId, int audioResourceId) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.imageResourceId =imageResourceId;
        this.audioResourceId = audioResourceId;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getImageResouceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != -1;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
