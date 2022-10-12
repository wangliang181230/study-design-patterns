package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example2;

abstract class AbstractBusinessCheckerChain implements IBusinessCheckerChain {

	private IBusinessCheckerChain next;


	protected void doNext(BusinessContext context) {
		if (next != null) {
			next.doCheck(context);
		}
	}


	@Override
	public void setNext(IBusinessCheckerChain next) {
		this.next = next;
	}
}
