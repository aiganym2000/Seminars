package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DivideAndConquer {

    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        JFrame frame = new JFrame("Swing Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame) {
        JPanel panel = new JPanel();
        LayoutManager layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);

        JButton button = new JButton("Choose");
        final JLabel label = new JLabel();
        final JLabel fileText = new JLabel();

        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if(option == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                String fileContent = readFile(file.getAbsolutePath());
                fileText.setText(fileContent);
                String[] array = fileContent.split(",");
                label.setText(array[0] + " - " + array[array.length - 1]);

            }else{
                label.setText("Open command canceled");
            }
        });

        panel.add(button);
        panel.add(label);
        panel.add(fileText);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    private static String readFile(String fileName) {
        final StringBuilder builder = new StringBuilder();
        char[] array = new char[50];
        File file = new File(fileName);
        try (FileReader fr = new FileReader(file)) {
            int size = fr.read(array);
            for (int i = 0; i < size; i++) {
                System.out.print(array[i]);
                builder.append(array[i]);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

        return builder.toString();
    }

}
