package com.driver;

public class Main {
    class Product{
        Product(){
        }
        public int product(int x, int y){
//            return x*y;
        }
        public int product(int x, int y, int z){
//            return x*y*z;
        }
        public double product(double x, double y){
//            return (double)(x*y);
        }
    }

    public void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(1,2,3);
        p.product(1.0,2.0);
    }
}