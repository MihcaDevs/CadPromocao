package com.acosta.cadpromo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acosta.cadpromo.domain.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Long>{

}
