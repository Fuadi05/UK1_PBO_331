public class Makanan {
    private String nama;
    private int kalori;

    // Constructor Overloading
    public Makanan() {
        this.nama = "Tidak Diketahui";
        this.kalori = 0;
    }

    public Makanan(String nama, int kalori) {
        this.nama = nama;
        this.kalori = kalori;
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKalori() {
        return kalori;
    }

    public void setKalori(int kalori) {
        this.kalori = kalori;
    }

    // Method Overloading
    public void tampilkanInfo() {
        System.out.println("Makanan: " + nama + ", Kalori: " + kalori);
    }

    public void tampilkanInfo(String infoTambahan) {
        System.out.println("Makanan: " + nama + ", Kalori: " + kalori + " (" + infoTambahan + ")");
    }
}
