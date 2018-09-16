package com.pelmen.Reverse_Digits;

public class ReversDigits {

    public static void reversDigit(int digit){
        boolean sign = false;

        if(digit<0){
            sign = true;
            digit*=-1;
        }

        int length = (int)(Math.log10(digit)+1);

        int counter=0;
        while(digit>0){
            if(digit%10 == 0){
                digit/=10;
                length--;
                continue;
            }
            break;
        }
        int[] arr = new int [length];
        while(digit>0){
            if(length==1){
                arr[counter]=digit;
                break;
            }
            arr[counter]=digit%10;
            digit/=10;
            length--;
            counter++;
        }

        int result=0;
        counter = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            result+=arr[i]*counter;
            System.out.println(arr[i]*counter);
            counter*=10;
        }

        if(sign == true){
            result*=-1;
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        reversDigit(-23400000);
    }
}
