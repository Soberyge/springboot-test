package com.codemjz.test.springboot.app.models;

import java.math.BigDecimal;

public class CuentaDTO {
    /**
     * id.
     */
    private Long id;
    /**
     * nombre.
     */
    private String nombre;
    /**
     * saldo.
     */
    private BigDecimal saldo;

    /**
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param setId
     */
    public void setId(final Long setId) {
        this.id = setId;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param setNombre
     */
    public void setNombre(final String setNombre) {
        this.nombre = setNombre;
    }

    /**
     *
     * @return saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     *
     * @param setSaldo
     */
    public void setSaldo(final BigDecimal setSaldo) {
        this.saldo = setSaldo;
    }
}
