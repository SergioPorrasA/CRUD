package com.registro2.CRUD.repository;

import com.registro2.CRUD.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
