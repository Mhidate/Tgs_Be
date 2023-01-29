import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TgsSatu{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  menu, nilai1, nilai2, hasil= 0;
        System.out.println("Menu Kalkulator");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("-----------------------------");
        System.out.println("Silahkan pilih menu :");
        menu = input.nextInt();
        

        switch (menu)
        {
            case 1 : 
                 System.out.print("Masukan Angka Pertama: ");
                    nilai1 = input.nextInt();
                 System.out.print("Masukan Angka Kedua: ");
                    nilai2 = input.nextInt();
                    hasil = nilai1 + nilai2; break;
            case 2 : 
                 System.out.print("Masukan Angka Pertama: ");
                    nilai1 = input.nextInt();
                 System.out.print("Masukan Angka Kedua: ");
                    nilai2 = input.nextInt();
                    hasil = nilai1 - nilai2; break;
            case 3 : 
                 System.out.print("Masukan Angka Pertama: ");
                    nilai1 = input.nextInt();
                 System.out.print("Masukan Angka Kedua: ");
                    nilai2 = input.nextInt();
                    hasil = nilai1 / nilai2; break;
            case 4 : 
                 System.out.print("Masukan Angka Pertama: ");
                    nilai1 = input.nextInt();
                 System.out.print("Masukan Angka Kedua: ");
                    nilai2 = input.nextInt();
                    hasil = nilai1 * nilai2; break;
            case 5 : 
                 System.out.print("Masukan Angka Pertama: ");
                    nilai1 = input.nextInt();
                 System.out.print("Masukan Angka Kedua: ");
                    nilai2 = input.nextInt();
                    hasil = nilai1 % nilai2; break;

            default : System.out.println("Salah angka ,masukan sesuai di Menu");
        }

        System.out.println("Hasil: " + hasil);


     
        try {
            File myObj = new File("result.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("Nama file suda ada");
            }
          } catch (IOException e) {
            System.out.println("Terjadi error");
            e.printStackTrace();
          }
          
          
        try {
            FileWriter myWriter = new FileWriter("result.txt");
            myWriter.write("Hasilnya adalah "+ new Integer(hasil).toString());
            myWriter.close();
            System.out.println("File berhasil di tulis");
          } catch (IOException e) {
            System.out.println("Terjadi error");
            e.printStackTrace();
          }
        
    }

}
