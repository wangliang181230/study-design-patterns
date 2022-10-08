package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class D17_ChainOfResponsibilityTest {

	@Autowired
	private BusinessService businessService;


	@Test
	public void test1() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			businessService.doBusiness("11111", null, 18);
		});
	}

	@Test
	public void test2() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			businessService.doBusiness("22222", "userId_222", 17);
		});
	}

	@Test
	public void test3() {
		businessService.doBusiness("33333", "userId_333", 20);
	}
}
