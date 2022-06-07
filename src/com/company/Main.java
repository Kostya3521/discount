package com.company;


import java.util.Arrays;

public class Main {

    static public int[] decryptData(int[] price, int discount, int offset, int readLength) {
        int[] res = new int[readLength];
        double temp;
        int indx = 0;
        if ( (price.length != 0) & (0 <= offset) & (1 <= discount & discount <= 99)
                & (readLength > 0 & readLength <= price.length - offset) ){
            for (int i = offset; i < offset + readLength; i++){
                temp = (double) price[i] - ((double) price[i] * ((double)discount  / 100));
                res[indx] = (int) Math.floor(temp) ;
                indx++;
            }
        }else {
            System.out.println("Некоректные данные");
            return null;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] price = {10, 20, 33, 40, 60};
        int discount = 50;
        int offset = 1;
        int readLength = 0;
        System.out.println(Arrays.toString(decryptData(price, discount, offset, readLength)));
    }



}
