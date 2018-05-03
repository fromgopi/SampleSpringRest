/**
 * @author Muktevigk
 */
package com.example.SimpleSpringBoot.dao;

import com.example.SimpleSpringBoot.beans.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class CityWeatherDaoImpl {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * This method is responsible to interact with relational db and pull the details.
     * @param cityName
     * @return List of cities and famous places in and around the given city.
     * @throws SQLException
     */

    public List<Cities> getCityDetails(String cityName) throws SQLException {

        String sql = "SELECT * FROM cities WHERE city= ?";
        return jdbcTemplate.query(sql, new Object[]{cityName}, (rs, rowNum) -> new Cities(rs.getString("country"), rs.getString("state"), rs.getString("city"), rs.getString("famous_place")));

    }
}
