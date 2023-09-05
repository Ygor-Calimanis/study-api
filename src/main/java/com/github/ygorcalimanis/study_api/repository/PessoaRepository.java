package com.github.ygorcalimanis.study_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.ygorcalimanis.study_api.model.Pessoa;

@Repository
public interface PessoaRepository 
	extends JpaRepository<Pessoa, Long> {

}
