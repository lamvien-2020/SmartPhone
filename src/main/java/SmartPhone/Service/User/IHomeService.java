package SmartPhone.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SmartPhone.Entity.Catagories;
import SmartPhone.Entity.Menus;
import SmartPhone.Entity.Products;
import SmartPhone.Entity.Slides;

@Service
public interface IHomeService {	
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Catagories> GetDataCatagory();
	public List<Menus> GetDataMenu();
	public List<Products> GetDataProduct();

}
