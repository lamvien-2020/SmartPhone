package SmartPhone.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{
	
	@RequestMapping( value = {"/","HomePage"})
	public ModelAndView Index() {
		_mvShare.addObject("slides",_homeService.GetDataSlide());
		_mvShare.addObject("catagories",_homeService.GetDataCatagory());
		_mvShare.addObject("products",_homeService.GetDataProduct());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
}
