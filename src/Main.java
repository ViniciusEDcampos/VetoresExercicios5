import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[12];
        double media = 0.0;
        int Soma = 0;
        int numerosMaiores = 0;
        int numerosDigitados = 0;

        System.out.println("Digite 12 numeros: ");
        for(int i =0;i<12;i++){
            numeros[i] = scanner.nextInt();
            Soma = numeros[i] + Soma;
            numerosDigitados++;
        }
        media = Soma / numerosDigitados;

        for(int i=0;i<12;i++){
            if( numeros[i] > media){
                numerosMaiores++;
            }
        }
        System.out.println("A media é: " + media);
        System.out.println("Quantidade de numeros maiores que a media: " + numerosMaiores);
    }
}