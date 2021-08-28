public class StudentGrades {
    private String name;
    private int studentId;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double languageGrade;
    private double averageGrade;

    public StudentGrades(
    ) {
        name = "mary";
        studentId = 123;
        mathGrade = 50;
        englishGrade = 50;
        scienceGrade = 50;
        languageGrade = 50;
        calculateAverage();
    }


      public StudentGrades(String name, int studentId, double mathGrade, double englishGrade, double scienceGrade, double languageGrade) {
        this.name = name;
        this.studentId = studentId;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        this.languageGrade = languageGrade;
        calculateAverage();

    }
    public void calculateAverage() {
        this.averageGrade = (getEnglishGrade() + getMathGrade() + getScienceGrade() + getLanguageGrade())/4;
    }
    public void displayAverage() {
        System.out.println(name +"'s average grade is " + getAverageGrade());
    }


    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public double getLanguageGrade() {
        return languageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
