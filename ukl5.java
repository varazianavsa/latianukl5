import java.util.Scanner;

public class ukl5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa:");
        int jumlahsiswa = input.nextInt();

        double totalnilai = 0;
        double nilai;

        for (int i = 1; i <= jumlahsiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ":");
            nilai = input.nextDouble();
            totalnilai += nilai;
        }

        double ratarata = totalnilai / jumlahsiswa;

        System.out.println("== Rekapitulasi Nilai Produktif RPL ==");
        System.out.println("Jumlah siswa : " + jumlahsiswa);
        System.out.println("Total nilai : " + totalnilai);
        System.out.println("Nilai rata-rata : " + ratarata);

        input.close();
    }
}
