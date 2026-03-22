package trabalho.java.lista.exercicios.Produto.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "Produto")
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto")
    private String nome;

    @Column(name = "preco_produto")
    private BigDecimal preco;

    @Column(name = "estoque_produto")
    private Integer estoque;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}