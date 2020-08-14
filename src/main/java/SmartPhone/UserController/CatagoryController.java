package SmartPhone.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SmartPhone.Service.User.CatagoryServiceImpl;

@Controller
public class CatagoryController extends BaseController{

	@RequestMapping(value =  "/catagory/" )
	public ModelAndView Products() {
		_mvShare.addObject("products",_homeService.GetDataProduct());
		_mvShare.setViewName("user/catagory");
		return _mvShare;
	}
	
	@Autowired
	private CatagoryServiceImpl catagoryService;
	
	@RequestMapping(value =  "/catagory/{id}" )
	public ModelAndView Product(@PathVariable int id) {		
		_mvShare.setViewName("user/catagory");
		_mvShare.addObject("products",catagoryService.GetAllProductsByID(id));
		return _mvShare;
	}	
}
