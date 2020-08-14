package SmartPhone.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCatagories implements RowMapper<Catagories>{

	public Catagories mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Catagories catagories = new Catagories();
		catagories.setId(rs.getInt("id"));
		catagories.setProduct(rs.getString("product"));
		catagories.setComment(rs.getString("comment"));
		return catagories;
	}

	
}
