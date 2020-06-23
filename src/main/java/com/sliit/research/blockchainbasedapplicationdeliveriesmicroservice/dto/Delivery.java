package com.sliit.research.blockchainbasedapplicationdeliveriesmicroservice.dto;

import java.util.Date;

public class Delivery {
    private Long id;

    private User user;
    private Date date;

    private Product product;

    private float qty;
    private String origin;
    private String destination;

    private Double deliveryCharge;

    private String remarks;
    private DeliveryRoute deliveryRoute;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(Double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public DeliveryRoute getDeliveryRoute() {
        return deliveryRoute;
    }

    public void setDeliveryRoute(DeliveryRoute deliveryRoute) {
        this.deliveryRoute = deliveryRoute;
    }
}
