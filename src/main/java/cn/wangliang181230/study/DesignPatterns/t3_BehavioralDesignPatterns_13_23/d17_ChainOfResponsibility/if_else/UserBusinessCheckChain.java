package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

import org.springframework.util.StringUtils;

class UserBusinessCheckChain extends AbstractBusinessCheckChain {

	public UserBusinessCheckChain(IBusinessCheckChain next) {
		super(next);
	}


	@Override
	public void doCheck(BusinessContext context) {
		if (StringUtils.isEmpty(context.getUserId())) {
			System.out.println("✖ 用户ID不能为空，不能继续业务");
			throw new IllegalArgumentException("✖ 用户ID不能为空，不能继续业务");
		}

		System.out.println("✔ 用户ID不为空，继续业务");
		super.doNext(context);
	}
}
