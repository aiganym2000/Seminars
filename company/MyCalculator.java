package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends JFrame {
    private JTextField jtfResult;

    public MyCalculator() {

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
        JButton left = new JButton("(");
        JButton right = new JButton(")");
        p3.add(plus);
        p3.add(minus);
        p3.add(multiply);
        p3.add(divide);
        p3.add(result);
        p3.add(left);
        p3.add(right);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.WEST);
        p.add(p1, BorderLayout.CENTER);
        p.add(p3, BorderLayout.EAST);

        add(p);

        button0.addActionListener(new MyCalculator.ListenToZero());
        button1.addActionListener(new MyCalculator.ListenToOne());
        button2.addActionListener(new MyCalculator.ListenToTwo());
        button3.addActionListener(new MyCalculator.ListenToThree());
        button4.addActionListener(new MyCalculator.ListenToFour());
        button5.addActionListener(new MyCalculator.ListenToFive());
        button6.addActionListener(new MyCalculator.ListenToSix());
        button7.addActionListener(new MyCalculator.ListenToSeven());
        button8.addActionListener(new MyCalculator.ListenToEight());
        button9.addActionListener(new MyCalculator.ListenToNine());

        buttonClear.addActionListener(new MyCalculator.ListenToClear());
        plus.addActionListener(new MyCalculator.ListenToAdd());
        minus.addActionListener(new MyCalculator.ListenToSubtract());
        multiply.addActionListener(new MyCalculator.ListenToMultiply());
        divide.addActionListener(new MyCalculator.ListenToDivide());
        result.addActionListener(new MyCalculator.ListenToSolve());
        left.addActionListener(new MyCalculator.ListenToLeft());
        right.addActionListener(new MyCalculator.ListenToRight());
    }

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText("");
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
            jtfResult.setText(jtfResult.getText() + "+");
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "-");
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "*");
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "/");
        }
    }

    class ListenToLeft implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + "(");
        }
    }

    class ListenToRight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(jtfResult.getText() + ")");
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jtfResult.setText(Double.toString(calc(jtfResult.getText())));
        }
    }

    public static double calc(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();
                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                return x;
            }
        }.parse();
    }
}
