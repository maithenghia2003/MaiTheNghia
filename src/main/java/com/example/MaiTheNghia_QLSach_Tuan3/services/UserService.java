package com.example.MaiTheNghia_QLSach_Tuan3.services;

import com.example.MaiTheNghia_QLSach_Tuan3.enity.User;
import com.example.MaiTheNghia_QLSach_Tuan3.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IuserRepository iuserRepository;
    public void save(User user){
        iuserRepository.save(user);
    }

}
