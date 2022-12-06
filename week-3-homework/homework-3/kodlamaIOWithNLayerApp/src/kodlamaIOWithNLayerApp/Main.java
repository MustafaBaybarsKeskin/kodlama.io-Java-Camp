package kodlamaIOWithNLayerApp;

import kodlamaIOWithNLayerApp.business.CategoryManager;
import kodlamaIOWithNLayerApp.business.CourseManager;
import kodlamaIOWithNLayerApp.business.InstructorManager;
import kodlamaIOWithNLayerApp.core.logging.DatabaseLogger;
import kodlamaIOWithNLayerApp.core.logging.ILogger;
import kodlamaIOWithNLayerApp.core.logging.MailLogger;
import kodlamaIOWithNLayerApp.dataAccess.HibernateDao;
import kodlamaIOWithNLayerApp.dataAccess.JdbcDao;
import kodlamaIOWithNLayerApp.entities.Category;
import kodlamaIOWithNLayerApp.entities.Course;
import kodlamaIOWithNLayerApp.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        ILogger[] loggers = {new DatabaseLogger(), new MailLogger()};

        Course course1 = new Course(1, "JAVA", 100);
        Course course2 = new Course(2, "C#", 50);
        Course course3 = new Course(3, "JAVA", 150);

        CourseManager courseManager = new CourseManager(new JdbcDao(), loggers);

        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);

        // --------------------------------------------------------------------------- //

        Category category1 = new Category(1, "Programlama");
        Category category2 = new Category(2, "Yuzme");
        Category category3 = new Category(3, "Programlama");

        CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers);

        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);

        // --------------------------------------------------------------------------- //

        Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
        Instructor instructor2 = new Instructor(2, "Atil", "Samancioglu");
        Instructor instructor3 = new Instructor(3, "Murat", "Yucedag");

        InstructorManager instructorManager = new InstructorManager(new HibernateDao(),loggers);

        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        instructorManager.add(instructor3);
    }
}