package br.com.willbigas.calculadoraspringmvc.model;

public class Calculadora {

    private Integer numero1;
    private Integer numero2;


    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public Integer somar() {
        return numero1 + numero2;
    }
    public Integer subtrair() {
        return numero1 - numero2;
    }
    public Integer multiplicar() {
        return numero1 * numero2;
    }
    public Integer dividir() {
        return numero1 / numero2;
    }


}
