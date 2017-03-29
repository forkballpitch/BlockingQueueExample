package demo;

import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue queue;

	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				Date d = new Date();
				String msg = "�޽���" + d.toString();
				queue.add(msg);
				System.out.println("�޽����� �����մϴ�. [" + queue.size() + "]");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
