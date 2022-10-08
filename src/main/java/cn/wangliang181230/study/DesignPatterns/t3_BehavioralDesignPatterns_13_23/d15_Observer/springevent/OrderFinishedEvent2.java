package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d15_Observer.springevent;

import lombok.Data;

@Data
class OrderFinishedEvent2 {

	private final String orderId;

	public OrderFinishedEvent2(String orderId) {
		this.orderId = orderId;
	}
}
