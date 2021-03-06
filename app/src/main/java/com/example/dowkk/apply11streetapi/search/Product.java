package com.example.dowkk.apply11streetapi.search;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Product {
    private String productCode;
    private String productName;
    private String productImage;
    private String productDetailUrl;
    private String productPrice;
    private String seller;
    private String rating;
    private String salePrice;
    private String delivery;
    private String reviewCount;
    private String buySatisfy;
    private String benefit;
    private String id;

//  private @ServerTimestamp Date timestamp; //에러이유 모르겠음
    @Override
    public String toString() {
        return "Product [productCode=" + productCode + ", productName=" + productName + ", productImage=" + productImage
                + ", productDetailUrl=" + productDetailUrl + ", productPrice=" + productPrice + ", seller=" + seller
                + ", rating=" + rating + ", salePrice=" + salePrice + ", delivery=" + delivery + ", reviewCount="
                + reviewCount + ", buySatisfy=" + buySatisfy + ", benefit=" + benefit + "]";
    }
    public Product(){}
    public Product(String productName, String productPrice, String productCode)
    {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetailUrl() {
        return productDetailUrl;
    }

    public void setProductDetailUrl(String productDetailUrl) {
        this.productDetailUrl = productDetailUrl;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(String reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getBuySatisfy() {
        return buySatisfy;
    }

    public void setBuySatisfy(String buySatisfy) {
        this.buySatisfy = buySatisfy;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public void setId(String id) {
        this.id = id;
    }
}
