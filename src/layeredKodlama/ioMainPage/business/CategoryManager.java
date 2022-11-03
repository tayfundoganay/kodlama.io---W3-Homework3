package layeredKodlama.ioMainPage.business;

import layeredKodlama.ioMainPage.core.logging.Logger;
import layeredKodlama.ioMainPage.dataAccess.CategoryDao;
import layeredKodlama.ioMainPage.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category categories : categories){
            if(category.getCategoryName() == categories.getCategoryName()){
                throw new Exception("Category Names can't be same");}}
        for (Logger logger: loggers){
            logger.log(category.getCategoryName());
        }
    }
}
