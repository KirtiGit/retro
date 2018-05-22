
package com.example.lenovo.myapplication.Samples;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyPOJOPARA {

    @SerializedName("OrderMoredetail")
    @Expose
    private List<OrderMoredetail> orderMoredetail = null;

    public List<OrderMoredetail> getOrderMoredetail() {
        return orderMoredetail;
    }

    public void setOrderMoredetail(List<OrderMoredetail> orderMoredetail) {
        this.orderMoredetail = orderMoredetail;
    }

}
