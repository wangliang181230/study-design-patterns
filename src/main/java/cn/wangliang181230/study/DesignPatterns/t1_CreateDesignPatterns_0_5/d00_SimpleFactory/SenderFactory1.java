package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

/**
 * 普通简单工厂
 */
class SenderFactory1 {

	public ISender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}