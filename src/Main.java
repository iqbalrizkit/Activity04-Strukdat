import java.util.Scanner;
/*------------------------------------------[Class]-----------------------------------------*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Event event = new Event();
        Sistem sistem = new Sistem(event);
/*-------------------------------------------[CRUD]------------------------------------------*/
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Peserta");
            System.out.println("2. Tampilkan Peserta");
            System.out.println("3. Hapus Peserta");
            System.out.println("4. Analisis Sepatu");
            System.out.println("5. Tampilkan Reward");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Merk Sepatu: ");
                    String merk = input.nextLine();

                    System.out.print("Waktu Finish: ");
                    double waktu = input.nextDouble();

                    System.out.println("Pilih Kategori: 1.5K 2.10K 3.Half");
                    int k = input.nextInt();
/*---------------------------------------[Polymorphism]-------------------------------------*/
                    Kategori kategori;
                    if (k == 1) kategori = new Kategori5K();
                    else if (k == 2) kategori = new Kategori10K();
                    else kategori = new HalfMarathon();

                    Peserta p = new Peserta(nama, merk, waktu, kategori);
                    p.cekStatus();
                    event.tambah(p);
                    break;

                case 2:
                    event.tampil();
                    break;

                case 3:
                    System.out.print("Nama yang dihapus: ");
                    String hapus = input.nextLine();
                    event.hapus(hapus);
                    break;

                case 4:
                    sistem.analisisSepatu();
                    break;

                case 5:
                    sistem.tampilSemuaReward();
                    break;
            }

        } while (pilih != 0);
        
        System.out.println("Program selesai");
    }
}
