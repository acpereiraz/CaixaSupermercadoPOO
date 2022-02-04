/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixasupermercado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 171052485
 */
class Venda{
    ArrayList itensDeVenda;
    Pagamento P;
    
public Venda(){
    itensDeVenda = new ArrayList();
}

public float getTotal(){
    float total = 0.f;

    Iterator i = itensDeVenda.iterator();
    while(i.hasNext()) {

        ItemDeVenda meuItemVenda = (ItemDeVenda) i.next();  
        total =    meuItemVenda.getSubTotal() + total;

    }     
    return total;
}

public float getTroco(){
    float val = P.getValorPago();
    float t = this.getTotal();
    float troco = val - t;   
    return troco;
}

public void incluirItemDeVenda(EspecProduto espec, int quant) {
    //instanciar o item de venda passando os parametros
    //incluir o item de venda no arraylist
    ItemDeVenda iv = new ItemDeVenda(quant,espec);
    itensDeVenda.add(iv);
    
    }
    
    public void efetuarPagamento(float valorPago){
        P = new Pagamento(valorPago);
    }
}    