package com.company;

import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String question, String answer) throws Exception {
        this.question = "TRUE or FALSE: " + question;
        correctAnswer = convertToValidAnswer(answer);
    }

    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);

            try {
                return convertToValidAnswer(answer);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
            }
        }
    }

    String convertToValidAnswer(String answer) throws Exception {
        answer = answer.toUpperCase();

        if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
            return "FALSE";
        }
        if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
            return "TRUE";
        } else {
            throw new Exception("Invalid Answer!");
        }
    }
}
