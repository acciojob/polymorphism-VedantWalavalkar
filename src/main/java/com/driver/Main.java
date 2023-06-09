package com.driver;

public class Main {
    static class Product{
        Product(){
        }
//        private int x, y, z;
        public int product(int x, int y){
//            this.x = x;
//            this.y = y;
//
            return x*y;
        }
        public int product(int x, int y, int z){
//            this.x = x;
//            this.y = y;
//            this.z = z;

            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(1,2,3);
        p.product(1.0,2.0);
    }
}