public class University {
    public static void main(String[] args) {
        System.out.println("Total number of students: " + Student.getNumberOfStudents());

        Student stud1 = new Student("Daaki Benjamin", "BSSE", 2019);
        System.out.println("Added Student: " + stud1.getStudentName() + "Total number of students: "
                + Student.getNumberOfStudents());
        Student stud2 = new Student("Kamya Tonny", "CSC", 20202);
        System.out.println("Added Student: " + stud2.getStudentName() + "Total number of students: "
                + Student.getNumberOfStudents());

    }

}
