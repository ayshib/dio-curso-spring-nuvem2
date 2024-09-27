package ays.dio.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "tb_cartao")
public class Cartao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String numero;

    @Column(precision = 2, scale = 13)
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
    public BigDecimal getLimite() {
        return limite;
    }
    public void setNoticias(BigDecimal limite) {
        this.limite = limite;
    }
}
