import layeredKodlama.ioMainPage.business.CategoryManager;
import layeredKodlama.ioMainPage.business.CourseManager;
import layeredKodlama.ioMainPage.core.logging.DatabaseLogger;
import layeredKodlama.ioMainPage.core.logging.FileLogger;
import layeredKodlama.ioMainPage.core.logging.Logger;
import layeredKodlama.ioMainPage.core.logging.MailLogger;
import layeredKodlama.ioMainPage.dataAccess.HibernateCategoryDao;
import layeredKodlama.ioMainPage.dataAccess.JdbcCourseDao;
import layeredKodlama.ioMainPage.entities.Category;
import layeredKodlama.ioMainPage.entities.Course;
import layeredKodlama.ioMainPage.entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {
        Teacher teacherEnginDemirog = new Teacher(1,"Engin Demirog");
        Course courseJava = new Course("Java Course", teacherEnginDemirog.getTeacherName(), 500, "Java Camp 2022");
        Course courseCS = new Course("C# Course", teacherEnginDemirog.getTeacherName(), 1500, "Senior Level C# Course");
        Course courseJS = new Course("Java Course", teacherEnginDemirog.getTeacherName(), 500, "JavaScript and React JS for Beginners");
        Course[] courses = new Course[]{courseJava, courseJS};

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,courses);
        courseManager.add(courseCS);

        System.out.println("------------------------------------------------------------------------------------");

        Category categoryWebDevelopment = new Category("Web Development");
        Category categoryMachineLearning = new Category("Machine Learning");
        Category[] categories = new Category[]{categoryWebDevelopment};

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
        categoryManager.add(categoryMachineLearning);
    }
}