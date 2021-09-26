package com.animalcare.centre.service;

import com.animalcare.centre.model.UserDetail;
import com.animalcare.centre.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userManagementService")
public class UserService {
    @Autowired
    UserDetailRepository userRepository;

    public UserDetail getUser(Long id){
        return  userRepository.findById(id);
    }


    public void saveUser(Long id,String email){
        UserDetail user=new UserDetail();
        user.setId(id);
        user.setEmail(email);
        userRepository.save(user);
    }



}
