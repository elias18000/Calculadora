import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame el primer numero a operar");
        int numero1 = Integer.parseInt(scan.nextLine());
        System.out.println("Dame el segundo numero a operar");
        int numero2 = Integer.parseInt(scan.nextLine());
        
        System.out.println("el resultado de la suma es" + suma(numero1, numero2));
        System.out.println("el resultado de la resta es" + resta(numero1, numero2));    
    }
    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    public static int resta(int numero1, int numero2){
        return numero1 - numero2;
    }

}
