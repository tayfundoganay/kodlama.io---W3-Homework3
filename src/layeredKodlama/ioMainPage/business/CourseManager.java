package layeredKodlama.ioMainPage.business;

import layeredKodlama.ioMainPage.core.logging.Logger;
import layeredKodlama.ioMainPage.dataAccess.CourseDao;
import layeredKodlama.ioMainPage.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private Course[] courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0){
            throw new Exception("Course Price can't be less than 0");
        }
        for (Course courses : courses){
            if (course.getCourseName() == courses.getCourseName()){
                throw new Exception("Course Names can't be same");
            }
        }

    }
}
