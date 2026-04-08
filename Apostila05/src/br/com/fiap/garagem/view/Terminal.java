package br.com.fiap.garagem.view;

import br.com.fiap.garagem.model.carro;

public class Terminal {
    public static void main(String[] args) {

        carro onix = new carro();
        onix.setPlaca("gas9821");
        onix.setValor(22);
        onix.setHoraEntrada("14:00");
        onix.setHoraSaida("18:00");
        onix.setPreferencial(true);
        onix.setSetor('w');
        onix.setNumeroVaga(321);

        //entrada de dados
        System.out.println("placa: " + onix.getPlaca());
        System.out.println("hora de entrada: " + onix.getHoraEntrada());
        System.out.println("hora de saida: " + onix.getHoraSaida());
        System.out.println("setor: " + onix.getSetor());
        System.out.println("preferencial: " + onix.isPreferencial());
        System.out.println("valor a pagar: " + onix.getValor());

    }

}
