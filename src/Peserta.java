/*------------------------------------------[Class]-----------------------------------------*/
public class Peserta {
    String nama;
    String merkSepatu;
    double waktuFinish;
    String status;
    Kategori kategori;
/*---------------------------------------[Constructor]--------------------------------------*/
    public Peserta(String nama, String merkSepatu, double waktuFinish, Kategori kategori) {
        this.nama = nama;
        this.merkSepatu = merkSepatu;
        this.waktuFinish = waktuFinish;
        this.kategori = kategori;
    }
/*------------------------------------------[Method]-----------------------------------------*/
    public void cekStatus() {
        if (waktuFinish <= kategori.batasWaktu) {
            status = "Finish";
        } else {
            status = "Tidak Finish";
        }
    }

    public void tampil() {
        System.out.println(nama + " | " + kategori.namaKategori + " | " + merkSepatu + " | " + waktuFinish + " | " + status);
    }
}
    
