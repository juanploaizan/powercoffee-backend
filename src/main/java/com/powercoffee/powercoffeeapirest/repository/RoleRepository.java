package com.powercoffee.powercoffeeapirest.repository;

import com.powercoffee.powercoffeeapirest.model.Role;
import com.powercoffee.powercoffeeapirest.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(ERole name);

}
