package com.animalcare.repository;

import com.animalcare.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail,Integer> {
    UserDetail findByUserId(Long id);
}
