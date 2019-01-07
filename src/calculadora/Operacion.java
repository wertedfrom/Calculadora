/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Nahuel
 */
public class Operacion {

    private double operando1, operando2, resultado;
    private String leyenda_operacion = "";
//    private boolean operando1Inicializado = false;

    Operacion() {
        operando1 = 0D;
        operando2 = 0D;
        resultado = 0D;
    }

    public String getLeyenda_operacion() {
        return leyenda_operacion;
    }
    
    public double sumar(String operando2) {
        this.operando2 = convertirOperandoANumero(operando2);
        this.resultado = this.operando1 + this.operando2;
        this.leyenda_operacion += "+" + this.operando2;
        this.operando1 = this.resultado;
        System.out.println("sumo");
        return this.resultado;
    }

    ;
    
    public double restar(String operando2) {
        this.operando2 = convertirOperandoANumero(operando2);
        this.resultado = this.operando1 - this.operando2;
        this.leyenda_operacion += "-" + this.operando2;
        this.operando1 = this.resultado;
        System.out.println("resto");
        return this.resultado;
    }
    
    public double multiplicar(String operando2) {
        this.operando2 = convertirOperandoANumero(operando2);
        this.resultado = this.operando1*this.operando2;
        this.leyenda_operacion += "x" + this.operando2;
        this.operando1 = this.resultado;
        System.out.println("multi");
        return this.resultado;
    }

    ;
    
    public double dividir(String operando2) {
        this.operando2 = convertirOperandoANumero(operando2);
        this.resultado = this.operando1/this.operando2;
        this.leyenda_operacion += "/" + this.operando2;
        this.operando1 = this.resultado;
        System.out.println("divido");
        return this.resultado;
    }

    public double convertirOperandoANumero(String operando) {
        if (operando.isEmpty()) {
            return 0D;
        } else {
            return Double.parseDouble(operando);
        }
    }
    
    public void cargarOperando1(String operando1){
        this.operando1 = convertirOperandoANumero(operando1);
        this.leyenda_operacion += this.operando1;
        System.out.println(this.leyenda_operacion);
    }


    private double igual(String operando2){
        this.resultado=this.convertirOperandoANumero(operando2);
        this.leyenda_operacion += "=" +this.resultado;
        return this.resultado;
    }
    
    public double igual(String operando2, String ultimaOperacion) {
        switch (ultimaOperacion) {
            case "SUMA":
                return this.sumar(operando2);
            case "RESTA":
                return this.restar(operando2);
            case "DIVISION":
                return this.dividir(operando2);
            case "MULTIPLICACION":
                return this.multiplicar(operando2);
            case "IGUAL":
                return this.igual(operando2);
            default:
                return 0;
        }
    }

}