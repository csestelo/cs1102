package com.company;


public class Quiz {

    public static void main(String[] args) {
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
                "What is the language spoken in Brazil?",
                "English",
                "Spanish",
                "French",
                "Portuguese",
                "Greek",
                "D");

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
                "What is the current president of Brazil?",
                "Lula",
                "Fernando Henrique Cardoso",
                "Jair Bozo",
                "Fernando Collor",
                "Dilma Houssef",
                "C");

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
                "What is the capital of Brazil?",
                "Buenos Aires",
                "Rio de Janeiro",
                "Salvador",
                "São Paulo",
                "Brasília",
                "E");

        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
                "What is the Greek god of wine, fertility, and theatre?",
                "Apollo",
                "Hermes",
                "Hephaestus",
                "Dionysus",
                "Hades",
                "D");

        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
                "What Greek goddess becomes the queen of the underworld after being kidnapped by Hades?",
                "Persephone",
                "Athena",
                "Demeter",
                "Hera",
                "Aphrodite",
                "A");

        question1.check();
        question2.check();
        question3.check();
        question4.check();
        question5.check();

        MultipleChoiceQuestion.showResults();
    }
}