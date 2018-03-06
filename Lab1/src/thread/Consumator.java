package thread;

public class Consumator extends Thread {
	
	private Producator producator;
	int elementToConsume;
	@Override
	public void run() {
		try {
			while(true) {
				elementToConsume = producator.randomElement;
				if(Main.list.isEmpty() == true) {
					System.out.println("Lista este goala");
				}
				else {
					System.out.println("Se consuma elementul...");
					Main.s.acquire();
					Main.list.remove(elementToConsume);
					System.out.println("A fost consumat elementul" + elementToConsume);
					Main.s.release();
				}
				
				Thread.sleep(100);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
