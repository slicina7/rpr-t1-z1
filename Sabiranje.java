import java.util.Scanner; // Korištene biblioteke
public class Sabiranje {
        public static void main(String[] args) {
			int prvi, drugi, zbir;// Deklarišemo promjenljive
			Scanner ulaz = new Scanner(System.in); // Ulazni objekat
			System.out.println("Unesite prvi broj: ");
			prvi = ulaz.nextInt();
			System.out.println("Unesite drugi broj: ");
			drugi = ulaz.nextInt();
			zbir = prvi + drugi;
			System.out.println("Zbir dva unesena broja iznosi:" + zbir);
        }
}