package com.example.dowkk.apply11streetapi.search;

import android.os.Bundle;

public class Firebase_data extends Product{

    Product DB_data = new Product();

    private String productCode;
    private String productName;
    private String productPrice;
    private String id;

    public void onCreate(Bundle savedInstanceState) {
        productName = DB_data.getProductName();
        productCode = DB_data.getProductCode();
        productPrice = DB_data.getProductPrice();
    }


}
