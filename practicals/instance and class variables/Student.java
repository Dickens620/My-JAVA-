class Student {

    private String name;
    private String program;

    private int year;
    private int studentNumber;

    private static int numberOfStudents = 0;

    public Student(String studentName, String course, int entryYear) {
        program = course;
        name = studentName;
        year = entryYear;
        studentNumber = ++numberOfStudents;
    }

    public String getStudentName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourse() {
        return program;
    }

    public void setCourse(String newCourse) {
        program = newCourse;
    }

}
