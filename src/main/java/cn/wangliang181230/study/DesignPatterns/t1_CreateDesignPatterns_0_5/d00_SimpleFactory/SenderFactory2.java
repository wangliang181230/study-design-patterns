package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

/**
 * 多方法简单工厂
 */
class SenderFactory2 {

	public ISender produceMail() {
		return new MailSender();
	}

	public ISender produceSms() {
		return new SmsSender();
	}
}