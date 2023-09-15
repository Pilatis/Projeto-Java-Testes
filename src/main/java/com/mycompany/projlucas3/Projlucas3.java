

package com.mycompany.projlucas3;

import java.util.Scanner;

public class Projlucas3 {

    public static void main(String[] args) {
        
    //Preços de Refrigerante
    double preco350ml = 1.20;
    double preco600ml = 1.80;
    double preco2l = 2.80;
    
    //Quantidade de Produtos Vendidos
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Quantidade de Latas Vendidas: ");
    int latasvendidas = scanner.nextInt();
    
    System.out.print("Quantidade de refri de 600ml vendidas: ");
    int refri600vendidos = scanner.nextInt();
    
    System.out.print("Quantidade de refri 2l vendidas: ");
    int refri2lvendidos = scanner.nextInt();
    
    //Quantidade de Litros vendidos
    double litrosvendidos = (latasvendidas * 0.35) + (refri600vendidos * 0.6) + (refri2lvendidos * 2);
    double valorvendido = (latasvendidas * preco350ml) + (refri600vendidos * preco600ml) + (refri2lvendidos * preco2l);
    
    System.out.println("Total de Litros Vendidos: " + litrosvendidos);
    System.out.println("Valor Total vendido: " + valorvendido);
    
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
