package com.yom.java8.lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambdaExpression {


    public static void main(String[] args) {

        /* Old School way with Inner class
        FileFilter fileFilter = new FileFilter() {

            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".zip");
            }
        };*/

        FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".zip");

        File dir = new File("/home/yogendra/Code/zip");
        File[] files =  dir.listFiles(filterLambda);

        System.out.println("Total count: "+files.length);

        for (File file:files) {
            System.out.println(file);
        }
    }
}
