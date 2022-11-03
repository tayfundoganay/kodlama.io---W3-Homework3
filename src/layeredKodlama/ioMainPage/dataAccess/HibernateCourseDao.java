package layeredKodlama.ioMainPage.dataAccess;

import layeredKodlama.ioMainPage.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course){
        System.out.println("Course Hibernate ile Veritabanına eklendi");
    }
}
