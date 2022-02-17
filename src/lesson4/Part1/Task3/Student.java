package lesson4.Part1.Task3;

public class Student {

    private String surnameAndInitials = "";
    private int group = 0;
    private int academicPerformance = 2;
    public final int MAX_ACADEMIC_PERFORMANCE = 10;
    public final int MIN_ACADEMIC_PERFORMANCE = 2;

    Student() {

    }

    public Student(String surnameAndInitials, int group, int academicPerformance) {
        this.surnameAndInitials = surnameAndInitials;
        this.group = group;
        this.academicPerformance = academicPerformance;
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public void setSurnameAndInitials(String surnameAndInitials) {
        this.surnameAndInitials = surnameAndInitials;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int academicPerformance) {
        this.academicPerformance = academicPerformance;
    }
}
