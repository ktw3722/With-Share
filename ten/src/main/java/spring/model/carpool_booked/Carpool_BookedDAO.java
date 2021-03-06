package spring.model.carpool_booked;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.model.ten.DAOMyBatisInter;
@Component
public class Carpool_BookedDAO implements DAOMyBatisInter {
	@Autowired
	private SqlSessionTemplate mybatis;

	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	@Override
	public int create(Object dto) throws Exception {
		return mybatis.insert("carpool_booked.create", dto);
	}

	@Override
	public List<Carpool_BookedDTO> list(Map map) throws Exception {
		return mybatis.selectList("carpool_booked.list", map);
	}

	public List<Carpool_BookedDTO> read_reserving(Map map) throws Exception {
		return mybatis.selectList("carpool_booked.read_reserving", map);
	}
	
	public List<Carpool_BookedDTO> read_reserved(Map map) throws Exception {
		return mybatis.selectList("carpool_booked.read_reserved", map);
	}
	
	@Override
	public Object read(Object pk) throws Exception {
		return mybatis.selectOne("carpool_booked.read", pk);

	}
	@Override
	public int update(Object dto) throws Exception {
		return mybatis.update("carpool_booked.update", dto);

	}

	@Override
	public int delete(Object pk) throws Exception {
		return mybatis.delete("carpool_booked.delete", pk);
	}

	@Override
	public int total(Map map) throws Exception {
		return 0;
	}

	public int total_reserving(Map map) throws Exception {
		return mybatis.selectOne("carpool_booked.total_reserving", map);
	}
	
	public int total_reserved(Map map) throws Exception {
		return mybatis.selectOne("carpool_booked.total_reserved", map);
	}
}
