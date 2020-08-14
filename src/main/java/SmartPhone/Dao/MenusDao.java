package SmartPhone.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SmartPhone.Entity.MapperMenus;
import SmartPhone.Entity.Menus;

@Repository
public class MenusDao extends BaseDao{	
	public List<Menus> GetDataMenu(){
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM menus";
		list =  _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}
}
