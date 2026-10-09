public class KutuphaneGorevlisi extends kullanıcı {
    public KutuphaneGorevlisi(String id, String ad, String e_Posta, String sifre) {
        super(id, ad, e_Posta, sifre);
    }

    public void gorevliBilgisiGoster() {
        System.out.println("Görevli Bilgisi - " + kullaniciBilgisi());
    }
}