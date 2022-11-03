package layeredKodlama.ioMainPage.dataAccess;

import layeredKodlama.ioMainPage.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Teacher Hibernate ile Veritabanına Eklendi");
    }
}
