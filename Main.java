public class Main {
    public static void main(String[] args) {
        
        kitap kitap = new kitap("9789750725708", "Satranç", "Steafen Zweig", 1942, "Rafta");
        kitapKopyasi kopya = new kitapKopyasi("BARKOD-9786052361719");
        kullanıcı kullanıcı = new kullanıcı("1", "Ayşe Yılmaz", "aysee@gmail.com", "1234");
        uye uye = new uye("1", "Meryem Kose", "meryemm@gmail.com", "12469");
        KutuphaneGorevlisi gorevli = new KutuphaneGorevlisi("3", "Ali Bey", "ali@gmail.com", "9876");
        OduncAlma odunc = new OduncAlma("ISLEM-001", "07.10.2026", "23.10.2026");
    
        System.out.println("--- Kutuphane Sistemi Testi ---");
        System.out.println(kitap.kitapBilgisi());
        System.out.println("Kopya Barkod: " + kopya.getBarkod());
        uye.uyeBilgisiGoster();
        gorevli.gorevliBilgisiGoster();
        odunc.oduncBilgisiGoster();
        
        System.out.println("Kullanıcı Adı: " + kullanıcı.getAd());

    }
}