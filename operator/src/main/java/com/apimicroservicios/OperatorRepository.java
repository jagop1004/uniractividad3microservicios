package com.apimicroservicios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apimicroservicios.Datos.Datos;

public interface OperatorRepository extends JpaRepository<Datos, Long> {
}
