package com.suaee.util.id;

import java.util.HashSet;
import java.util.Set;

class IdGen implements Runnable {
	private Set<Long> ids;
	private IdWorker idWorker;

	public IdGen(Set<Long> ids, IdWorker idWorker) {
		super();
		this.ids = ids;
		this.idWorker = idWorker;
	}

	@Override
	public void run() {
		while (true) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			long id = idWorker.nextId();
			System.out.println(id);
			if (!ids.add(id)) {
                System.out.println("duplicate:" + id);
            }
		}
	}

}

public class IdTest {

	public static void main(String[] args)  {
		Set<Long> ids = new HashSet<Long>();
		new Thread(new IdGen(ids, new IdWorker(0, 1))).start();
		new Thread(new IdGen(ids, new IdWorker(0, 2))).start();
	}

}
