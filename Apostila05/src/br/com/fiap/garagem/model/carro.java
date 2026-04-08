package br.com.fiap.garagem.model;

public class carro {

        private String placa;
        private double numeroVaga;
        private boolean preferencial;
        private  char setor;
        private String HoraEntrada;
        private String HoraSaida;
        private double valor;

        double calcularvalorPagar(){
            return 0;
        }

        //metodos getter e setters

         public String getPlaca() {
            return placa;
         }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public double getValor(){
            return valor;
        }
        public void setValor(double valor){
           this.valor = valor;
        }

        public double getNumeroVaga() {
            return numeroVaga;
        }

        public void setNumeroVaga(double numeroVaga) {
            this.numeroVaga = numeroVaga;
        }

        public String getHoraEntrada() {
            return HoraEntrada;
        }

        public void setHoraEntrada(String horaEntrada) {
            HoraEntrada = horaEntrada;
        }

        public String getHoraSaida() {
            return HoraSaida;
        }

        public void setHoraSaida(String horaSaida) {
            HoraSaida = horaSaida;
        }

        public char getSetor() {
            return setor;
        }

        public void setSetor(char setor) {
            this.setor = setor;
        }

        public boolean isPreferencial() {
            return preferencial;
        }

        public void setPreferencial(boolean preferencial) {
            this.preferencial = preferencial;
        }

}
