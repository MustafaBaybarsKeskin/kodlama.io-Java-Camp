package kodlamaIOWithNLayerApp.business;

import kodlamaIOWithNLayerApp.core.logging.ILogger;
import kodlamaIOWithNLayerApp.dataAccess.IInstructorDao;
import kodlamaIOWithNLayerApp.entities.Instructor;

public class InstructorManager {
    private IInstructorDao IInstructorDao;
    private ILogger[] ILoggers;

    public InstructorManager(IInstructorDao IInstructorDao, ILogger[] ILoggers) {
        this.IInstructorDao = IInstructorDao;
        this.ILoggers = ILoggers;
    }

    public void add(Instructor instructor) throws Exception {

        IInstructorDao.add(instructor);

        for(ILogger ILogger : ILoggers) {
            ILogger.log(instructor.getFirstName());
            ILogger.log(instructor.getLastName());
        }
    }
}
