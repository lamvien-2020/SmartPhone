package SmartPhone.Service.User;

import java.util.List;
import org.springframework.stereotype.Service;
import SmartPhone.Entity.Products;

@Service
public interface ICatagoryService {
	public List<Products> GetAllProductsByID(int id);
}
