package SmartPhone.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SmartPhone.Dao.ProductsDao;
import SmartPhone.Entity.Products;
@Service
public class CatagoryServiceImpl implements ICatagoryService{

	@Autowired
	private ProductsDao productsDao;
	
	public List<Products> GetAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}
}
