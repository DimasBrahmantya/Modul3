package Tugas2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author DIMAS
 * @method int, main
 * @implNote Mencari Bilangan Modus
 */
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int mode = findMode(numbers);
        System.out.println("Modus: " + mode);

        scanner.close();
    }

    /**
     *
     * @param numbers masukan angka
     * @return hasil modus
     */
    public static int findMode(int[] numbers) {
        // Membuat peta (map) untuk menghitung frekuensi setiap angka
        Map<Integer, Integer> numberFrequency = new HashMap<>();

        // Mencari frekuensi setiap angka dalam array
        for (int number : numbers) {
            if (numberFrequency.containsKey(number)) {
                numberFrequency.put(number, numberFrequency.get(number) + 1);
            } else {
                numberFrequency.put(number, 1);
            }
        }

        int mode = 0; // Inisialisasi modus
        int maxFrequency = 0; // Inisialisasi frekuensi maksimum

        // Mencari angka dengan frekuensi maksimum (modus)
        for (Map.Entry<Integer, Integer> entry : numberFrequency.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = number;
            }
        }

        return mode;
    }
}

