package pojo;
// Generated 06/01/2015 21:06:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private Integer prodCodigo;
     private String prodNome;
     private String prodDescricacao;
     private Set gastos = new HashSet(0);

    public Produto() {
    }

	
    public Produto(String prodNome) {
        this.prodNome = prodNome;
    }
    public Produto(String prodNome, String prodDescricacao, Set gastos) {
       this.prodNome = prodNome;
       this.prodDescricacao = prodDescricacao;
       this.gastos = gastos;
    }
   
    public Integer getProdCodigo() {
        return this.prodCodigo;
    }
    
    public void setProdCodigo(Integer prodCodigo) {
        this.prodCodigo = prodCodigo;
    }
    public String getProdNome() {
        return this.prodNome;
    }
    
    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }
    public String getProdDescricacao() {
        return this.prodDescricacao;
    }
    
    public void setProdDescricacao(String prodDescricacao) {
        this.prodDescricacao = prodDescricacao;
    }
    public Set getGastos() {
        return this.gastos;
    }
    
    public void setGastos(Set gastos) {
        this.gastos = gastos;
    }




}


