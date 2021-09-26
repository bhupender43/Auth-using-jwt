package com.animalcare.centre.repository;

import com.animalcare.centre.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail,Integer> {
    UserDetail findById(Long id);
}
