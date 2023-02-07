package orientaçãoobjeto.exerciciofuncionarios;

public class RodarAplicacao {
    
    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();     // Ocorreram 3 upcasts
        Funcionario faxineiro = new Faxineiro();
        
        // Gerente gerente = new Funcionario();
        // Vendedor vendedor = (Vendedor) new Funcionario();

        
        // Nao deve ser evitado downcast
        // vendedor contem todos dados  em  funcionario
        // mas funcionario nao contem todos seus dados em vendedor
    }
}
