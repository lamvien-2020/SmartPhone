package SmartPhone.UserController;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SmartPhone.Dto.CartDto;
import SmartPhone.Service.User.CartServiceImpl;

@Controller
public class CartController extends BaseController {
	@Autowired
	private CartServiceImpl cartService = new CartServiceImpl();

	@RequestMapping(value = { "/listCart" })
	public ModelAndView Index() {
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("catagories", _homeService.GetDataCatagory());
		_mvShare.addObject("products", _homeService.GetDataProduct());
		_mvShare.setViewName("user/listCart");
		return _mvShare;
	}

	@RequestMapping(value = "addCart/{id}")
	public String AddCart(HttpServletRequest request, HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cartService.AddCart(id, cart);
		session.setAttribute("cart", cart);
		session.setAttribute("totalQuantyCart", cartService.TotalProducts(cart));
		session.setAttribute("totalPriceCart", cartService.TotalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "/listCart/editCart/{id}/{quanty}")
	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable("id") int id, @PathVariable("quanty") int quanty) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cartService.EditCart(id, quanty, cart);
		session.setAttribute("cart", cart);
		session.setAttribute("totalQuantyCart", cartService.TotalProducts(cart));
		session.setAttribute("totalPriceCart", cartService.TotalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "deleteCart/{id}")
	public String DeleteCart(HttpServletRequest request, HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cartService.DeleteCart(id, cart);
		session.setAttribute("cart", cart);
		session.setAttribute("totalQuantyCart", cartService.TotalProducts(cart));
		session.setAttribute("totalPriceCart", cartService.TotalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}

}
