import java.util.Scanner;
import java.util.ArrayList;

public class MenuWarteg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar menu dan harga
        final int hargaNasiPutih = 5000;
        final int hargaSayurAsem = 3000;
        final int hargaAyamGoreng = 10000;
        final int hargaTempeGoreng = 5000;
        final int hargaSambal = 2000;
        final int hargaTelurDadar = 3000;
        final int hargaTelurBalado = 5000;
        final int hargaCahKangkung = 4000;
        final int hargaIkanGoreng = 8000;
        final int hargaNasiUduk = 6000;
        final int hargaMieGoreng = 7000;
        final int hargaKangkungGoreng = 4000;
        final int hargaTahuBacem = 3000;
        final int hargaEsTeh = 3000;
        final int hargaEsJeruk = 3000;
        final int hargaTehPanas = 3000;
        final int hargaKopiHitam = 3000;
        final int hargaAirPutih = 2000;

        // Menampilkan menu
        System.out.println("Selamat datang di Warteg Actune!");
        System.out.println("Berikut menu yang tersedia:");
        System.out.println("1. Nasi Putih (Rp5.000)");
        System.out.println("2. Sayur Asem (Rp3.000)");
        System.out.println("3. Ayam Goreng (Rp10.000)");
        System.out.println("4. Tempe Goreng (Rp5.000)");
        System.out.println("5. Sambal (Rp2.000)");
        System.out.println("6. Telur Dadar (Rp3.000)");
        System.out.println("7. Telur Balado (Rp5.000)");
        System.out.println("8. Cah Kangkung (Rp4.000)");
        System.out.println("9. Ikan Goreng (Rp8.000)");
        System.out.println("10. Nasi Uduk (Rp6.000)");
        System.out.println("11. Mie Goreng (Rp7.000)");
        System.out.println("12. Kangkung Goreng (Rp4.000)");
        System.out.println("13. Tahu Bacem (Rp3.000)");
        System.out.println("Minuman");
        System.out.println("14. Es Teh (Rp3.000)");
        System.out.println("15. Es Jeruk (Rp3.000)");
        System.out.println("16. Teh Panas (Rp3.000)");
        System.out.println("17. Kopi Hitam (Rp3.000)");
        System.out.println("18. Air Putih (Rp2.000)");

        System.out.print("Masukkan nomor pilihan Anda (pisahkan dengan koma): ");
        String pilihanStr = scanner.nextLine();

        // Memproses pilihan pengguna
        String[] pilihanArr = pilihanStr.split(",");
        ArrayList<Integer> pilihanList = new ArrayList<>();
        for (String pilihanItem : pilihanArr) {
            try {
                int pilihanInt = Integer.parseInt(pilihanItem);
                if (pilihanInt >= 1 && pilihanInt <= 18) {
                    pilihanList.add(pilihanInt);
                } else {
                    System.out.println("Pilihan " + pilihanItem + " tidak tersedia!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Format input salah!");
                return;
            }
        }

        // Menghitung total harga
        double totalHarga = 0;
        for (int pilihan : pilihanList) {
            switch (pilihan) {
                case 1:
                    totalHarga += hargaNasiPutih;
                    break;
                case 2:
                    totalHarga += hargaSayurAsem;
                    break;
                case 3:
                    totalHarga += hargaAyamGoreng;
                    break;
                case 4:
                    totalHarga += hargaTempeGoreng;
                    break;
                case 5:
                    totalHarga += hargaSambal;
                    break;
                case 6:
                    totalHarga += hargaTelurDadar;
                    break;
                case 7:
                    totalHarga += hargaTelurBalado;
                    break;
                case 8:
                    totalHarga += hargaCahKangkung;
                    break;
                case 9:
                    totalHarga += hargaIkanGoreng;
                    break;
                case 10:
                    totalHarga += hargaNasiUduk;
                case 11:
                    totalHarga += hargaMieGoreng;
                case 12:
                    totalHarga += hargaKangkungGoreng;
                case 13:
                    totalHarga += hargaTahuBacem;
                case 14:
                    totalHarga += hargaEsTeh;
                case 15:
                    totalHarga += hargaEsJeruk;
                case 16:
                    totalHarga += hargaTehPanas;
                case 17:
                    totalHarga += hargaKopiHitam;
                case 18:
                    totalHarga += hargaAirPutih;
                    break;
                }
            }
    
            // Menampilkan total harga
            System.out.println("===============");
            System.out.println("Bukti Pembayaran");
            System.out.printf("Total harga: Rp%.2f\n", totalHarga);
            System.out.println("Terimakasih telah makan di Warteg Actune!");
    
            scanner.close();
        }
    }
                    
