
package bexysuttx.service.impl;

import bexysuttx.dao.JdbcTemplateTableDao;
import bexysuttx.entity.Ttable;
import bexysuttx.service.BussinessService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class BussinessServiceImpl implements BussinessService{
    
    @Autowired
    private JdbcTemplateTableDao jdbcTemplateTableDao;

    @Override
    public String findRowById(String sqlQuery, List<Integer> id)  {
        Object[] arrayId = id.toArray();
        StringBuilder result = new StringBuilder();
        for ( int i=0; i<arrayId.length; i++) {
            Ttable resultEntity = jdbcTemplateTableDao.getParambyId(arrayId[i],sqlQuery);
            result.append(resultEntity + ",\"response\": \"ok\",\"request\":"+arrayId[i]+"}\t\n");
     
        }
        return result.toString();
    }
    
}
