package com.study.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("bookService")
public class BookShopServiceImpl implements BookShopService {

    @Autowired
    private BookShopDao bookShopDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW,
    isolation = Isolation.READ_COMMITTED,
    noRollbackFor = {UserAccountException.class},
    readOnly = false,
    timeout = 3)
    @Override
    public void purchase(String username, String isbn) {
        bookShopDao.updateBookStock(isbn);
        int price = bookShopDao.findBookPriceByIsbn(isbn);
        bookShopDao.updateUserAccount(username, price);
    }
}
