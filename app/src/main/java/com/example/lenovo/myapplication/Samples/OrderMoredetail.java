
package com.example.lenovo.myapplication.Samples;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderMoredetail {

    @SerializedName("p_name")
    @Expose
    private String pName;
    @SerializedName("P_namehindi")
    @Expose
    private String pNamehindi;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("unit_type")
    @Expose
    private String unitType;
    @SerializedName("c_id")
    @Expose
    private String cId;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("product_price")
    @Expose
    private String productPrice;
    @SerializedName("p_code")
    @Expose
    private String pCode;

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getPNamehindi() {
        return pNamehindi;
    }

    public void setPNamehindi(String pNamehindi) {
        this.pNamehindi = pNamehindi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getCId() {
        return cId;
    }

    public void setCId(String cId) {
        this.cId = cId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getPCode() {
        return pCode;
    }

    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

}
