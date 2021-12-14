package dominio;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nameProduto;
    private Double valueProduto;
    @ManyToOne
    private Pessoa pessoa;

    public Produto(Integer id, String nameProduto, Double valueProduto, Pessoa pessoa) {
        Id = id;
        this.nameProduto = nameProduto;
        this.valueProduto = valueProduto;
        this.pessoa = pessoa;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNameProduto() {
        return nameProduto;
    }

    public void setNameProduto(String nameProduto) {
        this.nameProduto = nameProduto;
    }

    public Double getValueProduto() {
        return valueProduto;
    }

    public void setValueProduto(Double valueProduto) {
        this.valueProduto = valueProduto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
