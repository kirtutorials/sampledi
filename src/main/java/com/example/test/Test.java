package com.example.test;

import com.example.writer.MyWriter;
import com.example.writer.Writer;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @Autowired
    private MyWriter writer;

    public void setWriter(MyWriter writer) {
        this.writer = writer;
    }

    public void start() {
        String s = "This is the test print statement!!";
        writer.MyPrinter(s);
    }
}

/***
 * 1. who spring creating the objects
 * 2. how its connect the object
 * 3. how object props are initialized
 */
