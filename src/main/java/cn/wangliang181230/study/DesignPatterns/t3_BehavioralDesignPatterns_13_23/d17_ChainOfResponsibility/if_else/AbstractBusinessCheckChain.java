package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

abstract class AbstractBusinessCheckChain implements IBusinessCheckChain {

	private final IBusinessCheckChain next;


	public AbstractBusinessCheckChain(IBusinessCheckChain next) {
		this.next = next;
	}

	public void doNext(BusinessContext context) {
		if (next != null) {
			next.doCheck(context);
		}
	}
}
