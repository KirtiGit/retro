
package com.example.lenovo.myapplication.Samples;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Catdetail {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("images")
    @Expose
    private String images;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

}
