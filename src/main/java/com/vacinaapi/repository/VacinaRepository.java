package com.vacinaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vacinaapi.model.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {

}
