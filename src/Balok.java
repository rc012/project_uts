public class Balok extends Daftar {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok (){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public Balok (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double luasPermukaanBalok(double panjang, double lebar, double tinggi){
        return 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));
    }

    public double kelilingBalok(double panjang, double lebar, double tinggi){
        return 4 * (panjang + lebar + tinggi);
    }

    public double volumeBalok(double panjang, double lebar, double tinggi){
        return panjang * lebar * tinggi;
    }

    public double diagonalRuangBalok(double panjang, double lebar, double tinggi){
        return Math.sqrt(Math.pow(panjang,2) + Math.pow(lebar,2) + Math.pow(tinggi,2));
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
