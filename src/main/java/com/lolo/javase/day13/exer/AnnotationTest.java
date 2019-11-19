package com.lolo.javase.day13.exer;

import java.util.ArrayList;

public class AnnotationTest {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        int num = 10;

        @SuppressWarnings({"unused", "rawtypes"})
        ArrayList list = new ArrayList();

    }
}
