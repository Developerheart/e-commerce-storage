package br.com.developer.leonardo.ws.model.produto;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO", schema = "ESTOQUE")
public class ProdutoEntity extends AbstractAuditable<ProdutoEntity, Long> {

    private Long id;

    private String nome;

    private String descricao;



}
