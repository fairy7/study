package com.study.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int findBookPriceByIsbn(String isbn) {
        String sql = "SELECT PRICE FROM BOOK WHERE ISBN = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, isbn);
    }

    @Override
    public void updateBookStock(String isbn) {
        String sql0 = "SELECT STOCK FROM BOOK_STOCK WHERE ISBN = ?";
        int stock =  jdbcTemplate.queryForObject(sql0, Integer.class, isbn);
        if (stock <= 0) {
            throw new BookStockException("库存不足");
        }
        String sql = "UPDATE BOOK_STOCK SET STOCK = STOCK - 1 WHERE ISBN = ?";
        jdbcTemplate.update(sql, isbn);
    }

    @Override
    public void updateUserAccount(String username, int price) {
        String sql0 = "SELECT BALANCE FROM ACCOUNT WHERE USERNAME = ?";
        int balance =  jdbcTemplate.queryForObject(sql0, Integer.class, username);
        if (balance < price) {
            throw new UserAccountException("余额不足");
        }

        String sql = "UPDATE ACCOUNT SET BALANCE = BALANCE - ? WHERE USERNAME = ?";
        jdbcTemplate.update(sql, price, username);
    }
}
