package org.example.java_fundamentals._08_arrayLists._01_product;

public class Product {
    private int productId;
    private String productName;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String  productName){
        this.productName = productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void productDetails(){
        System.out.println("Product id: "+productId+", Product Name: "+productName+", Product price: "+ price);
    }











}
