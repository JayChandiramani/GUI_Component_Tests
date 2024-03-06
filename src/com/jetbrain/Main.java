package com.jetbrain;

import javax.swing.*;

public class Main {
    public static JFrame MainFrame;

    public static void main(String[] args) {

        MainFrame = new JFrame("Tests");
        MainFrame.setVisible(true);
        TestForm TF = new TestForm();
        MainFrame.add(TF.panel1);
        TF.Test1panel.setVisible(true);
        TF.Test1panel.add(new Test1Panel().FPanel);
        TF.Test1panel.revalidate();
        TF.Test2panel.setVisible(false);
        TF.Test3panel.setVisible(false);
        MainFrame.pack();
        MainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainFrame.setSize(700,300);
        MainFrame.setLocationRelativeTo(null);
    }
}
