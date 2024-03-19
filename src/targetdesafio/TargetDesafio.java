package targetdesafio;

public class TargetDesafio {
    public static void main(String[] args) {
        ///*****CÓDIGO FIBONNACI*****////
        int valorEntrada = 89; //Informar o numero que desaja testar
        boolean continuar  = true;
        int anterior = 0;
        int atual = 1;
        int soma;
        
        System.out.println("PROGRAMA FIBONNACI");
        
        do{
            if(atual == valorEntrada){
                System.out.println("O numero pertence a sequencia Fibonnaci.");
                continuar = false;
            }
                    
            if(atual > valorEntrada){
                System.out.println("O numero nao pertence a sequencia Fibonnaci.");
                continuar = false;
            }
            
            soma = atual + anterior;
            anterior = atual;
            atual = soma;
        }while(continuar);
        
        
        ///*****CÓDIGO STRING REVERSA*****////
        
        System.out.println("\n\n\nPROGRAMA STRING REVERSA");
        
        String entrada = "abcdef"; //Informar a string que desaja testar
        String saida = "";
        
        int tamanho = entrada.length() - 1;
        
        for(int i = tamanho; i >= 0; i--){
            saida +=  entrada.charAt(i);
        }
        
        System.out.println(entrada);
        System.out.println(saida);
    }
    
}
