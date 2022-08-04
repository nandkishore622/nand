package com.cg.test;

/*
        'r' -> 'b' -> 'g'
        original array: ('b', 'g', 'r', 'b', 'g')
        resulted array: ('r', 'b', 'b', 'g', 'g')
*/

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        char[] ch = {'b', 'g', 'r', 'b', 'g'};
        List<Character> listChar = new ArrayList<>();

        getListChar(ch, listChar, 'r');
        getListChar(ch, listChar, 'b');
        getListChar(ch, listChar, 'g');

        System.out.println(listChar);
    }

    private static void getListChar(char [] ch, List<Character> list, char c){
        for(int i=0;i<ch.length;i++){

            if((int)ch[i]==(int)c){
                list.add(ch[i]);
            }
        }
    }
}
