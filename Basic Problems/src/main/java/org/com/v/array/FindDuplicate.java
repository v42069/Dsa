package org.com.v.array;

import java.util.*;

public class FindDuplicate {

    public static void main(String[] args) {
        int []arr={1,1,2,3,4,5,6,6,6};
//        System.out.println(usingHashSet(arr));
//        countDuplicateUsingHashMap(arr);

        withoutExtraSpaceBasic(arr);
    }

    static int usingHashSet(int []arr){
        HashSet<Integer>set=new HashSet<>();
        int duplicate=-1;

        for(int num:arr){
            if(set.contains(num)){
                duplicate=num;
                return duplicate;
            }
            set.add(num);
        }
        return duplicate;
    }

    static void countDuplicateUsingHashMap(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> dup=new ArrayList<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1 );
        }
        System.out.println(map);

//        for(Map.Entry<Integer,Integer>value:map.entrySet()){
//            if9
//        }
        for(int dupNum:map.keySet()){
            if(map.get(dupNum)>1){
                dup.add(dupNum);
            }
        }
        System.out.println(dup);
    }

    static void withoutExtraSpaceBasic(int []arr){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
                i++;
            }
        }

    }
}
