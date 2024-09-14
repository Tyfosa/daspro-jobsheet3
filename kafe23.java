import java.util.Scanner;

public class kafe23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input scanner //
        boolean keanggotaan; // tanda bahwa variabel boolean ada variabel keanggotaan //
        int jmlKopi, jmlTeh, jmlRoti; // tanda bahwa variabel int ada variabel jmlKopi, jmlTeh, jmlRoti //
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0; // tanda bahwa variabel double ada variabel hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0 //
        float diskon = 10 /100; // tanda bahwa variabel float ada variabel diskon //
        double totalHarga, nominalBayar; // tanda bahwa variabel double ada variabel totalHarga, nominalBayar //
        
        System.out.println("Masukkan keanggotaan (true/false): "); // memberitahu user akan memasukan true or false // 
        keanggotaan = input.nextBoolean(); // input true or false //
        System.out.println("Masukkan jumlah pembelian kopi: "); // memberitahu user akan memasukan jumlah pembelian kopi: //
        jmlKopi = input.nextInt(); // input  jumlah pembelian kopi: //
        System.out.println("Masukkan jumlah pembelian teh: "); // memberitahu user akan memasukan jumlah pembelian teh: //
        jmlTeh = input.nextInt(); // input pembelian teh //
        System.out.println("Masukkan jumlah pembelian roti: "); // memberitahu user akan memasukan jumlah pembelian roti //
        jmlRoti = input.nextInt(); // input pembelian roti //
        
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti); // memberitahu user jumlah total dari (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti)//
        nominalBayar = totalHarga - (diskon * totalHarga); // memberitahu user jumlah total dari harga yang keluar dipotong diskon //
        

        int nominalInt = (int) nominalBayar; // mengubah nominal bayar dari variabel double menjadi variabel int //
        byte totalByte = (byte) totalHarga; // mengubah total harga dari variabel double menjadi varibel byte //
        
        System.out.println("Keanggotaan pelanggan " + keanggotaan); // konfirmasi pelanggan sudah benar atau salah //
        System.out.println("Item pembelian " + jmlKopi + "Kopi, " + jmlTeh + "Teh, " + jmlRoti + "Roti, "); // konfirmasi jumlah item pembelian //
        System.out.println("Nominal bayar Rp " + nominalBayar); // mengetahui jumlah nominal bayar dari semua pembelian //
        System.out.println("Nominal bayar (dalam int): Rp " + nominalInt); // mengetahui jumlah nominal bayar dalam bentuk int dari semua pembelian //
        System.out.println("Total harga (dalam byte): " + totalByte); // mencetak nominal bayar dalam type byte //


    }
    
}
