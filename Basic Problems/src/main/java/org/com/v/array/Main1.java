package org.com.v.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main1 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String>i=list.iterator();

        list.stream().forEach(s-> System.out.println(s));


//        for(String s:list){
//            if(s.equals("B")){
//                list.remove(s);
//            }
//        }


        while(i.hasNext()){
            System.out.println(i.next());
            String remove=i.next();
            if(remove.equals("B")){
                i.remove();
            }
        }

        list.stream().forEach(s-> System.out.println(s));


    }
}
