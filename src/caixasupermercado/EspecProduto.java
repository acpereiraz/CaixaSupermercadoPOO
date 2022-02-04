/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixasupermercado;

/**
 *
 * @author 171052485
 */
class EspecProduto{
    
    int idProduto;
    String nomeProduto;
    float precoProduto;  
    
    public float getPreco() {
        return  precoProduto;
    }
    
    public EspecProduto(int idProduto, String nomeProduto, float precoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        
        }   
    
}