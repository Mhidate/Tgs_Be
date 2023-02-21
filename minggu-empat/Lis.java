import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lis {

    public static void main(String[] args) {
        
        List<String> namaMakanan = new ArrayList<>();
        namaMakanan.add("Rendang");
        namaMakanan.add("Gulai");
        namaMakanan.add("Gudeg");
        namaMakanan.add("Pelecing");
        namaMakanan.add("Lontong");
        namaMakanan.add("Tahu");
        namaMakanan.add("Tempe");
        namaMakanan.add("Ayam geprek");
        namaMakanan.add("Mie ayam");
        namaMakanan.add("Mie goreng");
        
    
        List<Integer> thPialadunia = new ArrayList<>();
        thPialadunia.add(2014);
        thPialadunia.add(2018);
        thPialadunia.add(2022);

        List<String> provinsi = new ArrayList<>();
        provinsi.add("1.NTT");
        provinsi.add("2.NTB");
        provinsi.add("3.Papua");
        provinsi.add("4.Jambi");
        provinsi.add("5.Riau");
        provinsi.add("6.Bengkulu");
        provinsi.add("7.Sumatera Utara");
        provinsi.add("8.Sumatera Barat");
        provinsi.add("9.Sumatera Selatan");
        provinsi.add("10.Jawa Timur");
        

        List<String> bhsapemrog = new ArrayList<>();
        bhsapemrog.add("Java");
        bhsapemrog.add("Python");
        bhsapemrog.add("PHP");
        bhsapemrog.add("Javascript");
        bhsapemrog.add("Golang");
        bhsapemrog.add("C#");
        bhsapemrog.add("C++");
        bhsapemrog.add("Ruby");
        bhsapemrog.add("VB");
        bhsapemrog.add("Kotlin");
        bhsapemrog.add("Swift");

        System.out.println("Nama Makanan :");
        System.out.println(namaMakanan);
        System.out.println("------------------------------");

        System.out.println("Tahun pelaksanaan piala dunia minimal 3 :");
        System.out.println(thPialadunia);
        System.out.println("------------------------------");

        
        System.out.println("Nama provinsi urutan descending :");
        
        Collections.sort(provinsi, Collections.reverseOrder());
        System.out.println(provinsi);
        System.out.println("----------------------------------");

        System.out.println("Bahasa pemrograman :");
        System.out.println("Sebelum di hapus ");
        System.out.println(bhsapemrog);
        System.out.println("");
        for(int r = 0; r <= 5 ; r++){bhsapemrog.remove(0);}
        System.out.println("Sesudah di hapus ");
        System.out.println(bhsapemrog);
        System.out.println("----------------------------------");
       
      
    }
    
}
