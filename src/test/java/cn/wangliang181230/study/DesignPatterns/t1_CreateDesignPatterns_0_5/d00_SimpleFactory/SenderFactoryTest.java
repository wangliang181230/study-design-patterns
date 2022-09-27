package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SenderFactoryTest {

	@Test
	public void testProduce() {
		SenderFactory factory = new SenderFactory();

		Sender sender1 = factory.produce("mail");
		sender1.send();

		Sender sender2 = factory.produce("sms");
		sender2.send();

		Sender sender3 = factory.produce("unknown");
		Assertions.assertNull(sender3);
	}
}
