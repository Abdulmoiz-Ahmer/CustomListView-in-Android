package com.example.aceahmer.taskthree;

import java.io.Serializable;

public class ModelClass implements Serializable{
    String Cname,Mname;
    int image;

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    String review;
    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ModelClass(String cname, String mname, int image, String review) {
        Cname = cname;
        Mname = mname;
        this.image = image;
        this.review = review;
    }
}
