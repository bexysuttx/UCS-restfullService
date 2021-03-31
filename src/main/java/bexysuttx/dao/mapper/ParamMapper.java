package bexysuttx.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import bexysuttx.entity.Ttable;

public class ParamMapper implements RowMapper<Ttable> {

    @Override
    public Ttable mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ttable ttable = new Ttable();
        ttable.setId(rs.getInt("id"));
        ttable.setValue(rs.getString("value"));
        return ttable;
    }

}
