package thread;
import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		
	 //int n = 5;
	 //int[] list = new int[n];
	 //Semaphore semaphore = new Semaphore(0);
	 Producator t1 = new Producator();
	 t1.run();

	}

}
