package com.example.MaiTheNghia_QLSach_Tuan3.services;

import com.example.MaiTheNghia_QLSach_Tuan3.enity.CustomUserDetail;
import com.example.MaiTheNghia_QLSach_Tuan3.enity.User;
import com.example.MaiTheNghia_QLSach_Tuan3.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private IuserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("User not found");
        return new CustomUserDetail(user, userRepository);

    }
}