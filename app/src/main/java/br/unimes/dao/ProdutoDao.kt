package br.unimes.dao;

import br.unimes.model.Produto;
import kotlin.jvm.internal.markers.KMutableList;

class ProdutoDao {
    companion object{
        private var produto : Produto? = null
    }
    fun addProduto(prod:Produto){
        produto = prod

    }
    fun obterProduto(): Produto{
        return Companion.produto?:Produto();
    }

}
