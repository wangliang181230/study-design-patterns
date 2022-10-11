package cn.wangliang181230.study.DesignPatterns.common;

import java.util.List;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.util.Assert;

public abstract class OrderUtils {

	public static int getOrder(Object object) {
		Assert.notNull(object, "'object' must be not null");

		if (object instanceof Ordered) {
			return ((Ordered)object).getOrder();
		}

		Order order = object.getClass().getAnnotation(Order.class);
		if (order != null) {
			return order.value();
		}

		return Ordered.LOWEST_PRECEDENCE;
	}

	public static <T> List<T> sortByOrder(List<T> list) {
		list.sort((a, b) -> {
			int orderA = getOrder(a);
			int orderB = getOrder(b);
			return Integer.compare(orderA, orderB);
		});
		return list;
	}
}
