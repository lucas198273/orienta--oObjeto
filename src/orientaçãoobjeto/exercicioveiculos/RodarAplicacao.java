package orientaçãoobjeto.exercicioveiculos;

public class RodarAplicacao {
    
    public static void main(String[] args){
        
        Carro carro = new Carro();

        carro.setCor("preto");
        carro.setModelo("BMW  2025" );
        carro.setCapacidaeTanque(65);
        
        
        System.out.println("Carro 1 ");
        System.out.println("Cor do Veiculo: "+carro.getCor());
        System.out.println("Modelo do Veiculo: "+carro.getModelo());
        System.out.println("Capacidade do Tanque de Combustivel: "+carro.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque: "+carro.totalValorTanque(4.99));
        
        
        System.out.println("\nCarro 2");
        Carro carro2 = new Carro("vermelho", "BMW 320", 60);

        System.out.println("Capacidade do Tanque de Combustivel: "+carro2.getCapacidadeTanque());
        System.out.println("Cor do Veiculo: "+carro2.getCor());
        System.out.println("Modelo do Veiculo: "+carro2.getModelo());
        System.out.println("Valor para encher o tanque: "+carro2.totalValorTanque(4.99));





    }
}
