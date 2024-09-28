package ays.dio.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "tb_conta")
public class Conta {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String numero;

    private String agencia;

    @Column(precision = 13, scale = 2)
    private BigDecimal balanco;

    @Column(precision = 13, scale = 2)
    private BigDecimal limite;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setCartao(String agencia) {
        this.agencia = agencia;
    }
    public BigDecimal getBalanco() {
        return balanco;
    }
    public void setBalanco(BigDecimal balanco) {
        this.balanco = balanco;
    }
    public BigDecimal getLimite() {
        return limite;
    }
    public void setNoticias(BigDecimal limite) {
        this.limite = limite;
    }
}

