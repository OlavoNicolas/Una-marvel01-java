import java.util.Scanner;
public class Alistamento {

public static void main(String[] args) {
    
Scanner leitor = new Scanner(System.in);
System.out.println(" Digite o nome do recruta: ");
String nome = leitor.nextLine();

System.out.println("\n Olá " + nome + "!");
System.out.println(" Digite o peso do recruta: ");
int peso = leitor.nextInt();
System.out.println("\n Seu peso é"+peso+ " KG");

if (peso<50) {

    System.out.println("Você está abaixo do peso para o alistamento.");
    
} else if (peso >= 50 && peso <= 100) {
System.out.println("Dentro do peso ideal para alistamento.");   
}
else{
    
System.out.println("Você está acima do peso para o alistamento.");
    
}
leitor.close();
}

}