package org.example;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String [] args){
        ArrayList<String> names=new ArrayList<>(30);// Initilalized string arraylist
        names.add("Ivan");
        names.add("Peter");
        System.out.println(names);
        ArrayList <String> arrayList2=new ArrayList<>(names); //Initialize second arraylist with another arraylist
        System.out.println(arrayList2);
        arrayList2.add("Igor");
        System.out.println(arrayList2);
        for (String iter:arrayList2){// iterating in arraylist
            System.out.println(iter);
        }
    }
}
