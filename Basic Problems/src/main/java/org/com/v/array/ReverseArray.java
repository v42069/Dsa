package org.com.v.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

    public static void main(String[] args) {
        String s = "I love java";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);

        int[] arr = {1, 2, 3, 4, 5};

        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(collect);

    }
}

