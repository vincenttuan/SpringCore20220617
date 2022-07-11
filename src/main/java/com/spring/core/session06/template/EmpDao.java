package com.spring.core.session06.template;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.core.session06.entity.Emp;

// Dao: Data Access Object
@Repository
public class EmpDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;  
	
	// 多筆查詢 I
	public List<Map<String, Object>> queryAll() {
		String sql = "select eid, ename, age, createtime from emp";
		List<Map<String, Object>> emps = jdbcTemplate.queryForList(sql);
		return emps;
	}
	
	// 多筆查詢 II
	public List<Emp> queryAllEmps() {
		String sql = "select eid, ename, age, createtime from emp";
		RowMapper<Emp> rowMapper = (ResultSet rs, int rowNum) -> {
			Emp emp = new Emp();
			emp.setEid(rs.getInt("eid"));
			emp.setEname(rs.getString("ename"));
			emp.setAge(rs.getInt("age"));
			emp.setCreatetime(rs.getTimestamp("createtime"));
			return emp;
		};
		List<Emp> emps = jdbcTemplate.query(sql, rowMapper);
		return emps;
	}
	
	// 多筆查詢 III
	public List<Emp> queryAllEmps2() {
		String sql = "select eid, ename, age, createtime from emp";
		List<Emp> emps = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Emp.class));
		return emps;
	}
	
	// 單筆新增 I
	public int addOne1(String ename, Integer age) {
		String sql = "insert into emp(ename, age) values(?, ?)";
		int rowcount = jdbcTemplate.update(sql, ename, age);
		return rowcount;
	}
	
	// 單筆新增 II
	public int addOne2(String ename, Integer age) {
		String sql = "insert into emp(ename, age) values(:ename, :age)";
		MapSqlParameterSource params = new MapSqlParameterSource()
				.addValue("ename", ename)
				.addValue("age", age);
		int rowcount = namedParameterJdbcTemplate.update(sql, params);
		return rowcount;
	}
	
	// 批次多筆新增 I
	
	
	// 批次多筆新增 II
	
	
	
	
}
