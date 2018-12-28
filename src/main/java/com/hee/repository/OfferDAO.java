package com.hee.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository("offerDAO")
public class OfferDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getRowCount() {
        String sqlStatement = "select count(*) from offers";
        return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
    }
}
