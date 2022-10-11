package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
class UserAgeBusinessCheckChain extends AbstractBusinessCheckChain {

	@Override
	public void doCheck(BusinessContext context) {
		if (context.getUserAge() == null) {
			System.out.println("✖ 用户年龄不能为空，不能继续业务");
			throw new IllegalArgumentException("✖ 用户年龄不能为空，不能继续业务");
		}
		if (context.getUserAge() < 18) {
			System.out.println("✖ 用户年龄未满18周岁，不能继续业务");
			throw new IllegalArgumentException("✖ 用户年龄未满18周岁，不能继续业务");
		}

		System.out.println("✔ 用户年龄满18周岁，继续业务");
		super.doNext(context);
	}
}
