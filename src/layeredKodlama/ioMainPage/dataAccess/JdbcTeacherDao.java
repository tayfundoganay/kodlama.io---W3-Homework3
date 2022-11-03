package layeredKodlama.ioMainPage.dataAccess;

import layeredKodlama.ioMainPage.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Teacher JDBC ile Veritabanına Eklendi");
    }
}
