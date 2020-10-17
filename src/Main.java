import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Daftar daftar = new Daftar();
        Daftar kubus = new Kubus(6);
        Daftar balok = new Balok(12,6,8);
        Daftar piramida = new Piramida(6,12,18);
        Daftar bola = new Bola(14);

        Scanner scan = new Scanner(System.in);
        int s, p, l, t, a, r;
        char ulang;

        do{
            System.out.println("Perhitungan Bangun Ruang");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Piramida");
            System.out.println("4. Bola");
            System.out.print("Silakan memilih: ");
            daftar.setPilihan(scan.nextInt());

            if (daftar.getPilihan() == 1) {
                System.out.print("Masukan nilai sisi: ");
                s = scan.nextInt();
                System.out.println("\nDiketahui \nSisi: " + ((Kubus) kubus).getSisi() + "cm");
                System.out.println("\nTampilan hasil perhitungan kubus");
                System.out.println("Luas Permukaan: " + ((Kubus) kubus).luasPermukaanKubus(s) + "cm²");
                System.out.println("Keliling: " + ((Kubus) kubus).kelilingKubus(s) + "cm");
                System.out.println("Volume: " + ((Kubus) kubus).volumeKubus(s) + "cm³");
            } else if (daftar.getPilihan() == 2) {
                System.out.print("Masukan nilai panjang: ");
                p = scan.nextInt();
                System.out.print("Masukan nilai lebar: ");
                l = scan.nextInt();
                System.out.print("Masukan nilai tinggi: ");
                t = scan.nextInt();
                System.out.println("\nDiketahui \nPanjang: " + ((Balok) balok).getPanjang() + "cm");
                System.out.println("Lebar: " + ((Balok) balok).getLebar() + "cm");
                System.out.println("Tinggi: " + ((Balok) balok).getTinggi() + "cm");
                System.out.println("\nTampilan hasil perhitungan balok");
                System.out.println("Luas Permukaan: " + ((Balok) balok).luasPermukaanBalok(p, l, t) + "cm²");
                System.out.println("Diagonal Ruang: " + ((Balok) balok).diagonalRuangBalok(p, l, t) + "cm");
                System.out.println("Keliling: " + ((Balok) balok).kelilingBalok(p, l, t) + "cm");
                System.out.println("Volume: " + ((Balok) balok).volumeBalok(p, l, t) + "cm³");
            } else if (daftar.getPilihan() == 3) {
                System.out.print("Masukan nilai sisi: ");
                s = scan.nextInt();
                System.out.print("Masukan nilai alas: ");
                a = scan.nextInt();
                System.out.print("Masukan nilai tinggi: ");
                t = scan.nextInt();
                System.out.println("\nDiketahui \nSisi: " + ((Piramida) piramida).getSisi() + "cm");
                System.out.println("Alas: " + ((Piramida) piramida).getAlas() + "cm");
                System.out.println("Tinggi: " + ((Piramida) piramida).getTinggi() + "cm");
                System.out.println("\nTampilan hasil perhitungan piramida");
                System.out.println("Luas Alas: " + ((Piramida) piramida).luasAlasPiramida(s) + "cm²");
                System.out.println("Luas Sisi Tegak: " + ((Piramida) piramida).luasSisiTegakPiramida(s, t) + "cm²");
                System.out.println("Luas Permukaan: " + ((Piramida) piramida).luasPermukaanPiramida(s, a, t) + "cm²");
                System.out.println("Volume: " + ((Piramida) piramida).volumePiramida(s, t) + "cm³");
            } else if (daftar.getPilihan() == 4) {
                System.out.print("Masukan nilai jari-jari: ");
                r = scan.nextInt();
                System.out.println("\nDiketahui \nJari-jari: " + ((Bola) bola).getJariJari() + "cm");
                System.out.println("\nTampilan hasil perhitungan bola");
                System.out.println("Luas Permukaan: " + ((Bola) bola).luasPermukaanBola(r) + "cm²");
                System.out.println("Volume: " + ((Bola) bola).volumeBola(r) + "cm³");
            } else {
                System.out.println("Error, Tidak ada pilihan tersebut!");
            }
            System.out.print("\nApakah anda ingin melanjutkan?(y/n) ");
            ulang = scan.next().charAt(0);
            System.out.println("");
        }while(ulang != 'n' && ulang != 'N');
    }
}