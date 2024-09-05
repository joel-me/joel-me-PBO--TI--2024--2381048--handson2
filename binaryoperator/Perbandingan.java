package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        boolean hasilSamaDengan = (a == b);
        System.out.println("a==b :" + hasilSamaDengan);

        boolean hasilTidakSamadengan = (a!=b);
        System.out.println("a!=b :"+ hasilTidakSamadengan);

        boolean hasilLebihbesarDari = (a>b);
        System.out.println("a>b :"+hasilLebihbesarDari);
        boolean hasilLebihKecilDari = ( a<b);
        System.out.println("a<b:"+hasilLebihKecilDari);
        boolean hasilLebihbesarsamadengan = (a>=b);
        System.out.println("a>=b :"+hasilLebihbesarsamadengan);
        boolean hasilLebihkecilsamadengan =(a<=b);
        System.out.println("a<=b :"+hasilLebihkecilsamadengan);
    }
}
