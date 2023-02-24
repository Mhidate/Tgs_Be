import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Persegi per = new Persegi();
        Persegipanjang perpan = new Persegipanjang();
        Segitigasembarang sg = new Segitigasembarang();
        Lingkaran ling = new Lingkaran();

        System.out.println("Pilih menu");
        System.out.println("1.Menghitung luas dan keliling persegi");
        System.out.println("2.Menghitung luas dan keliling persegi panjang");
        System.out.println("3.Menghitung luas dan keliling segitiga");
        System.out.println("4.Menghitung luas dan keliling lingkaran");
        System.out.println("-----------------");
        int menu = input.nextInt();
        input.close();

        switch (menu){
            case 1 :
               per.s = 5;
               per.hitungper();
               break;

            case 2:
               perpan.lebar = 5;
               perpan.panjang = 10;
               perpan.hitungperpan();
               break;
            case 3:
               sg.palas = 10;
               sg.tinggi= 7;

               sg.sa = 8 ;
               sg.sb = 10;
               sg.sc = 9 ;
               sg.hitungsg();
               break;
            case 4 :
               ling.r = 7;
               ling.hitungli();
               break;

        }
        
        
    }
}
