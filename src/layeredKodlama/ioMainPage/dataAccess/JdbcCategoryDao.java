package layeredKodlama.ioMainPage.dataAccess;

import layeredKodlama.ioMainPage.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category){
        System.out.println("Category JDBC ile Veritabanına eklendi");
    }
}
