package proses;

import data.Data;

import java.util.LinkedList;
import java.util.List;

public class Operasi {
    private  static List<Data> data = new LinkedList<Data>();

    public void simpan(Data d){
        data.add(d);
        System.out.println("Data Telah Ditambahkan");
    }

    public void ubah(Data d){
        int idx = data.indexOf(d);
        if (idx >=0){
            data.set(idx, d);
            System.out.println("Data Telah Diubah");
        }else
            System.out.println("Tidak Ditemukan Data Yang Cocok dengan ID Yang Dimasukkan");
    }

    public void hapus(Data d){
        int idx = data.indexOf(d);
        if (idx >=0){
            data.remove(idx);
            System.out.println("Data Telah Dihapush");
        }else
            System.out.println("Tidak Ditemukan Data Yang Cocok dengan ID Yang Dimasukkan");
    }

    public void  tampilData(){
            System.out.println("Data Laptop");
        int i = 1;
        for (Data d : data){
            System.out.println("Data Ke- "+ i++);
            System.out.println("ID          : "+ d.getId());
            System.out.println("Merk Laptop : "+ d.getMerk());
            System.out.println("Type        : "+ d.getType());
            System.out.println("Harga       : "+ d.getHarga());
            System.out.println("Jumlah Stok : "+ d.getStok());
        }
    }
}
