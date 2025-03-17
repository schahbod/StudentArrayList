import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Shahbod");
        student.add("Chris");
        student.add("Erick");

        student.remove("Chris");
        Collections.sort(student);
        System.out.println("After remove: " + student);

        ArrayList<Lehre> leherList = new ArrayList<>();
        leherList.add(new Lehre("Shahbod", "IT"));
        leherList.add(new Lehre("Chris", "IT"));
        leherList.add(new Lehre("Erick", "Math"));

        System.out.println("\nStudents and their Departments:");
        for (Lehre leher : leherList) {
            System.out.println(leher.getStudentName() + " is in the " + leher.getDepartment() + " department.");
        }

        ArrayList<Anmeldung> anmeldungList = new ArrayList<>();
        anmeldungList.add(new Anmeldung("Shahbod", "IT", "Summer 2024"));
        anmeldungList.add(new Anmeldung("Erick", "Math", "Summer 2011"));

        System.out.println("\nStudenten und ihre Anmeldedaten:");
        for (Anmeldung anmeldung : anmeldungList) {
            System.out.println(anmeldung.getStudentenName() + " ist für den Kurs " + anmeldung.getKurs() + " im " + anmeldung.getSemester() + " angemeldet.");
        }
    }

    static class Lehre {
        private String studentName;
        private String department;

        public Lehre(String studentName, String department) {
            this.studentName = studentName;
            this.department = department;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }

    static class Anmeldung {
        private String studentenName;
        private String kurs;
        private String semester;

        public Anmeldung(String studentenName, String kurs, String semester) {
            this.studentenName = studentenName;
            this.kurs = kurs;
            this.semester = semester;
        }

        public String getStudentenName() {
            return studentenName;
        }

        public String getKurs() {
            return kurs;
        }

        public String getSemester() {
            return semester;
        }
    }
}
