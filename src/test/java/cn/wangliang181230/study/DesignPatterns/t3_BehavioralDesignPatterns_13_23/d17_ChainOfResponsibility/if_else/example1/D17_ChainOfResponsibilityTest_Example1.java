package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class D17_ChainOfResponsibilityTest_Example1 {

	@Autowired
	private BusinessService1 businessService1;


	@Test
	public void test10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			try {
				businessService1.doBusiness("11111", null, 18, "老年人");
			} catch (IllegalArgumentException e) {
				Assertions.assertTrue(e.getMessage().contains("用户ID不能为空"));
				throw e;
			}
		});
	}

	@Test
	public void test21() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			try {
				businessService1.doBusiness("22222", "userId_222", null, "老年人");
			} catch (IllegalArgumentException e) {
				Assertions.assertTrue(e.getMessage().contains("用户年龄不能为空"));
				throw e;
			}
		});
	}

	@Test
	public void test22() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			try {
				businessService1.doBusiness("22222", "userId_222", 17, "老年人");
			} catch (IllegalArgumentException e) {
				Assertions.assertTrue(e.getMessage().contains("用户年龄未满18周岁"));
				throw e;
			}
		});
	}

	@Test
	public void test31() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			try {
				businessService1.doBusiness("33333", "userId_333", 18, null);
			} catch (IllegalArgumentException e) {
				Assertions.assertTrue(e.getMessage().contains("用户类型不能为空"));
				throw e;
			}
		});
	}

	@Test
	public void test32() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			try {
				businessService1.doBusiness("33333", "userId_333", 18, "病人");
			} catch (IllegalArgumentException e) {
				Assertions.assertTrue(e.getMessage().contains("用户类型不是“老年人”"));
				throw e;
			}
		});
	}

	@Test
	public void testSuccess() {
		businessService1.doBusiness("44444", "userId_444", 18, "老年人");
	}
}
