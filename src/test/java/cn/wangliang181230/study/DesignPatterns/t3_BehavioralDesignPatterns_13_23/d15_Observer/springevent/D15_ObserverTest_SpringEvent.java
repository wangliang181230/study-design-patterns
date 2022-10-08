package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d15_Observer.springevent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class D15_ObserverTest_SpringEvent {

	@Autowired
	private OrderService orderService;

	@Test
	public void test1() {
		orderService.finishOrder1("111111");
	}


	@Test
	public void test2() throws InterruptedException {
		orderService.finishOrder2("222222");
	}

}
