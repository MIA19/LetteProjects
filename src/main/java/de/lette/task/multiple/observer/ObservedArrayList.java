package de.lette.task.multiple.observer;

import java.util.ArrayList;

public class ObservedArrayList extends ArrayList{

    private CountChangedListener listener;

    @Override
    public boolean add(Object o) {
        CountChangedEvent e = new CountChangedEvent(super.size() + 1, o);
        listener.countChanged(e);
        return super.add(o);
    }

    public void setListener(CountChangedListener listener) {
        this.listener = listener;
    }
}
