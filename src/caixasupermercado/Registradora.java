/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixasupermercado;
import java.util.*;
/**
 *
 * @author 171052485
 */
class Registradora{
    CatalogoDeProdutos Catalogo;
    Venda V;  
    
    public void iniciarVenda(){
    V = new Venda();
    
        // instanciar um objeto venda
       //     guardar esse objeto como atributo           
    }
    
    public void concluirVenda(){
        System.out.println("Total: " + V.getTotal()); 
    }
    
    public void incluirItem(int id, int qtd){
     EspecProduto espec = Catalogo.getEspecificacao(id);
     V.incluirItemDeVenda(espec, qtd);
    }
    
    public Registradora() {    
        Catalogo = new CatalogoDeProdutos();
    }           
    
    public void pagamento(float valorPago){
        V.efetuarPagamento(valorPago);
    }
    
    public void getTroco(){
        System.out.println("Troco: " + V.getTroco());
    }
    
}