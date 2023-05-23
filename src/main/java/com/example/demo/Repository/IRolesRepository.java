package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Roles;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, Long> {
	
	
	Optional<Roles> findByName(String name);
 //metodo para buscar un rol por su nombre en nuetsra bd
}
