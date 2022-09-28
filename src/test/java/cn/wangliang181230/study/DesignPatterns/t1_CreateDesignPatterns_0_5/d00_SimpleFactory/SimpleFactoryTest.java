package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleFactoryTest {

	@Test
	public void testFactory1() {
		SenderFactory1 factory1 = new SenderFactory1();

		ISender sender1 = factory1.produce("mail");
		sender1.send();

		ISender sender2 = factory1.produce("sms");
		sender2.send();

		ISender sender3 = factory1.produce("unknown");
		Assertions.assertNull(sender3);
	}

	@Test
	public void testFactory2() {
		SenderFactory2 factory2 = new SenderFactory2();

		ISender sender1 = factory2.produceMail();
		sender1.send();

		ISender sender2 = factory2.produceSms();
		sender2.send();
	}

	@Test
	public void testFactory3() {
		ISender sender1 = SenderFactory3.produce("mail");
		Assertions.assertNotNull(sender1);
		sender1.send();

		ISender sender2 = SenderFactory3.produce("sms");
		Assertions.assertNotNull(sender2);
		sender2.send();

		ISender sender3 = SenderFactory3.produce("unknown");
		Assertions.assertNull(sender3);


		ISender sender4 = SenderFactory3.produceMail();
		sender4.send();

		ISender sender5 = SenderFactory3.produceSms();
		sender5.send();
	}
}
