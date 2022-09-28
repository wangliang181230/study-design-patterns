package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

/**
 * 静态方法简单工厂
 */
class SenderFactory3 {

	public static ISender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}

	public static ISender produceMail(){
		return new MailSender();
	}

	public static ISender produceSms(){
		return new SmsSender();
	}
}