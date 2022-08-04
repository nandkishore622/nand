package com.cg;

        /*
        In Turkish Army, there are three type of soldiers - Defenders (D), Archers(A) and
        Knights(K). Commander ordered his army to form a sequence and be ready for the
        Mongolian attack. But once soldiers formed a sequence, Commander observed that they
        are not in right order. He wants a queue where Archers should be on front positions i.e.,
        before Defenders and Knights. He ordered army to correct the order.
        Input: [D, A, A, K, A, D, K, A, K, KJ
        Output: [A, A, A, A, D, K, D, K, K, KJ
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Commanders {
    public static void main(String[] args) {
        String [] commander = {"D", "A", "A", "K", "A", "D", "K", "A", "K", "KJ"};
        List<String> commanderList = getCommanderList(commander);
        System.out.println(commanderList);

        //java8
        List<String> commander1 = Arrays.asList(commander);
        List<String> commanderQueue = commander1.stream().filter(c->c.equalsIgnoreCase("A"))
                .collect(Collectors.toList());
//                .addAll(commander1.stream().filter(c->!c.equalsIgnoreCase("A")).collect(Collectors.toList());

        commanderQueue.addAll(commander1.stream().filter(c->!c.equalsIgnoreCase("A")).collect(Collectors.toList()));
        System.out.println(commanderQueue);
    }

    private static List<String> getCommanderList(String[] commander) {
        List<String> commanderList = new ArrayList<>();

        for(String s : commander){
            if("A".equalsIgnoreCase(s)){
                commanderList.add(0, s);
            }else{
                commanderList.add(s);
            }
        }
        return commanderList;
    }
}
