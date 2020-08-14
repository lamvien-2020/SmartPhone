package SmartPhone.Dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import SmartPhone.Entity.MapperProducts;
import SmartPhone.Entity.Products;

@Repository
public class ProductsDao extends BaseDao {

	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id ");
		sql.append(", p.id_catagory ");
		sql.append(", p.name ");
		sql.append(", p.price ");
		sql.append(", p.detail ");
		sql.append(", p.img ");
		sql.append("FROM ");
		sql.append("products AS p ");
		return sql;
	}

	// lay All products hien thi tren Home
	public List<Products> GetDataProduct() {
		String sql = SqlString().toString();
		List<Products> listProducts = _jdbcTemplate.query(sql, new MapperProducts());
		return listProducts;
	}

	// lay product theo ID hien thi tren catagory
	private StringBuffer SqlProductsByID(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND id_catagory = " + id + " ");
		return sql;
	}

	public List<Products> GetAllProductsByID(int id) {
		String sql = SqlProductsByID(id).toString();
		List<Products> listProducts = _jdbcTemplate.query(sql, new MapperProducts());
		return listProducts;
	}

	// lay product hien thi tren detail
	private StringBuffer SqlProductByID(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND id = " + id + " ");
		sql.append("LIMIT 1 ");
		return sql;
	}

	public List<Products> GetProductByID(int id) {
		String sql = SqlProductByID(id).toString();
		List<Products> listProducts = _jdbcTemplate.query(sql, new MapperProducts());
		return listProducts;
	}
	
	// find product hien thi tren cart
	public Products FindProductByID(int id) {
		String sql = SqlProductByID(id).toString();
		Products product = _jdbcTemplate.queryForObject(sql, new MapperProducts());
		return product;
	}
	
}
