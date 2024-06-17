package com.example.MaiTheNghia_QLSach_Tuan3.enity;

import com.example.MaiTheNghia_QLSach_Tuan3.validator.annotation.ValidCategoryId;
import com.example.MaiTheNghia_QLSach_Tuan3.validator.annotation.ValidUserId;
import com.example.MaiTheNghia_QLSach_Tuan3.validator.annotation.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotEmpty(message = "Title khong hop le!")
    @Size(max = 50,min = 1, message = "Tieu de khong duoc qua 50 ky tu")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "price")
    @NotNull(message = "Price can phai nhap!")
    private Double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ValidUserId
    private User user;

}


