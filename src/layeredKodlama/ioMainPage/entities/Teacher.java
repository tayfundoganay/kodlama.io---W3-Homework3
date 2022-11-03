package layeredKodlama.ioMainPage.entities;

public class Teacher {
    private int teacherId;
    private String teacherName;

    public Teacher(){}
    public Teacher(int teacherId, String teacherName){
        this.teacherId = teacherId;
        this.teacherName = teacherName;

    }

    public int getTeacherId() {return teacherId;}

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName(){return teacherName;}
    public void setTeacherName(){this.teacherId = teacherId;}
}
