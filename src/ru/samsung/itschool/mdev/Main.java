package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String toPrint(int[] x) {
        String str = "";
        for(int ii: x) str += ii + " "; // цикл foreach: str = str + ii + " ";
        return str.trim(); // 'a' - тип char, "" -строка!!!
    }

    public static void main(String[] args) {
        int[] x;
        //int[] y = new int[5];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        x = new int[n];
        for(int i=0; i<x.length; i++) {
            x[i] = scan.nextInt();
        }
        System.out.println(toPrint(x));

        ArrayList<String> arrayList = new ArrayList<>();
        //arrayList.add(1);
        //arrayList.add("Hello");
        //arrayList.add(new Object());


    }

}
