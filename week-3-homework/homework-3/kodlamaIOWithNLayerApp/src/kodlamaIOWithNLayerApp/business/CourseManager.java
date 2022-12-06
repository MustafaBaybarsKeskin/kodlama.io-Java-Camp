package kodlamaIOWithNLayerApp.business;

import kodlamaIOWithNLayerApp.core.logging.ILogger;
import kodlamaIOWithNLayerApp.dataAccess.ICourseDao;
import kodlamaIOWithNLayerApp.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ICourseDao ICourseDao;
    private List<Course> courses = new ArrayList<Course>();
    private ILogger[] ILoggers;

    public CourseManager(ICourseDao ICourseDao, ILogger[] ILoggers) {
        this.ICourseDao = ICourseDao;
        this.ILoggers = ILoggers;
    }

    public void add(Course course) throws Exception {
        for(Course course1 : courses){
            if(course1.getCourseName() == course.getCourseName()){
                throw new Exception("Bu kurs zaten mevcut, ayni kursu tekrar ekleyemezsin!");
            }
        }

        if (course.getUnitPrice() < 0) {
            throw new Exception("Kursun fiyati 0'dan kucuk olamaz.");
        }

        courses.add(course);
        ICourseDao.add(course);

        for(ILogger ILogger : ILoggers) {
            ILogger.log(course.getCourseName());
        }
    }
}
