package thread.priority;

/**
 * Main program
 * @author <a href="mailto:everton@dimap.ufrn.br">Everton Cavalcante</a>
 */
public class MainThread {
	/**
	 * Main method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		// Creating the thread objects
		ThreadEx thread1 = new ThreadEx("Thread1", 5000);
		ThreadEx thread2 = new ThreadEx("Thread2", 2500);
		ThreadEx thread3 = new ThreadEx("Thread3", 1250);

		// Setting the threads' priorities
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(8);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		// Running the threads
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			// Setting the main thread to wait until the others have been finished
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
