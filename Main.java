public class Main {
    public static void main(String[] args) {

        String[] ogrenciIsimleri = {"Kadir", "Gökhan", "Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        int[] dakikalar = {341, 273, 278,329,445,402,388,270,243,334,412,393,299,343,317,265};

        Ogrenci[] ogrenciler = new Ogrenci[ogrenciIsimleri.length];
        for (int i = 0; i < ogrenciIsimleri.length; i++) {
            ogrenciler[i] = new Ogrenci(ogrenciIsimleri[i], dakikalar[i]);
        }

        Maraton maraton = new Maraton(ogrenciler);
        maraton.siniflandirmaVeYazdirma();
}
}