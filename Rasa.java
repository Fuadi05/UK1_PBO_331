public class Rasa {
    private String rasa;

    // Constructor
    public Rasa(String rasa) {
        this.rasa = rasa;
    }

    // Setter dan Getter
    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void deskripsikanRasa() {
        System.out.println("Makanan ini memiliki rasa " + rasa);
    }
}
