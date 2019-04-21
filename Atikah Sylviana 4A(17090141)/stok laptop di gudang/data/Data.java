package data;

public class Data {
    private String id;
    private String merk;
    private String type;
    private int harga;
    private int stok;


    public Data(String id, String merk, String type, int harga, int stok) {
        this.id = id;
        this.merk = merk;
        this.type = type;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public boolean equals(Object o) {
        Data dt = (Data) o;
        return id.equals(dt.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
