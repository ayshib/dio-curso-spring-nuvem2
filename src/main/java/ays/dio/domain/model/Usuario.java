package ays.dio.domain.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    @OneToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Recurso> recursos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Noticia> noticias;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Cartao getCartao() {
        return cartao;
    }
    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
    public List<Recurso> getRecursos() {
        return recursos;
    }
    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
    public List<Noticia> getNoticias() {
        return noticias;
    }
    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }
}
