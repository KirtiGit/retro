
package com.example.lenovo.myapplication.Samples;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List {

    @SerializedName("p_name")
    @Expose
    private String pName;
    @SerializedName("p_image")
    @Expose
    private String pImage;

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getPImage() {
        return pImage;
    }

    public void setPImage(String pImage) {
        this.pImage = pImage;
    }

}
