
package bexysuttx.service;


import java.util.List;


public interface BussinessService {
    String findRowById(String sqlQuery, List<Integer> id);
}
