package SmartPhone.Service.User;

import org.springframework.stereotype.Service;

import SmartPhone.Entity.Products;

@Service
public interface IProductService {	
	public Products GetProductByID(int id);
}
