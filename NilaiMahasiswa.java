import java.util.Scanner;

public class NilaiMahasiswa {

    static void isiArray(int[] nilai, int jumlahMahasiswa, Scanner input) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] nilai, int jumlahMahasiswa) {
        System.out.println("\nData Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " : " + nilai[i]);
        }
    }

    static int hitTotal(int[] nilai, int jumlahMahasiswa) {
        int total = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        isiArray(nilai, N, input);   
        tampilArray(nilai, N);

        int totalNilai = hitTotal(nilai, N);
        System.out.println("\nTotal seluruh nilai mahasiswa = " + totalNilai);

        input.close(); 
    }
}