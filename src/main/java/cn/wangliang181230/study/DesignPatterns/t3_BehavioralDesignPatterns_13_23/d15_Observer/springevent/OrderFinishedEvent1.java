package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d15_Observer.springevent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
class OrderFinishedEvent1 extends ApplicationEvent {

	private final String orderId;

	public OrderFinishedEvent1(Object source, String orderId) {
		super(source);
		this.orderId = orderId;
	}
}
