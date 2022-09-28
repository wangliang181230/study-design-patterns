package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d01_FactoryMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactoryMethodTest {

	@Test
	public void test() {
		ISenderFactory mailSenderFactory = new MailSenderFactory();
		ISender mailSender = mailSenderFactory.create();
		Assertions.assertEquals(mailSender.getClass(), MailSender.class);
		mailSender.send();

		ISenderFactory smsSenderFactory = new SmsSenderFactory();
		ISender smsSender = smsSenderFactory.create();
		Assertions.assertEquals(smsSender.getClass(), SmsSender.class);
		smsSender.send();
	}
}
