package SmartPhone.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SmartPhone.Service.User.ProductServiceImpl;

@Controller
public class ProductController extends BaseController {
	@Autowired
	ProductServiceImpl productService;
	
	@RequestMapping(value = { "/detail/{id}" })
	public ModelAndView Index(@PathVariable int id) {		
		_mvShare.setViewName("user/product");
		_mvShare.addObject("catagories",_homeService.GetDataCatagory());
		_mvShare.addObject("detail",productService.GetProductByID(id));
		return _mvShare;
	}
}
