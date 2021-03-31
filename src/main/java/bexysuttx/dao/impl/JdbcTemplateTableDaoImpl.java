package bexysuttx.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import bexysuttx.dao.JdbcTemplateTableDao;
import bexysuttx.dao.mapper.ParamMapper;
import bexysuttx.entity.Ttable;

public class JdbcTemplateTableDaoImpl implements JdbcTemplateTableDao {

	
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Ttable getParambyId(Object id, String sqlTemplate) {
		Ttable ttable = jdbcTemplate.queryForObject(sqlTemplate, new Object[] {id}, new ParamMapper());
		return ttable;
	}
}
