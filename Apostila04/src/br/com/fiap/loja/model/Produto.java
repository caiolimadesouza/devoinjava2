package br.com.fiap.loja.model;

public class Produto {

    //public - modificador de acesso que permite que todos tenham acesso
    public double preco;
    public int quantidade;
    public String nome;
    public boolean garantia;

    public Categoria categoria;


    public double CalcularDesconto(){
        //calcular o valor do produto com 10% de desconto
        double PrecoComDesconto =  preco * 0.9;
        return  PrecoComDesconto;
    }

    public void alterarpreco(double novopreco){
        preco = novopreco;

    }
    public double calcularDescontoPorQuantidade(int qtd){
        double valorFinal;
        if(qtd >= 5 && qtd < 10){
            valorFinal =preco - (preco *0.15);
        } else if (qtd >= 10) {
            valorFinal = preco - (preco * 0.2);
        } else{
            valorFinal = preco - (preco * 0.1);
        }
        return valorFinal;
    }

}
