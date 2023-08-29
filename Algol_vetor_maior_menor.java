//Escreva um algoritimo que armazena 5 números inteiros em um vetor e verifica o maior e o menor número://
public class Main{
    public static void main(String[]args){
        int[] vetor = {1,2,3,4,5};
        int menor = vetor[0];
        int maior = vetor [0];

        for (int i=0;i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        for (int i=0;i < vetor.length;i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        System.out.println("O maior é " + maior + " e o menor é "+ menor );
    }
}
