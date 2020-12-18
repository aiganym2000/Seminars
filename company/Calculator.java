package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/***
 * TODO: special task description
 * После того как вы выполните простые TODO.
 * Сейчас калькулятор считает только одну операцию над двумя числами.
 * Попробуйте переделать программу так, чтоб можно было проделать несколько операций.
 * Например, чтоб можно было написать 4 + 2 * 5
 */
public class Calculator extends JFrame {

    private double TEMP;
    private double SolveTEMP;
    private JTextField jtfResult;

    private Boolean addBool = false;
    private Boolean subBool = false;
    private Boolean divBool = false;
    private Boolean mulBool = false;

    public Calculator() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonClear = new JButton("C");
        p1.add(button0);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);

        p1.add(buttonClear);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(5, 1));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton result = new JButton("=");
        p3.add(plus);
        p3.add(minus);
        p3.add(multiply);
        p3.add(divide);
        p3.add(result);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.WEST);
        p.add(p1, BorderLayout.CENTER);
        p.add(p3, BorderLayout.EAST);

        add(p);

        button0.addActionListener(new ListenToZero());
        button1.addActionListener(new ListenToOne());
        button2.addActionListener(new ListenToTwo());
        button3.addActionListener(new ListenToThree());
        button4.addActionListener(new ListenToFour());
        button5.addActionListener(new ListenToFive());
        button6.addActionListener(new ListenToSix());
        button7.addActionListener(new ListenToSeven());
        button8.addActionListener(new ListenToEight());
        button9.addActionListener(new ListenToNine());

        buttonClear.addActionListener(new ListenToClear());
        plus.addActionListener(new ListenToAdd());
        minus.addActionListener(new ListenToSubtract());
        multiply.addActionListener(new ListenToMultiply());
        divide.addActionListener(new ListenToDivide());
        result.addActionListener(new ListenToSolve());
    }

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText("");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");//TODO: special task
            addBool = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            subBool = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            mulBool = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            divBool = true;
        }
    }

    //TODO: special task
    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(jtfResult.getText());
            if (addBool == true)
                SolveTEMP = SolveTEMP + TEMP;
            else if ( subBool == true)
                SolveTEMP = SolveTEMP - TEMP;
            else if ( mulBool == true)
                SolveTEMP = SolveTEMP * TEMP;
            else if ( divBool == true)
                SolveTEMP = SolveTEMP / TEMP;
            jtfResult.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
        }
    }
}
