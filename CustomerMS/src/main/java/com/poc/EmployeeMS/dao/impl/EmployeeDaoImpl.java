package com.poc.EmployeeMS.dao.impl;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.transaction.annotation.Transactional;

import com.poc.CustomerMS.model.CustomerModel;
import com.poc.EmployeeMS.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Transactional
	public CustomerModel getEmployeeDetailByID(Integer rollNo) {
		CustomerModel employeeModel = (CustomerModel) jdbcTemplate.queryForObject(
				"select * from EMPLOYEE_DETAIL where ID = ?", new Object[] { rollNo }, (ResultSet rs, int row) -> {
					CustomerModel stdModel = new CustomerModel();
					stdModel.setId(rs.getInt("ID"));
					stdModel.setName(rs.getString("NAME"));
					stdModel.setContactNo(rs.getLong("CONTACT_NO"));
					stdModel.setAddress(rs.getString("ADDRESS"));
					return stdModel;
				});
		return employeeModel;
	}

	@Transactional
	public List<CustomerModel> getAllEmployeeDetails() {
		List<CustomerModel> employeeModelLst = (List<CustomerModel>) jdbcTemplate.query("select * from EMPLOYEE_DETAIL",
				(ResultSet rs, int row) -> {
					CustomerModel employeeModel = new CustomerModel();
					employeeModel.setId(rs.getInt("ID"));
					employeeModel.setName(rs.getString("NAME"));
					employeeModel.setContactNo(rs.getLong("CONTACT_NO"));
					employeeModel.setAddress(rs.getString("ADDRESS"));

					return employeeModel;
				});
		return employeeModelLst;
	}

	@Transactional
	public int addEmployee(CustomerModel employeeModel) {
		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		simpleJdbcInsert.withTableName("EMPLOYEE_DETAIL").usingGeneratedKeyColumns("ID");
		Map<String, Object> parameters = new HashMap<String, Object>(4);
		parameters.put("NAME", employeeModel.getName());
		parameters.put("CONTACT_NO", employeeModel.getContactNo());
		parameters.put("ADDRESS", employeeModel.getAddress());
		Number insertedId = simpleJdbcInsert.executeAndReturnKey(parameters);
		return insertedId.intValue();
	}

	@Transactional
	public int updateEmployee(CustomerModel employeeModel) {
		String sql = "update EMPLOYEE_DETAIL set NAME = ? , CONTACT_NO=? , ADDRESS= ? where ID = ?";
		int resp = jdbcTemplate.update(sql,
				new Object[] { employeeModel.getName(), employeeModel.getContactNo(), employeeModel.getAddress(), employeeModel.getId() });
		return resp;

	}

	@Transactional
	public int deleteEmployeeDetail(Integer id) {
		int resp = jdbcTemplate.update("delete from EMPLOYEE_DETAIL where ID = ?", id);
		return resp;
	}
}
