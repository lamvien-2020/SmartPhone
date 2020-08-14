package SmartPhone.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProducts implements RowMapper<Products>{

	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Products products = new Products();
		products.setId(rs.getInt("id"));
		products.setId_catagory(rs.getInt("id_catagory"));
		products.setName(rs.getString("name"));
		products.setPrice(rs.getDouble("price"));
		products.setDetail(rs.getString("detail"));
		products.setImg(rs.getString("img"));
		return products;
	}
}
