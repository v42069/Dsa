package org.com.v.array;

import java.util.HashSet;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] num = {1, 2, 5, 4, 6, 7, 8, 9};

//        int missingNum =bruteForce(num);

        int missingNum=usingHashSet(num);

        System.out.println(missingNum);


    }

    static int bruteForce(int []num){

        int missingNum=-1;


        for (int i = 1; i < num.length; i++) {
            boolean found = false;
            for (int miss : num) {
                if (miss == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNum = i;
            }
        }
        return missingNum;

    }

    static int usingHashSet(int[] arr){
        HashSet<Integer> s=new HashSet<>();
        int missingNum=-1;

        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(int i=1;i<s.size();i++){
            if(!s.contains(i)){
                missingNum=i;
                return missingNum;
            }
        }
        return -1;
    }
}

