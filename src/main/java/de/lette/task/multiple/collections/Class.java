package de.lette.task.multiple.collections;

import java.util.*;

public class Class {
    private String name;
    private Set<Student> studentSet;

    Class(String name) {
        this.name = name;
        this.studentSet = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student... student) {
        Collections.addAll(studentSet, student);
    }

    public void removeStudent(Student student) {
        studentSet.remove(student);
    }

    public Map<Student, Map<Subject, Mark>> getZensurenspiegel() {
        HashMap<Student, Map<Subject, Mark>> spiegel = new HashMap<>();
        studentSet.forEach(student -> spiegel.put(student, student.getMarkMap()));
        return spiegel;
    }

}
