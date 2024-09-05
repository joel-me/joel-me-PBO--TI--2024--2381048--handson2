package binaryoperator;

public class Assigment {
    public static void main(String[] args) {

        int angka = 10;
        String nama  = "Alice";

        System.out.println("Nilai angka : "+ angka);
        System.out.println("Nilai nama :"+ nama);

        int x = 5;
        x+=3;
        System.out.println("Nilai x setelah += 3 :" + x);

        int y = 10;
        y-=2;
        System.out.println("Nilai v setelah -= 2 :" + y);

        int z = 4;
        z*=4;
        System.out.println("Nilai Z setelah *=5:"+z);

        int a = 20;
        a/=4;
        System.out.println("Nilai Z setelah /=4:"+a);

        int b= 13;
        b%=5;
        System.out.println("Nilai b setelah b%5:"+b);
    }
}
