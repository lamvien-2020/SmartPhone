package SmartPhone.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SmartPhone.Entity.Catagories;
import SmartPhone.Entity.MapperCatagories;

@Repository
public class CatagoriesDao extends BaseDao{
	
	public List<Catagories> GetDataCatagory(){
		List<Catagories> list = new ArrayList<Catagories>();
		String sql = "SELECT * FROM catagories";
		list =  _jdbcTemplate.query(sql, new MapperCatagories());
		return list;
	}
}
