import data.Data;
import proses.Operasi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplikasi {
    private static Scanner scn;
    private static Operasi op;

    public static void main(String args[]){
        int m;
        scn = new Scanner(System.in);
        op = new Operasi();


        do {
            menu();
            try {
                scn = new Scanner(System.in);
                m = scn.nextInt();
                pilih(m);
            }catch (InputMismatchException e){
                System.out.println("Masukan pilihan 1 - 5");
                m=0;
            }


        }while (m !=5);
    }
    private static void pilih(int p){
        if (p==1) {
            tambah();
        }
        else if (p==2){
            ubah();

        }
        else if (p==3){
            hapus();

        }
        else if (p==4){
            op.tampilData();

        }
    }
    private static void ubah(){
        scn = new Scanner(System.in);
        String id, merk, type;
        int harga, stok;

      try {
          System.out.println("Ubah Data");
          System.out.print("ID          : ");
          id = scn.nextLine();
          System.out.print("Merk Laptop : ");
          merk = scn.nextLine();
          System.out.print("Type        : ");
          type = scn.nextLine();
          System.out.print("Harga       : ");
          harga = Integer.parseInt(scn.nextLine());
          System.out.print("Jumlah Stok : ");
          stok = Integer.parseInt(scn.nextLine());
          op.ubah(new Data(id, merk, type, harga, stok));
      }catch (NumberFormatException e){
          System.out.print("Mohon isi form Harga dan Jumlah Stok dengan angka\n");
          ubah();
      }

    }
    private static void hapus(){
        scn = new Scanner(System.in);
        String id, merk = null, type = null;
        int harga = 0, stok = 0;

        System.out.println("Hapus Data");
        System.out.print("ID          : ");
        id = scn.nextLine();
        op.hapus(new Data(id, merk, type,  harga, stok));
    }

    private static void tambah(){
        scn = new Scanner(System.in);
        String id, merk, type;
        int harga, stok;

        try {
            System.out.println("Tambah Data");
            System.out.print("ID          : ");
            id = scn.nextLine();
            System.out.print("Merk Laptop : ");
            merk = scn.nextLine();
            System.out.print("Type        : ");
            type = scn.nextLine();
            System.out.print("Harga       : ");
            harga = Integer.parseInt(scn.nextLine());
            System.out.print("Jumlah Stok : ");
            stok = Integer.parseInt(scn.nextLine());
            op.simpan(new Data(id, merk, type, harga, stok));
        }catch (NumberFormatException e){
            System.out.print("Mohon isi form Harga dan Jumlah Stok dengan angka\n");
            tambah();
        }

    }

    private static void menu(){
        System.out.println("Aplikasi Olah Data Stok Laptop Di Gudang\n");
        System.out.println("Menu");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Keluar\n");
        System.out.print("Pilih Menu >");

    }
}
