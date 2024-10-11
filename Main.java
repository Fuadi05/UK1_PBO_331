public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas anak
        Pizza pizza = new Pizza("Pizza Pepperoni", 250, "Besar");
        Burger burger = new Burger("Burger Sapi", 350, true);
        Salad salad = new Salad("Salad Caesar", 150, "Ranch");

        // Menampilkan informasi awal
        pizza.tampilkanInfo();
        burger.tampilkanInfo();
        salad.tampilkanInfo();

        // Menggunakan setter untuk mengubah data
        pizza.setUkuran("Kecil");
        burger.setAdaKeju(false);
        salad.setSaus("Vinaigrette");

        // Menampilkan informasi setelah perubahan
        System.out.println("\nInformasi Terbaru:");
        pizza.tampilkanInfo();
        burger.tampilkanInfo();
        salad.tampilkanInfo();

        // Menampilkan method overloading
        pizza.tampilkanInfo("Topping tambahan: Zaitun");

        // Menggunakan kelas Rasa
        Rasa rasaPizza = new Rasa("Gurih");
        rasaPizza.deskripsikanRasa();
    }
}
