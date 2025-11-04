import java.util.Scanner;

public class UKL_Sulit_1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlahSiswa = 0;
            while (true) {
            System.out.print("Masukkan jumlah siswa: ");
            if (!input.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan bilangan bulat");
                input.next();
                continue;
            }
            jumlahSiswa = input.nextInt();
            if (jumlahSiswa <= 0) {
                System.out.println("Jumlah siswa harus lebih dari 0");
                continue;
            }
            break;
        }
        if(jumlahSiswa <= 0) {
            System.out.println("Jumlah Siswa Minimal 1");
            return;
        }
        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            double nilaiSiswa;
            while (true) {
                System.out.print("Masukkan Nilai Siswa ke-" + i + ": ");
                if (!input.hasNextDouble()) {
                    System.out.println("Input tidak valid. Masukkan angka");
                    input.next();
                    continue;
                }
                nilaiSiswa = input.nextDouble();
                if (nilaiSiswa < 0 || nilaiSiswa > 100) {
                    System.out.println("Nilai Tidak Valid. Masukkan nilai antara 0 dan 100");
                    continue;
                }
                break;
            }
            totalNilai += nilaiSiswa;
          }

        double rataRataNilaiSiswa = totalNilai / jumlahSiswa;
        System.out.println("Rata-Rata Nilai Siswa Adalah: " + rataRataNilaiSiswa);
        }
    }
}
