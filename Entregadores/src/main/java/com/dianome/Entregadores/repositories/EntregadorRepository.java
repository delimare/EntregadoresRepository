package com.dianome.Entregadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dianome.Entregadores.models.EntregadorModel;

@Repository
public interface EntregadorRepository extends JpaRepository<EntregadorModel, Integer>{

}