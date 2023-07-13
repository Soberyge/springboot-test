package com.codemjz.test.springboot.app.repositories;

import com.codemjz.test.springboot.app.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    /**
     *
     * @param nombre
     * @return cuenta por id
     */
    @Query("select c from Cuenta c where c.nombre=?1")
    Optional<Cuenta> findByNombre(String nombre);
}