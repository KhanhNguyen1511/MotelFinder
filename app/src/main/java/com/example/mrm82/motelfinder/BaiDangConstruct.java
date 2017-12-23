package com.example.mrm82.motelfinder;

/**
 * Created by mrm82 on 23/12/2017.
 */

public class BaiDangConstruct {

    String postID;
    String postTitle;
    String postType;
    String postTime;
    String postContent;
    String postAddress;
    String postArea;
    String postPrice;

    public BaiDangConstruct() {
    }

    public BaiDangConstruct(String postID, String postTitle, String postType, String postTime, String postContent, String postAddress, String postArea, String postPrice) {
        this.postID = postID;
        this.postTitle = postTitle;
        this.postType = postType;
        this.postTime = postTime;
        this.postContent = postContent;
        this.postAddress = postAddress;
        this.postArea = postArea;
        this.postPrice = postPrice;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getPostArea() {
        return postArea;
    }

    public void setPostArea(String postArea) {
        this.postArea = postArea;
    }

    public String getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(String postPrice) {
        this.postPrice = postPrice;
    }
}
