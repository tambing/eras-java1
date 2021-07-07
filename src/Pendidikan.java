public class Pendidikan {
    private String sekolahDasar;
    private String smp;
    private String sma;
    private String kuliah;
    public String getSekolahDasar() {
        return sekolahDasar;
    }
    public void setSekolahDasar(String sekolahDasar) {
        this.sekolahDasar = sekolahDasar;
    }
    public String getSmp() {
        return smp;
    }
    public void setSmp(String smp) {
        this.smp = smp;
    }
    public String getSma() {
        return sma;
    }
    public void setSma(String sma) {
        this.sma = sma;
    }
    public String getKuliah() {
        return kuliah;
    }
    public void setKuliah(String kuliah) {
        this.kuliah = kuliah;
    }

    // buat constructor dengan arguments
    public Pendidikan(String sekolahDasar, String smp, String sma, String kuliah){
        this.sekolahDasar = sekolahDasar;
        this.smp = smp;
        this.sma = sma;
        this.kuliah = kuliah;
    }

    public void getPendidikan() {
        System.out.println("Riwayat Pendidikan");
        System.out.println("SD : "+this.sekolahDasar);
        System.out.println("SMP : "+this.smp);
        System.out.println("SMA : "+this.sma);
        System.out.println("D4 : "+this.kuliah);
    }
}
