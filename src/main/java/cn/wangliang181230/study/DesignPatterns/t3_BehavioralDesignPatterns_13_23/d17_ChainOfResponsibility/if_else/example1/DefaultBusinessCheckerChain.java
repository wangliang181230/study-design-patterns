package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example1;

import java.util.List;

import cn.wangliang181230.study.DesignPatterns.common.OrderUtils;

class DefaultBusinessCheckerChain implements IBusinessCheckerChain {

	/**
	 * 链
	 */
	private final List<IBusinessChecker> checkerList;

	/**
	 * 当前游标
	 */
	private int t = -1;


	public DefaultBusinessCheckerChain(List<IBusinessChecker> checkerList) {
		// 先排序
		OrderUtils.sortByOrder(checkerList);

		// 再设置
		this.checkerList = checkerList;
	}

	@Override
	public void doCheck(BusinessContext context) {
		if (t < checkerList.size() - 1) {
			t++;
			this.checkerList.get(t).doCheck(context, this);
		}
	}
}
