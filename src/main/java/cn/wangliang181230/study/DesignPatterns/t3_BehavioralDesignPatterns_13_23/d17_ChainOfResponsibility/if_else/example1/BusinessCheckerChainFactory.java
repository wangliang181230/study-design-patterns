package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example1;

import java.util.List;

import cn.wangliang181230.study.DesignPatterns.common.OrderUtils;
import org.springframework.stereotype.Component;

@Component
class BusinessCheckerChainFactory {

	private final List<IBusinessChecker> chainList;

	public BusinessCheckerChainFactory(List<IBusinessChecker> chainList) {
		// 先排序
		OrderUtils.sortByOrder(chainList);

		// 再设置
		this.chainList = chainList;
	}

	public IBusinessCheckerChain create() {
		return new DefaultBusinessCheckerChain(chainList);
	}
}
