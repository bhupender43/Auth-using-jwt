package com.animalcare;

import com.animalcare.security.models.ERole;
import com.animalcare.security.models.Role;
import com.animalcare.security.repository.RoleRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.*"})
@EntityScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = {"com.*"})
public class BackendApp {

    @Autowired
    private RoleRepository roleRepository;

    public static void main(String[] args) {
        SpringApplication.run(BackendApp.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
        return () -> {

            Role role = new Role();
            role.setId(1);
            role.setName(ERole.ROLE_USER);
            roleRepository.save(role);
            role.setId(2);
            role.setName(ERole.ROLE_ADMIN);
            roleRepository.save(role);
            role.setId(3);
            role.setName(ERole.ROLE_MODERATOR);
            roleRepository.save(role);
        };
    }
}
