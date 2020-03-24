package com.company;


public class Quiz {

    public static void main(String[] args) throws Exception {
        Question question1 = new MultipleChoiceQuestion(
                "What is the language spoken in Brazil?",
                "English",
                "Spanish",
                "French",
                "Portuguese",
                "Greek",
                "D");

        Question question2 = new MultipleChoiceQuestion(
                "What is the current president of Brazil?",
                "Lula",
                "Fernando Henrique Cardoso",
                "Jair Bozo",
                "Fernando Collor",
                "Dilma Houssef",
                "C");

        Question question3 = new MultipleChoiceQuestion(
                "What is the capital of Brazil?",
                "Buenos Aires",
                "Rio de Janeiro",
                "Salvador",
                "São Paulo",
                "Brasília",
                "E");

        Question question4 = new MultipleChoiceQuestion(
                "What is the Greek god of wine, fertility, and theatre?",
                "Apollo",
                "Hermes",
                "Hephaestus",
                "Dionysus",
                "Hades",
                "D");

        Question question5 = new MultipleChoiceQuestion(
                "What Greek goddess becomes the queen of the underworld after being kidnapped by Hades?",
                "Persephone",
                "Athena",
                "Demeter",
                "Hera",
                "Aphrodite",
                "A");

        Question question6 = new TrueFalseQuestion(
                "On March 9th is celebrated the International Women's Day.",
                "FALSE"
        );

        Question question7 = new TrueFalseQuestion(
                "According to folklore Santa Claus lives in South Pole.",
                "F"
        );

        Question question8 = new TrueFalseQuestion(
                "Olaf is a character from the movie Frozen.",
                "TRUE"
        );

        Question question9 = new TrueFalseQuestion(
                "The evil fairy Maleficent is portrayed by Angelina Jolie in the live-action film from 2014.",
                "true"
        );

        Question question10 = new TrueFalseQuestion(
                "Princess Ariel is a mermaid.",
                "t"
        );

        question1.check();
        question2.check();
        question3.check();
        question4.check();
        question5.check();
        question6.check();
        question7.check();
        question8.check();
        question9.check();
        question10.check();

        Question.showResults();
    }
}