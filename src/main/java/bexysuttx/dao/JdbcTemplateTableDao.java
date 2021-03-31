package bexysuttx.dao;

import javax.sql.DataSource;

import bexysuttx.entity.Ttable;


public interface JdbcTemplateTableDao {
	
	void setDataSource(DataSource dataSource);

	Ttable getParambyId(Object id, String sqlTemplate);

}
