package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

import java.util.List;

import cn.wangliang181230.study.DesignPatterns.common.OrderUtils;

class BusinessCheckChainJointer {

	public static IBusinessCheckChain join(List<IBusinessCheckChain> chains) {
		// 先排序
		OrderUtils.sortByOrder(chains);

		// 将前后连接起来
		for (int i = 1; i < chains.size(); i++) {
			chains.get(i - 1).setNext(chains.get(i));
		}

		// 返回第1个节点作为链的入口
		return chains.get(0);
	}
}
