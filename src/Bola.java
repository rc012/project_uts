public class Bola extends Daftar{
    private double jariJari;

    public Bola(){
        this.jariJari = jariJari;
    }

    public Bola(double jariJari){
        this.jariJari = jariJari;
    }

    public double luasPermukaanBola(double jariJari){
        return  4 * 3.14 * (Math.pow(jariJari, 2));
    }

    public double volumeBola(double jariJari){
        return 4/3 * 3.14 * (Math.pow(jariJari, 3));
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}
