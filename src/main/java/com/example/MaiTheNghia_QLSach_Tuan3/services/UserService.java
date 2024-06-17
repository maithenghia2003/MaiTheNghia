package com.example.MaiTheNghia_QLSach_Tuan3.services;

import com.example.MaiTheNghia_QLSach_Tuan3.enity.User;
import com.example.MaiTheNghia_QLSach_Tuan3.repository.IRoleRepository;
import com.example.MaiTheNghia_QLSach_Tuan3.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IuserRepository iuserRepository;

    @Autowired
    private IRoleRepository iRoleRepository;

    public void save(User user){
        iuserRepository.save(user);
        Long userId = iuserRepository.getUserIdByUsername(user.getUsername());
        Long roleId = iRoleRepository.getRoleIdByName("USER");
        if (roleId != 0 && userId != 0){
            iuserRepository.addRoleToUser(userId, roleId);
        }
    }

}
