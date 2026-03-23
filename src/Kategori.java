/*------------------------------------------[Abstraksi]-----------------------------------------*/
abstract class Kategori {
    String namaKategori;
    double jarak;
    String warnaJersey;
    String jenisMedali;
    double batasWaktu;
/*------------------------------------------[Constructor]-----------------------------------------*/
    public Kategori(String namaKategori, double jarak, String warnaJersey, String jenisMedali, double batasWaktu) {
        this.namaKategori = namaKategori;
        this.jarak = jarak;
        this.warnaJersey = warnaJersey;
        this.jenisMedali = jenisMedali;
        this.batasWaktu = batasWaktu;
    }
}