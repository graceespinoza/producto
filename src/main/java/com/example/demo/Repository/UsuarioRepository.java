package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuarios;



public interface UsuarioRepository extends JpaRepository<Usuarios, Long> { 
	
	//metodo para poder buscar un usuario mediante su nombre
	
	Optional<Usuarios> findByUsername(String username); 
	
	//metodo para poder verificar si un usuario existe en nuestra bd 
	Boolean existsByUsername(String username);

}
