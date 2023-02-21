import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reigex {
    

    public static void main(String[] args) {
        String validasi ;
        Scanner input = new Scanner(System.in);
    

        System.out.println("Silahkan ketik sesuatu :");
        validasi = input.nextLine();
        input.close();
        
        metoda(validasi);
    }

    static void metoda(String validasi) {
        if(ValidEmail(validasi)){
            System.out.println("----------------------------");
             System.out.println(validasi+" adalah email");
          }else if(ValidTgl(validasi)){
              System.out.println("--------------------------");
              System.out.println(validasi+" adalah tanggal format dd-MM-yyyy");
          }
          else if(ValidIp(validasi)){
              System.out.println("--------------------------");
              System.out.println(validasi + " adalah IP Address");
          }
          else if(ValidTgl2(validasi)){
              System.out.println("--------------------------");
              System.out.println(validasi+" adalah tanggal format dddd,MMMM,yy");
          }
          else{
             System.out.println("-------------------------------------");
              System.out.println("Format yang anda masukan salahas");
          } 
        
    }

    public static boolean ValidEmail(String validasi) {
        Pattern pa = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher m = pa.matcher(validasi);
        return m.matches();
    }
    public static boolean ValidTgl(String validasi) {
        Pattern pa2 = Pattern.compile ("^(0[1-9]|1[012])-(0[1-9]|[12][0-9]|[3][01])-\\d{4}$");
        Matcher m2 = pa2.matcher(validasi);
        return m2.matches();
    }
    public static boolean ValidIp(String validasi) {
        Pattern pa3 = Pattern.compile ("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
        Matcher m3 = pa3.matcher(validasi);
        return m3.matches();
    }
    public static boolean ValidTgl2(String validasi) {
        Pattern pa4 = Pattern.compile ("(Senin|Selasa|Rabu|Kamis|Jum'at|Sabtu|Minggu),(January|February|Maret|April|Mei|Juni|Juli|Agustus|September|October|November|Desember),\\d{2}", Pattern.CASE_INSENSITIVE);
        Matcher m4 = pa4.matcher(validasi);
        return m4.matches();
    }
}
