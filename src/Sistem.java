class Sistem implements Reward {
    Event event;
/*------------------------------------------[Constructor]-----------------------------------------*/
    public Sistem(Event event) {
        this.event = event;
    }
/*---------------------------------------------[Method]-------------------------------------------*/
    public void analisisSepatu() {
        String[] merk = new String[100];
        int[] jumlah = new int[100];
        int count = 0;

        for (int i = 0; i < event.jumlah; i++) {
            Peserta p = event.daftar[i];

            if (p.status.equals("Finish")) {
                int index = -1;

                for (int j = 0; j < count; j++) {
                    if (merk[j].equalsIgnoreCase(p.merkSepatu)) {
                        index = j;
                        break;
                    }
                }

                if (index == -1) {
                    merk[count] = p.merkSepatu;
                    jumlah[count] = 1;
                    count++;
                } else {
                    jumlah[index]++;
                }
            }
        }

        System.out.println("=== Analisis Sepatu ===");
        for (int i = 0; i < count; i++) {
            System.out.println(merk[i] + " : " + jumlah[i]);
        }
    }
/*------------------------------------------[Overriding]-----------------------------------------*/
    @Override
    public void tampilkanReward(Peserta p) {
        if (p.status.equals("Finish")) {
            System.out.println(p.nama + " mendapatkan medali " + p.kategori.jenisMedali);

            if (p.kategori instanceof HalfMarathon) {
                System.out.println("+ Jaket Finisher");
            }
        }
    }

    public void tampilSemuaReward() {
        for (int i = 0; i < event.jumlah; i++) {
            tampilkanReward(event.daftar[i]);
        }
    }
}