package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

class AgeBusinessCheckChain extends AbstractBusinessCheckChain {

	public AgeBusinessCheckChain(IBusinessCheckChain next) {
		super(next);
	}


	@Override
	public void doCheck(BusinessContext context) {
		if (context.getAge() < 18) {
			System.out.println("年龄未满18周岁，不能继续业务");
			throw new IllegalArgumentException("年龄未满18周岁，不能继续业务");
		}

		System.out.println("年龄满18周岁，继续业务");
		super.doNext(context);
	}
}
