import java.util.Scanner;


public class Soalsatu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        short short1 = 1, short2 = 3;
        double d1 = 2.1 ,d2 = 3.4 ;
        char jenis1 = 'P', jenis2 = 'L' ;
        boolean sedangBelajar = true;
        boolean sedangMakan = false;
        String k1 = "Saya senang ", k2 = "belajar ", k3 = "Java language";

        
       System.out.println("Soal 1 bagian a");
       System.out.println("Silahkan input nama anda ");
       String nama = input.nextLine();
       input.close();
       System.out.println("Selamat datang di bootcamp Kawah Edukasi, " + nama);
       System.out.println();

       System.out.println("--------------------------");

       System.out.println("Soal 1 bagian b");
       System.out.println("Contoh tipe data short :");
       System.out.println(short1 + short2);
       System.out.println("");
       System.out.println("Contoh tipe data double :");
       System.out.println(d1+d2);
       System.out.println("");
       System.out.println("Contoh tipe data char :");
       System.out.println(jenis1);
       System.out.println(jenis2);
       System.out.println(""); 
       System.out.println("Contoh tipe data boolean :");
       System.out.println(sedangBelajar);
       System.out.println(sedangMakan);
       System.out.println("");

       System.out.println("------------------------");
       System.out.println("Soal 1 bagian c");
       System.out.println(k1 + k2 + k3);
       System.out.println();
    
        
    }
}
