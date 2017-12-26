package com.example.adarshkumar.recycleviewbook;



public class ListItem {
    private String head;
    private String desc;
    private String imageurl;

    public ListItem(String head, String desc, String imageurl) {
        this.head = head;
        this.desc = desc;
        this.imageurl = imageurl;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageurl() {
        return imageurl;
    }
}
