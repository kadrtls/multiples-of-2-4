import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total=0,number;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Bir sayı giriniz:");
        number= scanner.nextInt();
        if ((number%2==0)||number%4==0){
            total+=number;
        }else {
            System.out.println("Tek sayı girdiniz");
            System.out.println("2 ve 4'ün katları toplamı:"+total);
            break;
        }
        }
    }
}