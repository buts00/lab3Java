package Lab3;

public class Student {
    private  String name;
    private String university;
    private String faculty;
    private double  averageScore;
    public Student(String name, String university, String faculty,  double averageScore) {
        this.name = name;
        this.university = university;
        this.faculty = faculty;
        this.averageScore  = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public void printInformation() {
        System.out.println("Lab3.Student's name: " + getName());
        System.out.println("University: " + getUniversity());
        System.out.println("Faculty of: " + getFaculty());
        System.out.println("Lab3.Student's age: " + getAverageScore());
    }
}
