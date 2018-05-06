package de.lette.task.multiple.observer;

import javax.swing.*;

public class CountChangedTester {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CounterPanel cp = new CounterPanel();
        frame.add(cp);
        frame.pack();
        frame.setVisible(true);
    }
}
