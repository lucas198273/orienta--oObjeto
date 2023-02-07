package orientaçãoobjeto.exercicioveiculos;

class Carro extends Veiculo  {
        String cor;
        String modelo;

        int valorCombustivel;
        int capacidadeTanque;

        // construtor abaixo dos atributos
        
        Carro(){
            
        }
        Carro(String cor, String modelo, int capacidadeTanque) {
            this.cor = cor ;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }
        // construtor aqui

    

        void setCor (String cor){
            this.cor = cor;
        }
        String getCor(){
            return cor;
        }
        void setModelo( String modelo){
            this.modelo  = modelo;
        }
        String getModelo(){
            return modelo;
        }
        void setCapacidaeTanque( int capacidadeTanque){
            this.capacidadeTanque = capacidadeTanque;

        }
        int getCapacidadeTanque(){
            return capacidadeTanque;
        }
        double totalValorTanque(double valorCombustivel){
            return capacidadeTanque * valorCombustivel;
        }



    }

