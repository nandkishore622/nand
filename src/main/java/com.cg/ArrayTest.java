package com.cg;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 6, 1, 2, 5, 6};

        for (int i = 0; i < arr1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
