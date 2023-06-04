package basamaksayileritoplami;

import java.util.Scanner;

public class BasamakSayileriToplami {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Hesaplamak İstediğiniz Sayıyı Girin : ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        for(;sayi!=0;sayi/=10){
            int basamak = sayi % 10;
            toplam += basamak;
        }
        
        System.out.println("Basamaklar Toplamı : " + toplam);
    }
    
}
