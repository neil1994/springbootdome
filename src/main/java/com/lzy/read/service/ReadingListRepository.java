package com.lzy.read.service;

import com.lzy.read.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User : zhiyong.li
 * <p>
 * created time : 2017-05-2017/5/11,16:59
 */
public interface ReadingListRepository  extends JpaRepository<Book,Long>{
    List<Book> findByReader(String reader);
}
