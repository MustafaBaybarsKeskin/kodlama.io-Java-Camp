package kodlamaIOWithNLayerApp.dataAccess;

import kodlamaIOWithNLayerApp.entities.Category;
import kodlamaIOWithNLayerApp.entities.Course;
import kodlamaIOWithNLayerApp.entities.Instructor;

public class HibernateDao implements ICourseDao, ICategoryDao, IInstructorDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile veritabanina eklendi");
    }

    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile veritabanina eklendi");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Egitmen Hibernate ile veritabanina eklendi");
    }
}
