
package com.example.lenovo.myapplication.Samples;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Productdetail {

    @SerializedName("list")
    @Expose
    private java.util.List<List> list = null;
    @SerializedName("catname")
    @Expose
    private String catname;

    public java.util.List<List> getList() {
        return list;
    }

    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

}
