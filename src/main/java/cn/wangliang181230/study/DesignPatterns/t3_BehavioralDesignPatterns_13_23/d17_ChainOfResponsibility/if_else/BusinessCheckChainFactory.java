package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

class BusinessCheckChainFactory {

	public static IBusinessCheckChain create() {
		IBusinessCheckChain c1 = new AgeBusinessCheckChain(null);
		IBusinessCheckChain c2 = new UserBusinessCheckChain(c1);
		return c2;
	}

}
