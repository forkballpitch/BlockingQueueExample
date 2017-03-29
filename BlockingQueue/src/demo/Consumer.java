package demo;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue queue;

	public Consumer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				String msg = (String) queue.take();
				System.out.println("�޽����� �����ϴ�. : " + msg + "[" + queue.size() + "]");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
