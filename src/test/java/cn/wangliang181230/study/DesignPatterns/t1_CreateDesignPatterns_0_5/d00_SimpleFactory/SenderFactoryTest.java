package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SenderFactoryTest {

	@Test
	public void testFactory1() {
		SenderFactory1 factory1 = new SenderFactory1();

		Sender sender1 = factory1.produce("mail");
		sender1.send();

		Sender sender2 = factory1.produce("sms");
		sender2.send();

		Sender sender3 = factory1.produce("unknown");
		Assertions.assertNull(sender3);
	}

	@Test
	public void testFactory2() {
		SenderFactory2 factory2 = new SenderFactory2();

		Sender sender1 = factory2.produceMail();
		sender1.send();

		Sender sender2 = factory2.produceSms();
		sender2.send();
	}

	@Test
	public void testFactory3() {
		Sender sender1 = SenderFactory3.produceMail();
		sender1.send();

		Sender sender2 = SenderFactory3.produceSms();
		sender2.send();
	}
}
