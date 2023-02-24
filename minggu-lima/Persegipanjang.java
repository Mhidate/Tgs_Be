public class Persegipanjang {
    
    Integer panjang,lebar,luas,kelilig;

    void hitungperpan(){
    
        luas = panjang*lebar;
        kelilig= 2*panjang+2*lebar;
        System.out.println("---------------");
        System.out.println("Rumus Luas persegi panjang = Panjang x Lebar");
        System.out.println("Rumus Keliling persegi panjang = (2 x Panjang) + (2 x Lebar)");
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas persegi panjang = "+ luas);
        System.out.println("Keliling persegi panjang = "+ kelilig);

        // refrensi rumus https://mediaindonesia.com/humaniora/527908/pembahasan-rumus-keliling-persegi-panjang-dan-luasnya

    }
}
