package kodlamaIOWithNLayerApp.business;

import kodlamaIOWithNLayerApp.core.logging.ILogger;
import kodlamaIOWithNLayerApp.dataAccess.ICategoryDao;
import kodlamaIOWithNLayerApp.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private ICategoryDao ICategoryDao;
    private List<Category> categories = new ArrayList<Category>();
    private ILogger[] ILoggers;

    public CategoryManager(ICategoryDao ICategoryDao, ILogger[] ILoggers) {
        this.ICategoryDao = ICategoryDao;
        this.ILoggers = ILoggers;
    }

    public void add(Category category) throws Exception {
        for (Category category1 : categories) {
            if (category1.getCategoryName() == category.getCategoryName()) {
                throw new Exception("Bu kategori zaten mevcut, ayni kategoriyi tekrar ekleyemezsin!");
            }
        }

        categories.add(category);
        ICategoryDao.add(category);

        for (ILogger ILogger : ILoggers) {
            ILogger.log(category.getCategoryName());
        }
    }
}
