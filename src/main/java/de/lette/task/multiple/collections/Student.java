package de.lette.task.multiple.collections;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<Subject, Mark> markMap;

    Student(String name) {
        this.name = name;
        this.markMap = new HashMap<>();
    }

    public void addZensur(Subject fach, Mark mark) {
        markMap.put(fach, mark);
    }

    public Map<Subject, Mark> getMarkMap() {
        return markMap;
    }

    public String getName() {
        return name;
    }

    public boolean hasFailed() {
        return markMap.values().stream().filter(mark -> mark.equals(Mark.SECHS)).count() >= 1 ||
                markMap.values().stream().filter(mark -> mark.equals(Mark.FUENF)).count() >= 2;
    }

}
