package layeredKodlama.ioMainPage.dataAccess;

import layeredKodlama.ioMainPage.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category){
        System.out.println("Category Hibernate ile Veritabanına eklendi");
    }
}
