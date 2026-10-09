public class kullanıcı {
    private String id;
    private String ad;
    private String e_Posta;
    private String sifre;

    public kullanıcı(String id, String ad, String e_Posta, String sifre) {
        this.id = id;
        this.ad = ad;
        this.e_Posta = e_Posta;
        this.sifre = sifre;
    }

    public String kullaniciBilgisi() {
        String bilgi = "ID: " + this.id + " AD: " + this.ad + " E-POSTA: " + this.e_Posta + " ŞİFRE: " + this.sifre;
        return bilgi;
    }

    public String getId() {
        return this.id;
    }

    public String getAd() {
        return this.ad;
    }

    public String getE_Posta() {
        return this.e_Posta;
    }

    public String getSifre() {
        return this.sifre;
    }
}