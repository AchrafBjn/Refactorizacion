package ejercicio2;

public class Ej2 {

	// ...

	int numberOfLateDeliveries = 0;

	int getRating() {

		return numberOfLateDeliveries > 5 ? 2 : 1;

	}

}
