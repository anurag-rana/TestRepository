package com.example.ansh.myapplication.RvFiles;

/**
 * Created by ansh on 18/10/17.
 */

public class RVdata {
    String title,message,imageUrl;

    public RVdata(String title, String message, String imageUrl) {
        this.title = title;
        this.message = message;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {

        return "RVdata{" +
                "title='" + title + " \n" +
                ", message='" + message + " \n" +
                ", imageUrl='" + imageUrl + " \n" +
                '}'
                +"\n============================\n";
    }
}
