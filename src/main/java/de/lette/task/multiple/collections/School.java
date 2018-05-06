package de.lette.task.multiple.collections;

public class School {

    public static void main(String[] args) {

        Class k1 = new Class("MIA19");
        fillClassWithValues(k1);
        printValuesForClass(k1);
    }

    private static void fillClassWithValues(Class k) {
        Student s1 = new Student("Vitrex");
        Student s2 = new Student("Invalid");
        for (Subject f : Subject.values()) {
            s1.addZensur(f, Mark.getRandomMark());
            s2.addZensur(f, Mark.getRandomMark());
        }
        k.addStudent(s1, s2);
    }

    private static void printValuesForClass(Class k) {
        StringBuilder sb = new StringBuilder();
        sb.append(k.getName()).append(" :\n");
        k.getZensurenspiegel().forEach(((student, zensurMap) -> {
            sb.append("\t").append(student.getName()).append(" (").append(student.hasFailed() ? "Durchgefallen" : "Bestanden").append("):\n");
            zensurMap.forEach((fach, mark) -> sb.append("\t").append(" - ").append(fach.toString()).append(": ").append(mark.toString()).append("\n"));
        }));
        System.out.println(sb.toString());
    }

    public static void saveAsTable() {
        /*String fileName = "Zensurenspiegel.xlsx";

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Spiegel");
        int rowNum = 0;
        int colNum = 0;*/
    }

}
