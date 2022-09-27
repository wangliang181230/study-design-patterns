package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

public class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is mail sender!");
	}
}
