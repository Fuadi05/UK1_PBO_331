public class Pizza extends Makanan {
    private String ukuran;

    // Constructor Overloading
    public Pizza() {
        super();
        this.ukuran = "Sedang";
    }

    public Pizza(String nama, int kalori, String ukuran) {
        super(nama, kalori);
        this.ukuran = ukuran;
    }

    // Setter dan Getter
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("Pizza: " + getNama() + ", Ukuran: " + ukuran + ", Kalori: " + getKalori());
    }
}
