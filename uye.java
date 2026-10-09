public class uye extends kullanıcı {
    public uye(String id, String ad, String e_Posta, String sifre) {
        super(id, ad, e_Posta, sifre);
    }

    public void uyeBilgisiGoster() {
        System.out.println("Üye Bilgisi - " + kullaniciBilgisi());
    }
}
