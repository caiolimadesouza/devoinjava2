package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Categoria;
import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        //Objeto para ler os dados do teclado
        Scanner entrada = new Scanner(System.in);

        //Ler os dados do produto
        System.out.println("Digite o nome do produto");
        String nome = entrada.next() + entrada.nextLine();

        System.out.println("Digite a quantidade do produto");
        int quantidade = entrada.nextInt();

        System.out.println("Digite o valor do produto");
        double valor = entrada.nextDouble();

        System.out.println("Possui garantia (true/false)");
        boolean garantia = entrada.nextBoolean();

        //Receber os valores da categoria (nome e descrição)
        System.out.println("Digite o nome da categoria");
        String nomeCategoria = entrada.next() + entrada.nextLine();

        System.out.println("Digite a descrição da categoria");
        String descricaoCategoria = entrada.next() + entrada.nextLine();

        //Criar o objeto produto
        Produto produto = new Produto();

        //Atribuir os valores ao objeto
        produto.nome = nome;
        produto.preco = valor;
        produto.garantia = garantia;
        produto.quantidade = quantidade;

        //Criar a categoria
        Categoria categoria = new Categoria();

        //Adicionar os valores nos atributos da categoria
        categoria.nome = nomeCategoria;
        categoria.descricao = descricaoCategoria;

        //Colocar a categoria no produto
        produto.categoria = categoria;

        //Exibir os valores dos atributos
        System.out.println("Dados do produto:");
        System.out.println(produto.nome + ", quantidade: " + produto.quantidade);
        System.out.println("R$ " + produto.preco + ", tem garantia: " + produto.garantia);
        System.out.println("Categoria: " + produto.categoria.nome + ", descrição: " + produto.categoria.descricao);

        //receber o valor do produto com desconto
        double  churros = produto.CalcularDesconto();
        System.out.println("valor promocional: " + churros);

        //alterar o valor do produto
        System.out.println("digite o novo valor do produto");
        double preconovo = entrada.nextDouble();
        produto.alterarpreco(preconovo);
        System.out.println("Novo preço: " + produto.preco);

        //ler a quantidade de produto que o cliente quer
        System.out.println("digite a quantidade desejada");
        int qtdintens = entrada.nextInt();
        //calcular o valor com o desconto
        double valorfinal = produto.calcularDescontoPorQuantidade(qtdintens);
        //exibir o valor
        System.out.println("valor final com desconto: +" + valorfinal);
        entrada.close();

    }
}
