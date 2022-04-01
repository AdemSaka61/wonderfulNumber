import java.util.Scanner;

public class wonderfulNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number,bolenSayisi=0;

        System.out.print("Bir Sayı Giriniz :");
        number= input.nextInt();
        for (int i=1; i<number;i++){
            if (number%i==0){
                bolenSayisi+=i;
            }
        }
        if (bolenSayisi==number){
            System.out.print(number + " " + "Bir Mükemmel Sayıdır.");
        }else {
            System.out.print(number + " " + "Mükemmel Sayı Değildir.");
        }






    }
}
