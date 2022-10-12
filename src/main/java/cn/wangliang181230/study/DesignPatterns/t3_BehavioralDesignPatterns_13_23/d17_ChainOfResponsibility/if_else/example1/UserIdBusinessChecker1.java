package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example1;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Order(1)
@Component
class UserIdBusinessChecker1 implements IBusinessChecker {

	@Override
	public void doCheck(BusinessContext context, IBusinessCheckerChain chain) {
		if (StringUtils.isEmpty(context.getUserId())) {
			System.out.println("✖ 用户ID不能为空，不能继续业务");
			throw new IllegalArgumentException("✖ 用户ID不能为空，不能继续业务");
		}

		System.out.println("✔ 用户ID不为空，继续业务");
		chain.doCheck(context);
	}
}
