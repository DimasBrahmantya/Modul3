import java.util.Scanner;

public class AutocompleteAndTemplates {

    public static int Penjumlahan(int a, int b){
        return a + b;
    }

    public static int Pengurangan(int a, int b){
        return a - b;
    }

    public static int Perkalian(int a, int b){
        return a * b;
    }

    public static int Pembagian(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        //Contoh program kalkulator
        Scanner input = new Scanner(System.in);

        System.out.print("masukan angka pertama : ");
        int a = input.nextInt();
        System.out.print("masukan Operator (+,-,*,/) : ");
        String opsi = input.next();
        System.out.print("masukan angka kedua : ");
        int b = input.nextInt();

        if (opsi.equals("+")){
            System.out.println("hasil penjumlahan : "+Penjumlahan(a,b));
        } else if(opsi.equals("-")){
            System.out.println("hasil pengurangan : "+Pengurangan(a,b));
        } else if (opsi.equals("*")){
            System.out.println("Hasil perkalian : "+Perkalian(a,b));
        } else if (opsi.equals("/")){
            System.out.println("Hasil pembagian : "+Pembagian(a,b));
        } else {
            System.out.println("opsi yang di masukan tidak tersedia");
        }
    }
}