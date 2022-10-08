package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d15_Observer.springevent;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
class OrderService {

	private final ApplicationContext applicationContext;


	//region 方式1

	public void finishOrder1(String orderId) {
		System.out.println("执行业务，状态变更为已完成\r\n");

		// 触发订单完成事件
		this.onFinishedEvent1(orderId);

		System.out.println("\r\n订阅事件全部执行完成");
	}

	private void onFinishedEvent1(String orderId) {
		System.out.println("方式1");
		ApplicationEvent event1 = new OrderFinishedEvent1(this, orderId);
		applicationContext.publishEvent(event1);
	}

	//endregion


	//region 方式2

	public void finishOrder2(String orderId) {
		System.out.println("执行业务，状态变更为已完成\r\n");

		// 触发订单完成事件
		this.onFinishedEvent2(orderId);

		System.out.println("\r\n订阅事件全部执行完成");
	}

	private void onFinishedEvent2(String orderId) {
		System.out.println("方式2");
		OrderFinishedEvent2 event2 = new OrderFinishedEvent2(orderId);
		applicationContext.publishEvent(event2);
	}

	//endregion
}
