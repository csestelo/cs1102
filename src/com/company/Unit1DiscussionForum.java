package com.company;

// Explain what is meant by the syntax and the semantics of a programming language. Give Java examples to illustrate
// the difference between a syntax error and a semantics error. Use different examples than those found in the textbook.

// The syntax of a programming language is the group of words that are allowed to be used in a certain language as long
// as the rules that set how we can organize the instructions that will manipulate the data to perform what we need.

// Below there is an example of a syntax error. I declared a method called multiplyTen and I called it inside the main
// function, but without both parentheses after the method's name, which indicates that the method must be evaluated,
// an error is raised.

public class Unit1DiscussionForum {

    public static void main(String[] args) {
        System.out.println(multiplyTen());
    }

    private static Number multiplyTen() {
        return 2 * 10;
    }
}

// Output Error:
// Error:(15, 41) java: ')' expected


// The semantic of a programming language is the instruction's intention designed by the developer. So if we create a
// method called multiplyTen that implements a sum of a number with 10, we have a semantic error.

// public class Unit1DiscussionForum {
//
//     public static void main(String[] args) {
//         System.out.println(multiplyTen());
//     }
//
//     private static Number multiplyTen() {
//         return 2 + 10;
//     }
// }
