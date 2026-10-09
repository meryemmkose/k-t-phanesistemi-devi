public class OduncAlma {
    private static int islemSayaci;
    private String islemNo;
    private String oduncTarihi;
    private String sonTeslimTarihi;
    private String teslimTarihi;

    public OduncAlma(String islemNo, String oduncTarihi, String sonTeslimTarihi) {
        this.islemNo = islemNo;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        islemSayaci++;
    }

    public void oduncBilgisiGoster() {
        System.out.println("İşlem No: " + islemNo + " - Ödünç Tarihi: " + oduncTarihi);
    }

    public String getIslemNo() {
        return this.islemNo;
    }

    public void setIslemNo(String islemNo) {
        this.islemNo = islemNo;
    }

    public String getOduncTarihi() {
        return this.oduncTarihi;
    }

    public void setOduncTarihi(String oduncTarihi) {
        this.oduncTarihi = oduncTarihi;
    }

    public String getSonTeslimTarihi() {
        return this.sonTeslimTarihi;
    }

    public void setSonTeslimTarihi(String sonTeslimTarihi) {
        this.sonTeslimTarihi = sonTeslimTarihi;
    }

    public String getTeslimTarihi() {
        return this.teslimTarihi;
    }

    public void setTeslimTarihi(String teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }

    public static int getIslemSayaci() {
        return islemSayaci;
    }
}