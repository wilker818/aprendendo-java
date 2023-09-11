public class Car {
    private String marca;
    private String modelo;
    private int ano;
    private double valorVenda;

    //construtcor
    Car(String marca, String modelo, int ano, double valorVenda) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorVenda = valorVenda;
    }

    //getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getValorVenda() {
        // Calcula 10% a mais sobre o valor de venda atual
        double valorComAumento = valorVenda * 1.10;
        return valorComAumento;
    }


    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
