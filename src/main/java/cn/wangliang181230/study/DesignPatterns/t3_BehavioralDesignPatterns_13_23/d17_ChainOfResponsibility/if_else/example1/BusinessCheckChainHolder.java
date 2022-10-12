package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example1;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
class BusinessCheckChainHolder {

	private final IBusinessCheckChain chain;

	public BusinessCheckChainHolder(List<IBusinessCheckChain> chains) {
		this.chain = BusinessCheckChainJointer.join(chains);
	}

	public IBusinessCheckChain get() {
		return this.chain;
	}

}
