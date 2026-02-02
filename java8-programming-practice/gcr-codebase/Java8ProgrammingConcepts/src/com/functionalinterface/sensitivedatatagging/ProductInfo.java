package com.functionalinterface.sensitivedatatagging;

class ProductInfo {
    private String productName;

    public ProductInfo(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductInfo{productName='" + productName + "'}";
    }
}
