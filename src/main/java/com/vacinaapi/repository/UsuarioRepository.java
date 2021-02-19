package com.vacinaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vacinaapi.model.Usuario;

@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}
