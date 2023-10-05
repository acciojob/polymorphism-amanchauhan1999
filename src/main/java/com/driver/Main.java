package com.driver;

public class Main {
    public static void main(String[] args) {


        Product p = new Product();

        int ans1 = p.product(4, 5);
        int ans2 = p.product(4, 5, 6);
        double ans = p.product(7.66, 96.22);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans);

    }
    public static class Product {

        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
}