package com.example.submissiondicoding;

public class TourData {
    private String headingSatu, caption, description;
    private int image;

    public TourData(String headingSatu, String caption, String description, int image) {
        this.headingSatu = headingSatu;
        this.caption = caption;
        this.description = description;
        this.image = image;
    }

    public TourData(){

    }

    public String getHeadingSatu() {
        return headingSatu;
    }


    public String getCaption() {
        return caption;
    }


    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

}
