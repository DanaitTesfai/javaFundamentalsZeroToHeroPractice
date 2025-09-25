package org.example.java_fundamentals._08_arrayLists._01_product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        p1.setProductId(01);
        p1.setProductName("Product 1");
        p1.setPrice(111);
        products.add(p1);

        Product p2 = new Product();
        p2.setProductId(02);
        p2.setProductName("Product 2");
        p2.setPrice(222);
        products.add(p2);

        Product p3 = new Product();
        p3.setProductId(03);
        p3.setProductName("Product 3");
        p3.setPrice(333);
        products.add(p3);

        Product p4 = new Product();
        p4.setProductId(04);
        p4.setProductName("Product 4");
        p4.setPrice(444);
        products.add(p4);

        Product p5 = new Product();
        p5.setProductId(05);
        p5.setProductName("Product 5");
        p5.setPrice(555);
        products.add(p5);

        for (Product p : products){
            p.productDetails();
        }

        System.out.print("Enter a product name: ");
        String newProduct = sc.nextLine();

        boolean isFound = false;
        for (Product p : products){
            if (p.getProductName().equals(newProduct)){
                p.productDetails();
                isFound = true;
                break;
            }

        }
        if (!isFound){
            System.out.println("Product not found!");
        }







    }
}
