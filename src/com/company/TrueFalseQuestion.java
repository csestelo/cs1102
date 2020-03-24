package com.company;

import javax.swing.*;

public class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String question, String answer) throws Exception {
        super(question);
        JPanel buttons = new JPanel();
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");
        this.question.add(buttons);
        initQuestionDialog();
        correctAnswer = convertToValidAnswer(answer);
    }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
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
