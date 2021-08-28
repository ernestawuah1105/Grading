public class Main  {
    public static void main(String[] args) {
        StudentGrades studentGrade1;
        StudentGrades studentGrade2;
        double Student1Average;
        double Student2Average;

        studentGrade1 = new StudentGrades();
        studentGrade2 = new StudentGrades("Bob", 456, 75.0, 75.0, 75.0, 75.0);
        System.out.println("Student1 name " + studentGrade1.getName());
        System.out.println("Student1 id " + studentGrade1.getStudentId());
        System.out.println("Student2 name " + studentGrade2.getName());
        System.out.println("Student2 id " + studentGrade2.getStudentId());
        studentGrade1.displayAverage();
        studentGrade2.displayAverage();




    }
}
