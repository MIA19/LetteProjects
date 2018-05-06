package de.lette.task.multiple.observer;

public class CountChangedEvent {

    private int count;
    private Object source;

    public CountChangedEvent(int count, Object source) {
        this.count = count;
        this.source = source;
    }

    public int getCount() {
        return count;
    }

    public Object getSource() {
        return source;
    }
}
