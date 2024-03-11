public class Ogrenci {
    private String ad;
    Ogrenci ogrenci;
    private String bolum;
    private String ogrNo;
    private double gano;

    private int girisYili;
    private double harc;

    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
    }

    public Ogrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public Ogrenci(String ogrNo,double gano){
        this.ogrNo=ogrNo;
        this.gano=gano;
    }

    public Ogrenci(String ad, String bolum,String ogrNo , double gano, int girisYili) {
        this.ad = ad;
        this.bolum = bolum;
        this.ogrNo = ogrNo;
        this.gano=gano;
        this.girisYili = girisYili;
    }
    public Ogrenci(){

    }
    public String toString(){
        return ad +" "+ bolum +" "+ ogrNo +" "+ gano +" ";
    }
    public double harcHesapla(){
        int uzatmaYili = 1 ;
        return (uzatmaYili*480);

    }
    public String getAd(){
        return ad;
    }
    public void setAd(){
        this.ad=ad;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

}



