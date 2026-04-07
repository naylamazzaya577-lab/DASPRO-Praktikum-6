public class Mahasiswa21 {
    
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa21() {}

    Mahasiswa21(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println(nim + " | " + nama + " | " + kelas + " | " + ipk);
    }
}