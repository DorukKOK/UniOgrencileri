public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = new Ogrenci[]{
                new Ogrenci("1973104001", 0.0),
                new Ogrenci("Gökhan", "Bilgisayar Müh", "1985104001", 0.0, 1985),
                new Ogrenci("Ayşe", "Makine Müh", "1985104001", 0.0, 1985),
                new Ogrenci("Elif", "Elektrik-Elektronik Müh", "2020104001", 1.98, 2020)
        };
        System.out.println("Öğrenci Bilgileri");

        for (int i = 0; i < ogrenciler.length; i++) {
            try {
                kontrolGano(ogrenciler[i].getGano());
                System.out.println("OGR-" + (i + 1) + " " + ogrenciler[i]);
            } catch (IllegalAccessException e) {
                System.out.println("Hata: " + e.getMessage());
            }
        }

        System.out.println("3. öğrencinin ödeyeceği harç: " + ogrenciler[2].harcHesapla());
        System.out.println("4. öğrencinin ödeyeceği harç: " + 2*(ogrenciler[2].harcHesapla()));
    }

    public static void kontrolGano(double gano) throws IllegalAccessException {
        if (gano < 0.0 || gano > 4.0) {
            throw new IllegalAccessException("Geçerli bir gano giriniz!");
        }
    }
}