package pojo;
// Generated 06/01/2015 21:06:17 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Gastoloteboi generated by hbm2java
 */
public class Gastoloteboi  implements java.io.Serializable {


     private GastoloteboiId id;
     private Gasto gasto;
     private Loteboi loteboi;
     private int gbQteProduto;
     private BigDecimal gbValorProduto;

    public Gastoloteboi() {
    }

	
    public Gastoloteboi(GastoloteboiId id, Gasto gasto, Loteboi loteboi, int gbQteProduto) {
        this.id = id;
        this.gasto = gasto;
        this.loteboi = loteboi;
        this.gbQteProduto = gbQteProduto;
    }
    public Gastoloteboi(GastoloteboiId id, Gasto gasto, Loteboi loteboi, int gbQteProduto, BigDecimal gbValorProduto) {
       this.id = id;
       this.gasto = gasto;
       this.loteboi = loteboi;
       this.gbQteProduto = gbQteProduto;
       this.gbValorProduto = gbValorProduto;
    }
   
    public GastoloteboiId getId() {
        return this.id;
    }
    
    public void setId(GastoloteboiId id) {
        this.id = id;
    }
    public Gasto getGasto() {
        return this.gasto;
    }
    
    public void setGasto(Gasto gasto) {
        this.gasto = gasto;
    }
    public Loteboi getLoteboi() {
        return this.loteboi;
    }
    
    public void setLoteboi(Loteboi loteboi) {
        this.loteboi = loteboi;
    }
    public int getGbQteProduto() {
        return this.gbQteProduto;
    }
    
    public void setGbQteProduto(int gbQteProduto) {
        this.gbQteProduto = gbQteProduto;
    }
    public BigDecimal getGbValorProduto() {
        return this.gbValorProduto;
    }
    
    public void setGbValorProduto(BigDecimal gbValorProduto) {
        this.gbValorProduto = gbValorProduto;
    }




}

