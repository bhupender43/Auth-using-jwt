package com.animalcare.service;

import com.animalcare.model.UserDetail;
import com.animalcare.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userManagementService")
public class UserService {
    @Autowired
    UserDetailRepository userRepository;

    public UserDetail getUser(Long id){
        return  userRepository.findByUserId(id);
    }


    public void saveUser(Long id,String email,String name){
        UserDetail user=new UserDetail();
        user.setUserId(id);
        user.setEmail(email);
        user.setName(name);
        userRepository.save(user);
    }



}
