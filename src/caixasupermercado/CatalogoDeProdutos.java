/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixasupermercado;

import java.util.HashMap;

/**
 *
 * @author 171052485
 */
class CatalogoDeProdutos{
        
        HashMap<Integer, EspecProduto > hashEspecProduto;
        
    public CatalogoDeProdutos(){
        hashEspecProduto = new HashMap();
        EspecProduto espec1 = new EspecProduto(5432,"1 kg arroz", 1.99f);
        EspecProduto espec2 = new EspecProduto(5433,"1 kg feijao", 4.99f);
        EspecProduto espec3 = new EspecProduto(5434,"molho de tomate", 1.99f);
        EspecProduto espec4 = new EspecProduto (5435,"Fanta Laranja", 5.99f);
        hashEspecProduto.put(5432, espec1);
        hashEspecProduto.put(5433, espec2);
        hashEspecProduto.put(5434, espec3);
        hashEspecProduto.put(5435, espec4);
    }
       public EspecProduto getEspecificacao(int id){
        
          return this.hashEspecProduto.get(id);
       }
      
}