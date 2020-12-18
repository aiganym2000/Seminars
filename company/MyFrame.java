package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class MyFrame extends JFrame {
    MyFrame() throws Exception {
        setBounds(0, 0, 500, 500);
        JFileChooser dialog = new JFileChooser();
        dialog.showOpenDialog(this);
        File file = dialog.getSelectedFile();
        TreeSet<Integer> numbers = new TreeSet<>();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            numbers.add(Integer.parseInt(line));
        }
        br.close();
        Iterator<Integer> it = numbers.iterator();
        int[] numberArray = new int[5];
        int i = 0;
        while (it.hasNext()) {
            numberArray[i] = it.next();
            i++;
        }
        JTextArea textArea = new JTextArea();
        textArea.append(Arrays.toString(numberArray));
        add(textArea);
        setVisible(true);
    }
}
