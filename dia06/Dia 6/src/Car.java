public class Car {
    private String marca;
    private String modelo;
    private int ano;

    //construtcor
    Car(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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
}
