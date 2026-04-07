import java.util.Scanner;
import java.util.Locale;

public class MahasiswaDemo21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("\nData ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa21(nim, nama, kelas, ipk));
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        list.insertionSort();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (DSC):");
        list.tampil();
    }
}