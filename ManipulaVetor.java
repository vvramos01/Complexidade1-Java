import java.util.Scanner;

public class ManipulaVetor {
    Integer [] vetor = new Integer[7];
    int aux;

    public ManipulaVetor() {

    }

    public void lerVetor() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = ");
            this.vetor[i] = scanner.nextInt();
        }
    }

    public void imprimirVetor() {
        System.out.println("Imprimindo o vetor: ");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("Vetor[" + i + "] = " + this.vetor[i]);
        }
    }

    public void bubbleSort() {
        for (int j = 0; j < this.vetor.length-1; j++) {
            boolean troca = false;
            for (int i = 0; i < this.vetor.length-1-j; i++) {
                if(this.vetor[i] > this.vetor[i+1]) {
                    troca = true;
                    aux = this.vetor[i];
                    this.vetor[i] = this.vetor[i+1];
                    this.vetor[i+1] = aux;
                }
            }
            if(troca == false) {
                break;
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < this.vetor.length; i++) {
            if(this.vetor[i] < this.vetor[i-1]) {
                for (int j = i; j > 0; j--) {
                    this.aux = this.vetor[j];
                    this.vetor[j] = this.vetor[j-1];
                    this.vetor[j-1] = aux;
                    if(j == 1 || this.vetor[j-1] > this.vetor[j-2]) {
                        break;
                    }
                }
            }
        }
    }
}
