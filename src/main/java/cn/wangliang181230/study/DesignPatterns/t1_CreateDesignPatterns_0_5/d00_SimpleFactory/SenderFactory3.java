package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d00_SimpleFactory;

public class SenderFactory3 {

	public static Sender produceMail(){
		return new MailSender();
	}

	public static Sender produceSms(){
		return new SmsSender();
	}
}