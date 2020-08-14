package SmartPhone.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SmartPhone.Dao.ProductsDao;
import SmartPhone.Entity.Products;
@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	ProductsDao productDao  = new ProductsDao();
	
	public Products GetProductByID(int id) {
		List<Products> listproduct = productDao.GetProductByID(id);
		return listproduct.get(0);
	}

}
