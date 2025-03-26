package org.example;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String []args){
        ArrayList<String> arrayList1= new ArrayList<>(20);
        arrayList1.add("Anna");
        arrayList1.add("Sasha");
        arrayList1.add("Misha");
        arrayList1.add("Alex");
        arrayList1.add("Max"); // adds element to arraylist
        System.out.println(arrayList1);

        arrayList1.set(1,"Lucy"); // changes element from arraylist
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);

    }


}
