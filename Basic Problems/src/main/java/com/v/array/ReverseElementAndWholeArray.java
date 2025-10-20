package com.v.array;
//reverse elements and whole array
public class ReverseElementAndWholeArray {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] a = {54, 12, 36, 94};
        for(int i=0;i<a.length;i++){
            int rev=rev(a[i]);
            a[i]=rev;
        }
        int s=0,e=a.length-1;
        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
        for(int i:a){
            System.out.println(i);
        }
    }
    static int rev(int i){
        int temp=i;
        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return rev;
    }
}
