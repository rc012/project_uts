public class Piramida extends Daftar {
    private double sisi;
    private double alas;
    private double tinggi;

    public Piramida(){
        this.sisi = sisi;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Piramida(double sisi, double alas, double tinggi){
        this.sisi = sisi;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luasAlasPiramida(double sisi){
        return sisi * sisi;
    }

    public double luasSisiTegakPiramida(double alas, double tinggi){
        return (0.5 * alas * tinggi) * 4;
    }

    public double luasPermukaanPiramida(double sisi, double alas, double tinggi){
        return luasAlasPiramida(sisi) + 4 * luasSisiTegakPiramida(alas, tinggi);
    }

    public double volumePiramida(double sisi, double tinggi){
        return (luasAlasPiramida(sisi) / 3) * tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
