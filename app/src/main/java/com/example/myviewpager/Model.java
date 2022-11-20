package com.example.myviewpager;

public class Model {

    private final int imageResource;
    private final String creator;
    private final int likes;

    public Model(int imageResource, String creator, int likes) {
        this.imageResource = imageResource;
        this.creator = creator;
        this.likes = likes;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getCreator() {
        return creator;
    }

    public int getLikes() {
        return likes;
    }
}
