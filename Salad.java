public class Salad extends Makanan {
    private String saus;

    // Constructor
    public Salad(String nama, int kalori, String saus) {
        super(nama, kalori);
        this.saus = saus;
    }

    // Setter dan Getter
    public String getSaus() {
        return saus;
    }

    public void setSaus(String saus) {
        this.saus = saus;
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("Salad: " + getNama() + ", Saus: " + saus + ", Kalori: " + getKalori());
    }
}
