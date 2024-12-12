import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> totalBiaya = new ArrayList<>();

        while (true) {
            System.out.print("Masukan pilihan hampers [1/2/3]: ");
            int hampers = input.nextInt();

            System.out.print("Masukan pilihan packing [1/2/3]: ");
            int packing = input.nextInt();

            double total = hitungTotalBiaya(hampers, packing);
            totalBiaya.add(total);

            System.out.print("Input lagi (Y/N)?: ");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("N")) {
                break;
            }
        }

        double totalBayar = hitungTotalBayar(totalBiaya);
        System.out.println("Total hamper yang dipesan = " + totalBiaya.size());
        System.out.println("Total yang harus dibayar = Rp " + totalBayar);
        System.out.println(Nomor2.class.getDeclaredMethods().length);
    }

    public static double hitungTotalBiaya(int hampers, int packing) {
        double hargaHampers = 0;
        double hargaPacking = 0;

        switch (hampers) {
            case 1:
                hargaHampers = 150000;
                break;
            case 2:
                hargaHampers = 175000;
                break;
            case 3:
                hargaHampers = 200000;
                break;
        }

        switch (packing) {
            case 1:
                hargaPacking = 50000;
                break;
            case 2:
                hargaPacking = 75000;
                break;
            case 3:
                hargaPacking = 125000;
                break;
        }

        return hargaHampers + hargaPacking;
    }

    public static double hitungTotalBayar(ArrayList<Double> totalBiaya) {
        double totalBayar = 0;
        for (double biaya : totalBiaya) {
            totalBayar += biaya;
        }
        return totalBayar * 1.1;
    }
}
