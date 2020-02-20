package com.mkyong;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByName(String name);
    
    //select * from book order by id desc
//    @Query("select u from book ")
//    List<Book> listBook(String name);
    
    @Query(value = "select * from book order by id desc", nativeQuery = true)
    List<Book> sortById();
    
    @Query(value="select * from book order by id offset ?1 fetch next ?2 rows only",nativeQuery=true)
    List<Book> Pagination(int page,int rows);
    
    

}
