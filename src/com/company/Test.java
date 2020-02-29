package com.company;

import javax.swing.JOptionPane;

import textio.TextIO;

public class Test {
    static int count;
    private String flavor = "sweet";
    Test() { count++; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Test pepper = new Test();
        System.out.println(pepper.getFlavor());
    }
}



