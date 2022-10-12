package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example2;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
class BusinessCheckerChainHolder {

	private final IBusinessCheckerChain chain;

	public BusinessCheckerChainHolder(List<IBusinessCheckerChain> chains) {
		this.chain = BusinessCheckerChainJointer.join(chains);
	}

	public IBusinessCheckerChain get() {
		return this.chain;
	}

}
