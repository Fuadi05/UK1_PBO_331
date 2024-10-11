public class Burger extends Makanan {
    private boolean adaKeju;

    // Constructor
    public Burger(String nama, int kalori, boolean adaKeju) {
        super(nama, kalori);
        this.adaKeju = adaKeju;
    }

    // Setter dan Getter
    public boolean getAdaKeju() {
        return adaKeju;
    }

    public void setAdaKeju(boolean adaKeju) {
        this.adaKeju = adaKeju;
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        String infoKeju = adaKeju ? "dengan keju" : "tanpa keju";
        System.out.println("Burger: " + getNama() + " " + infoKeju + ", Kalori: " + getKalori());
    }
}
