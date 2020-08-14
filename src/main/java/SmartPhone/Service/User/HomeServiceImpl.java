package SmartPhone.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SmartPhone.Entity.Catagories;
import SmartPhone.Entity.Menus;
import SmartPhone.Entity.Products;
import SmartPhone.Entity.Slides;
import SmartPhone.Dao.CatagoriesDao;
import SmartPhone.Dao.MenusDao;
import SmartPhone.Dao.ProductsDao;
import SmartPhone.Dao.SlidesDao;

@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CatagoriesDao catagoriesDao;
	@Autowired
	private MenusDao menusDao;	
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}
	public List<Catagories> GetDataCatagory() {
		return catagoriesDao.GetDataCatagory();
	}
	public List<Menus> GetDataMenu() {
		return menusDao.GetDataMenu();
	}
	public List<Products> GetDataProduct() {		
		return productsDao.GetDataProduct();
	}


}
