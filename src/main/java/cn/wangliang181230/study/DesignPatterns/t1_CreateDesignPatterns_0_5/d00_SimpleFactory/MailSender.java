package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

class MailSender implements ISender {
	@Override
	public void send() {
		System.out.println("This is mail sender!");
	}
}
