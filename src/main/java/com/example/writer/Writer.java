package com.example.writer;

public class Writer implements MyWriter{
    @Override
    public void MyPrinter(String s) {
        System.out.println(s);
    }

    @Override
    public void formatterPrint(String s) {

    }
}
