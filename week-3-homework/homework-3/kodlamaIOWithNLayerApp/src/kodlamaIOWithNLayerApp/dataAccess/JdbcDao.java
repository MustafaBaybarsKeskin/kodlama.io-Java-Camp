package kodlamaIOWithNLayerApp.dataAccess;

import kodlamaIOWithNLayerApp.entities.Category;
import kodlamaIOWithNLayerApp.entities.Course;
import kodlamaIOWithNLayerApp.entities.Instructor;

public class JdbcDao implements ICourseDao, ICategoryDao, IInstructorDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs JDBC ile veritabanina eklendi");
    }

    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile veritabanina eklendi");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Egitmen JDBC ile veritabanina eklendi");
    }
}
