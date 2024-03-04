class Ogrenci {
    String isim;
    int zaman;

    public Ogrenci(String isim, int zaman) {
        this.isim = isim;
        this.zaman = zaman;
    }
}

class Maraton {
    Ogrenci[] ogrenciler;

    public Maraton(Ogrenci[] ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public void siniflandirmaVeYazdirma() {
        System.out.println("İlk üç dereceyi alan öğrenciler :");
        int[] siniflar = new int[3];
        for (Ogrenci ogrenci : ogrenciler) {
            if (ogrenci.zaman >= 200 && ogrenci.zaman <= 299) {
                siniflar[0]++;
            } else if (ogrenci.zaman >= 300 && ogrenci.zaman <= 399) {
                siniflar[1]++;
            } else {
                siniflar[2]++;
            }
        }

        for (int i = 0; i < ogrenciler.length - 1; i++) {
            for (int j = 0; j < ogrenciler.length - i - 1; j++) {
                if (ogrenciler[j].zaman > ogrenciler[j + 1].zaman) {
                    Ogrenci temp = ogrenciler[j];
                    ogrenciler[j] = ogrenciler[j + 1];
                    ogrenciler[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < Math.min(3, ogrenciler.length); i++) {
            System.out.println((i + 1) + ". " + ogrenciler[i].isim + " " + ogrenciler[i].zaman + "'");


        }
        System.out.println("Sınıflandırma:");
        System.out.println("A → " + siniflar[0]);
        System.out.println("B → " + siniflar[1]);
        System.out.println("C → " + siniflar[2]);
    }
}