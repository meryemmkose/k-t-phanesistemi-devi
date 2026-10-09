public class kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;

    public kitap(String isbn, String baslik, String yazar, int yayinYili, String durum) {
        this.baslik = baslik;
        this.yazar = yazar;
        this.isbn = isbn;
        this.yayinYili = yayinYili;
        this.durum = durum;
    }

    public String kitapBilgisi() {
        String tanitim = "ADI: " + this.baslik + " YAZARI: " + this.yazar +
                        " yayın yılı: " + this.yayinYili + " ISBN: " + this.isbn + "Durumu" + this.durum;
        return tanitim;
    }

    public String getBaslik() {
        return this.baslik;
    }

    public String getYazar() {
        return this.yazar;
    }
}

