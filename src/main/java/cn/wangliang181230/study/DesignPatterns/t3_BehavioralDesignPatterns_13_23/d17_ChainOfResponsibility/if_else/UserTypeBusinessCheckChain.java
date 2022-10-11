package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 这个实现类演示使用 Ordered接口 来定义order值，查看 {@link #getOrder()} 方法
 */
//@Order(3)
@Component
class UserTypeBusinessCheckChain extends AbstractBusinessCheckChain implements Ordered {

	@Override
	public int getOrder() {
		return 3;
	}

	@Override
	public void doCheck(BusinessContext context) {
		if (StringUtils.isEmpty(context.getUserType())) {
			System.out.println("✖ 用户类型不能为空，不能继续业务");
			throw new IllegalArgumentException("✖ 用户类型不能为空，不能继续业务");
		}
		if (!"老年人".equals(context.getUserType())) {
			System.out.println("✖ 用户类型不是“老年人”，不能继续业务");
			throw new IllegalArgumentException("✖ 用户类型不是“老年人”，不能继续业务");
		}

		System.out.println("✔ 用户类型是“老年人”，继续业务");
		super.doNext(context);
	}
}
