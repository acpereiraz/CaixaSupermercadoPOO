/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixasupermercado;

import java.util.Iterator;

/**
 *
 * @author 171052485
 */
public class ItemDeVenda {
    int qtd;
    EspecProduto espec;

    public ItemDeVenda(int qtd, EspecProduto espec) {
        this.qtd = qtd;
        this.espec = espec;
    }
    
    public float getSubTotal(){
        float subtotal;
        subtotal = espec.getPreco() * qtd ;
        
        return subtotal;        
           }     
}
