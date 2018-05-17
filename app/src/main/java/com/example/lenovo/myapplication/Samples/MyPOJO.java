
package com.example.lenovo.myapplication.Samples;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyPOJO {

    @SerializedName("success")
    @Expose
    private Integer success;
    @SerializedName("catdetail")
    @Expose
    private List<Catdetail> catdetail = null;
    @SerializedName("productdetail")
    @Expose
    private List<Productdetail> productdetail = null;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public List<Catdetail> getCatdetail() {
        return catdetail;
    }

    public void setCatdetail(List<Catdetail> catdetail) {
        this.catdetail = catdetail;
    }

    public List<Productdetail> getProductdetail() {
        return productdetail;
    }

    public void setProductdetail(List<Productdetail> productdetail) {
        this.productdetail = productdetail;
    }

}
