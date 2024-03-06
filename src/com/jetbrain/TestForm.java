package com.jetbrain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestForm {
    public JPanel panel1;
    private JButton showTest1PanelButton;
    private JButton showTest2PanelButton;
    private JButton showTest3PanelButton;
    private JPanel buttonspanel;
    public JPanel Test1panel;
    public JPanel Test2panel;
    public JPanel Test3panel;


    public TestForm() {

        showTest1PanelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Test1panel.setVisible(true);
                Test2panel.setVisible(false);
                Test3panel.setVisible(false);
                Test1panel.add(new Test1Panel().FPanel);
                Test1panel.revalidate();
            }
        });

        showTest2PanelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Test2panel.setVisible(true);
                Test1panel.setVisible(false);
                Test3panel.setVisible(false);
            }
        });

        showTest3PanelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Test3panel.setVisible(true);
                Test1panel.setVisible(false);
                Test2panel.setVisible(false);
            }
        });
    }
}
