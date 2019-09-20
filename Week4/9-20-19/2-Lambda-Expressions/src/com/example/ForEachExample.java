package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("laptop");
        myList.add("C++ book");
        myList.add("Java book");
        myList.add("Python book");

        // before java 8
        // advanced for loop
        // to print each element in list
        /*
        for (String item : myList) {
            System.out.println(item);
        }
        */


        // after java 8
        // lambda function "forEach" to print each element in list
        myList.forEach(m -> System.out.println(m));


    }


}
