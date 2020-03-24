package com.company;

import javax.swing.*;
import java.awt.event.*;

public class QuestionDialog extends JDialog implements ActionListener {
    String answer;

    public void actionPerformed (ActionEvent e) {
        answer = e.getActionCommand();
        dispose();
    }
}
