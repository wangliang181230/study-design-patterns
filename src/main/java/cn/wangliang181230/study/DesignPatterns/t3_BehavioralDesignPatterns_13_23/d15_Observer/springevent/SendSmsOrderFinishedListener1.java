package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d15_Observer.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听订单完成事件，发送短信
 */
@Component
class SendSmsOrderFinishedListener1 implements ApplicationListener<OrderFinishedEvent1> {

	@Override
	public void onApplicationEvent(OrderFinishedEvent1 event) {
		System.out.println("1.2 接收到消息，orderId = " + event.getOrderId() + "，发送一条短信，线程ID：" + Thread.currentThread().getId());
	}
}
