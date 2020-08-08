/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;


public class Calculadora {
    
    public static double soma(double a, double b){
        double res = a + b;
        return res;
    }
    
    public static double subtracao(double a, double b){
        double res = a - b;
        return res;
    }
    
    public static double multiplicacao(double a, double b){
        double res = a * b;
        return res;
    }    
    
    public static double divisao(double a, double b){
        double res = a / b;
        return res;
    }
    
    public static double quadrado(double a){
        double res = Math.pow(a, 2);
        return res;
    }    
    
    public static void calculo(){
        
        Scanner teclado = new Scanner(System.in);
        double resultado = 0;
        
        System.out.println("+: Soma");
        System.out.println("-: Subtração");
        System.out.println("*: Multiplicação");
        System.out.println("/: Divisão:");
        System.out.println("^: Quadrado");
        System.out.println("Digite uma operação: ");
        String op = teclado.nextLine();
               
        if(op.equals("+")){
            System.out.println("Digite um numero: ");
            double x = teclado.nextFloat();
            System.out.println("Digite outro numero");
            double y = teclado.nextFloat();
            resultado = soma(x, y);
            System.out.println(x + " + " + y + " = " + resultado );
        }
        if(op.equals("-")){
            System.out.println("Digite um numero: ");
            double x = teclado.nextFloat();
            System.out.println("Digite outro numero");
            double y = teclado.nextFloat();
            resultado = subtracao(x, y);
            System.out.println(x + " - " + y + " = " + resultado );
        }
        if(op.equals("*")){
            System.out.println("Digite um numero: ");
            double x = teclado.nextFloat();
            System.out.println("Digite outro numero");
            double y = teclado.nextFloat();
            resultado = multiplicacao(x, y);
            System.out.println(x + " * " + y + " = " + resultado );
        }
        if(op.equals("/")){
            System.out.println("Digite um numero: ");
            double x = teclado.nextFloat();
            System.out.println("Digite outro numero");
            double y = teclado.nextFloat();
            resultado = divisao(x, y);
            System.out.println(x + " / " + y + " = " + resultado );
        }
        if(op.equals("^")){
            System.out.println("Digite um numero: ");
            double x = teclado.nextFloat();
            resultado = quadrado(x);
            System.out.println(x + " ^ 2 = " + resultado );
        }
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String resposta = "";
        
        do{
            calculo();
            System.out.println("Deseja realizar outro calculo? (S/N)");
            resposta = teclado.nextLine().toLowerCase();
        }while(resposta.equals("s"));        
        
    }
}
