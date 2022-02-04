/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixasupermercado;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author 171052485
 */
public class CaixaSupermercado {

    public static void main(String[] args) {
        Registradora minhaReg = new Registradora();
        int y = -1;
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("Digite 1 para iniciar a venda ou 0 para sair do app");
            y = in.nextInt();
            if(y==1){           
               minhaReg.iniciarVenda();              
               int x = 0;
               do{       
                System.out.println("Digite 2 para incluir um item ou 3 para concluir a venda");
                x = in.nextInt();
                if(x==2){
                    System.out.println("Digite o codigo de barras: ");
                    int id = in.nextInt();
                    System.out.println("Digite a quantidade: ");
                    int qtd = in.nextInt();
                    minhaReg.incluirItem(id, qtd);
                }        
               }while(x != 3);
                //int valorPago = in.nextInt();
                minhaReg.concluirVenda();  
                System.out.println("Digite o valor pago: ");
                float valorPago = in.nextFloat();
                minhaReg.pagamento(valorPago);
                minhaReg.getTroco();
                }
        } while(y != 0);
       
    }
}
   

    




