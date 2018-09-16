package com.pelmen.Odds;

public class Odds {

    public static int[] OddsShow(int numb){
        int length = numb/2;
        int[] arr = new int[length];
        int counter = 0;
        for (int i=0; i<numb; i++){
            if(i%2 != 0){
                arr[counter]=i;
                counter++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = OddsShow(9);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
