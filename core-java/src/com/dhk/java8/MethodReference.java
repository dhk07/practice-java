package com.dhk.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String > stringList = Arrays.asList("", "my","name","is","","kumar");

        long count = stringList.stream().filter(String::isBlank).count();
        System.out.println("Blank string in the list is : "+count);
    }
}
