public class Kubus extends Daftar {
    private double sisi;

    public Kubus() {
        this.sisi = sisi;
    }

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double luasPermukaanKubus(double sisi){
        return 6 * ( sisi * sisi );
    }

    public double kelilingKubus(double sisi){
        return 12 * sisi;
    }

    public double volumeKubus(double sisi){
        return sisi * sisi * sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
