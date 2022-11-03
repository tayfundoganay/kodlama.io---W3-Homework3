package layeredKodlama.ioMainPage.dataAccess;

import layeredKodlama.ioMainPage.entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course){
        System.out.println("Course JDBC ile Veritabanına eklendi");
    }
}
