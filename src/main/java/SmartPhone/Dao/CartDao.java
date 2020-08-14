package SmartPhone.Dao;

import SmartPhone.Dto.CartDto;
import SmartPhone.Entity.Products;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDao extends BaseDao {
	@Autowired
	ProductsDao productDao = new ProductsDao();

	// them product vao cart
	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer, CartDto> cart) {
		CartDto itemCart = new CartDto();
		Products product = productDao.FindProductByID(id);
		if (product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty() +1);
			double totalPrice = itemCart.getQuanty()* itemCart.getProduct().getPrice();
			itemCart.setTotalPrice(totalPrice);
		}
		else {
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			double totalPrice = product.getPrice();
			itemCart.setTotalPrice(totalPrice);
		}
		cart.put(id, itemCart);
		return cart;
	}

	// edit cart
	public HashMap<Integer, CartDto> EditCart(int id, int quanty, HashMap<Integer, CartDto> cart) {
		CartDto itemCart = new CartDto();
		if (cart == null) { /* check cart null? */
			return cart;
		}
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double totalPrice = quanty * itemCart.getProduct().getPrice();
			itemCart.setTotalPrice(totalPrice);
		}
		cart.put(id, itemCart);
		return cart;
	}

	// delete cart
	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart) {
		if (cart == null) { /* check cart null? */
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}

	// tong so luong product
	public int TotalProducts(HashMap<Integer, CartDto> cart) {
		int totalQuanty = 0;
		for (Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}

	// tong so tien thanh toan
	public double TotalPrice(HashMap<Integer, CartDto> cart) {
		int totalPrice = 0;
		for (Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}

}
