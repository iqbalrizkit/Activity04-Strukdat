/*------------------------------------------[Class]-----------------------------------------*/
class Event {
    Peserta[] daftar = new Peserta[100];
    int jumlah = 0; 
/*------------------------------------------[Method]-----------------------------------------*/
    public void tambah(Peserta p) {
        if (jumlah < daftar.length) {
            daftar[jumlah] = p;
            jumlah++;
        } else {
            System.out.println("Daftar penuh!");
        }
    }

    public void hapus(String nama) {
        for (int i = 0; i < jumlah; i++) {
            if (daftar[i].nama.equalsIgnoreCase(nama)) {
                for (int j = i; j < jumlah - 1; j++) {
                    daftar[j] = daftar[j + 1];
                }
                jumlah--;
                System.out.println("Peserta dihapus.");
                return;
            }
        }
        System.out.println("Peserta tidak ditemukan.");
    }
    
    public void tampil() {
        for (int i = 0; i < jumlah; i++) {
            daftar[i].tampil();
        }
    }

    public Peserta cari(String nama) {
        for (int i = 0; i < jumlah; i++) {
            if (daftar[i].nama.equalsIgnoreCase(nama)) {
                return daftar[i];
            }
        }
        return null;
    }
}
