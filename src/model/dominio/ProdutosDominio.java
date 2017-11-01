
package model.dominio;


public class ProdutosDominio 
{
    private int codigoInterno;
    private String descricao;
    private String categoria;
    private double precoCusto;
    private double precoVenda;
    private String codigoBarras;
    private int QtdFixa;

    public ProdutosDominio() {
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getQtdFixa() {
        return QtdFixa;
    }

    public void setQtdFixa(int QtdFixa) {
        this.QtdFixa = QtdFixa;     
    }
    
    
    
    
}
