package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d15_Observer.springevent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 监听订单完成事件，发送短信
 */
@Component
class SendSmsOrderFinishedListener2 {

	@EventListener(OrderFinishedEvent2.class)
	public void onApplicationEvent(OrderFinishedEvent2 event) {
		System.out.println("2.2 接收到消息，orderId = " + event.getOrderId() + "，发送一条短信");
	}

}
