package thread;
import java.util.concurrent.Semaphore;

public class Producator extends Thread {
	int n = 5;
	int i;
    public int[] list = new int[n];
    boolean listFree = true;
	Semaphore s = new Semaphore(1);
	public void run() {
		try {
			while(true) {
				for(i=0;i < list.length; i++) {
					if( list[i] == 0) {
						listFree = true;
					}
					
					while(listFree == true) {		
					s.acquire();
						if(list[i]==0) {
							list[i] = 1;

							System.out.println("A fost produs elememntul" + i);
							listFree = false;
						}
					s.release();
				    Thread.sleep(1000);
				}
			}
		}
	}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
