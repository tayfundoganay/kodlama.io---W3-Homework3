package layeredKodlama.ioMainPage.entities;

public class Course {
    private String courseName;
    private String courseTeacher;
    private int coursePrice;
    private String courseDefinition;

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseDefinition() {
        return courseDefinition;
    }

    public void setCourseDefinition(String courseDefinition) {
        this.courseDefinition = courseDefinition;
    }

    public Course(String courseName, String courseTeacher, int coursePrice, String courseDefinition) throws Exception {
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.coursePrice = coursePrice;
        this.courseDefinition = courseDefinition;
    }
}
