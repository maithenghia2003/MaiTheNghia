package com.example.MaiTheNghia_QLSach_Tuan3.repository;

import com.example.MaiTheNghia_QLSach_Tuan3.enity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
