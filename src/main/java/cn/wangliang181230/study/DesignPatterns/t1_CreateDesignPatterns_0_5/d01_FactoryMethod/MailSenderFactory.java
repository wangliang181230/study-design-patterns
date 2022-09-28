package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d01_FactoryMethod;

class MailSenderFactory implements ISenderFactory {

	public ISender create() {
		return new MailSender();
	}
}