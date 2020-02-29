package com.company;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
    static int nQuestions = 0;
    static int nCorrect = 0;
    String question;
    String correctAnswer;

    MultipleChoiceQuestion (String query, String a, String b, String c, String d, String e, String answer) {
        question = query+"\n"+"A. "+a+"\n"+"B. "+b+"\n"+"c. "+c+"\n"+"D. "+d+"\n"+"E. "+e+"\n";
        correctAnswer = answer.toUpperCase();
    }

    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question).toUpperCase();

            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }
    }

    void check() {
        nQuestions++;
        String answer = ask();

        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
        }
    }

    static void showResults () {
        JOptionPane.showMessageDialog(null, nCorrect + " correct answers out of " + nQuestions + " questions.");
    }
}
