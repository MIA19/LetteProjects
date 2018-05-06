package de.lette.task.multiple.observer;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CounterPanel extends JPanel implements CountChangedListener, MouseListener {

    private JLabel jLabel;
    private ObservedArrayList observedArrayList;

    public CounterPanel() {
        jLabel = new JLabel();
        jLabel.setText("0");
        add(jLabel);

        observedArrayList = new ObservedArrayList();
        observedArrayList.setListener(this);

        addMouseListener(this);
    }

    @Override
    public void countChanged(CountChangedEvent e) {
        jLabel.setText(String.valueOf(e.getCount()));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        observedArrayList.add(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        observedArrayList.add(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        observedArrayList.add(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        observedArrayList.add(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        observedArrayList.add(e);
    }
}
