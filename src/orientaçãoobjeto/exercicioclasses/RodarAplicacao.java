package orientaçãoobjeto.exercicioclasses;

public class RodarAplicacao {
    
    public static void main(String[] args){

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilhaEsquerdo(),new ClasseFilhoDireito(),new ClasseMae()};

        for (ClasseMae classe: classes){
            classe.matodo1();
        }
        for (ClasseMae classe: classes){
            classe.metodo2();
        }
        System.out.println("\nChamadando somente o filho direito");

            ClasseFilhoDireito classeFilhoDireito = new ClasseFilhoDireito();
            classeFilhoDireito.metodo2();
    }
}
