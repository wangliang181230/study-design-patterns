package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

public class SenderFactory2 {

	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}