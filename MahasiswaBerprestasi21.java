public class MahasiswaBerprestasi21 {
    Mahasiswa21[] listMhs = new Mahasiswa21[5];
    int idx;

    void tambah(Mahasiswa21 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
    for(int i = 0; i < idx; i++) {
        listMhs[i].tampil();
    }
    System.out.println();
    }

   void bubbleSort() {
    for(int i = 0; i < idx - 1; i++) {
        for(int j = 0; j < idx - i - 1; j++) {
            if(listMhs[j].ipk < listMhs[j+1].ipk) {
                Mahasiswa21 tmp = listMhs[j];
                listMhs[j] = listMhs[j+1];
                listMhs[j+1] = tmp;
            }
        }
    }
    }
    void selectionSort() {
    for(int i = 0; i < idx - 1; i++) {
        int idxMax = i;

        for(int j = i + 1; j < idx; j++) {
            if(listMhs[j].ipk > listMhs[idxMax].ipk) {
                idxMax = j;
            }
        }

        Mahasiswa21 temp = listMhs[idxMax];
        listMhs[idxMax] = listMhs[i];
        listMhs[i] = temp;
    }
    }
   void insertionSort() {
    for(int i = 1; i < idx; i++) {
        Mahasiswa21 temp = listMhs[i];
        int j = i;

        while(j > 0 && listMhs[j-1].ipk < temp.ipk) {
            listMhs[j] = listMhs[j-1];
            j--;
        }

        listMhs[j] = temp;
    }
}
}