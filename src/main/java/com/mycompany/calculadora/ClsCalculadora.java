package com.mycompany.calculadora;

import javax.swing.JOptionPane;


public class ClsCalculadora {

    //ATRIBUTOS
    private double num1;
    private double num2;

    //CONSTRUCTORES
    public ClsCalculadora() {

    }

    public ClsCalculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //GETTER SETTER
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //METODOS
    public double sumar() {

        double suma = this.getNum1() + this.getNum2();
        return suma;

    }

    public double restar() {

        double resta = this.getNum1() - this.getNum2();
        return resta;
    }

    public double multiplicar() {

        double multiplicacion = this.getNum1() * this.getNum2();
        return multiplicacion;
    }

    public double dividir() {

        double division = this.getNum1() / this.getNum2();
        return division;
    }

    public double potencia() {
        double potencia = Math.pow(this.getNum1(), this.getNum2());
        return potencia;
    }

    public double raiz() {
        double raiz = Math.sqrt(getNum1());
        return raiz;
    }

    public void iniciarPrograma() {

        String opcion;
        do {
            String menu = JOptionPane.showInputDialog("""
                                                     Seleccione una opción:
                                                                                                             
                                                                      1. Operaciones
                                                                      2. Salir  
                                                      
                                                      """);
            opcion = menu;
            
            switch(opcion){
                case "1":
                    iniciaMenu();
                case "2":
                    JOptionPane.showMessageDialog(null, "GRACIAS");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
            }
            
        }while (!opcion.equals("2"));       
    }
    
    public void Numeros(){
        try{
            this.setNum1(Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO")));
            this.setNum2(Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO")));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Solo números");
            Numeros();
        }
    }
    
    public void Numero(){
        try{
            this.setNum1(Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO")));
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Solo números");
            Numero();
    }
    }    
    
    public void iniciaMenu(){
        String opcionOp;
        
        do{
            String menuOp= JOptionPane.showInputDialog("""
                                                       Seleccione una Operación:
                                                                                                              
                                                                       1. Sumar
                                                                       2. Restar
                                                                       3. Multiplicación
                                                                       4. División
                                                                       5. Potencia
                                                                       6. Raíz cuadrada de un número
                                                                       7. Salir           
                                                       
                                                       """);
            opcionOp= menuOp;
            
            switch(opcionOp){
                case "1":
                    Numeros();
                    JOptionPane.showMessageDialog(null,"La suma es :" + String.format("%.2f",sumar()));
                    iniciaMenu();
                case "2":
                    Numeros();
                    JOptionPane.showMessageDialog(null,"La resta es: " + String.format("%.2f",restar()));
                    iniciaMenu();
                case"3":
                    Numeros();
                    JOptionPane.showMessageDialog(null,"La multiplicación es: " + String.format("%.2f",multiplicar()));
                    iniciaMenu();
                case"4":
                    Numeros();
                    JOptionPane.showMessageDialog(null,"La divisón es: " + String.format("%.2f",dividir()));
                    iniciaMenu();
                case "5":
                    Numeros();
                    JOptionPane.showMessageDialog(null,"La potencia es: " + String.format("%.2f",potencia()));
                    iniciaMenu();
                case "6":
                    Numero();
                    JOptionPane.showMessageDialog(null,"La raíz es: " + String.format("%.2f",raiz()));
                    iniciaMenu();
                case "7":
                    JOptionPane.showMessageDialog(null,"Gracias");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta");
                            }
            }while (!opcionOp.equals("7"));
        }
       
    }
