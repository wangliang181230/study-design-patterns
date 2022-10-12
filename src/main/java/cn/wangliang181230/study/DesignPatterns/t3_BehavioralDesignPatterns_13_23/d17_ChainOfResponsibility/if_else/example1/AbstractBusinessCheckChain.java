package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example1;

abstract class AbstractBusinessCheckChain implements IBusinessCheckChain {

	private IBusinessCheckChain next;


	protected void doNext(BusinessContext context) {
		if (next != null) {
			next.doCheck(context);
		}
	}


	@Override
	public void setNext(IBusinessCheckChain next) {
		this.next = next;
	}
}
