package com.rovaindu.homeservice.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.rovaindu.homeservice.retrofit.models.ServiesUser;

import java.io.Serializable;
import java.util.List;

public class UserResponse {
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("cart_items_count")
    @Expose
    private Integer cartItemsCount;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("data")
    @Expose
    private ServiesUser data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCartItemsCount() {
        return cartItemsCount;
    }

    public void setCartItemsCount(Integer cartItemsCount) {
        this.cartItemsCount = cartItemsCount;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public ServiesUser getData() {
        return data;
    }

    public void setData(ServiesUser data) {
        this.data = data;
    }



}
