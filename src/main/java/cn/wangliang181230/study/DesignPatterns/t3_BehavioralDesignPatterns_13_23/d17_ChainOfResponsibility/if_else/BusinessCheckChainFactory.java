package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

class BusinessCheckChainFactory {

	/**
	 * 当前例子使用了简单工厂来创建这个责任链对象。<br>
	 * 可以通过给每个节点添加一个order值，将所有节点进行排序，然后根据顺序设置next属性，然后就可以通过order值来调整节点的执行顺序。
	 */
	public static IBusinessCheckChain create() {
		IBusinessCheckChain c1 = new AgeBusinessCheckChain(null);
		IBusinessCheckChain c2 = new UserBusinessCheckChain(c1);
		return c2;
	}

}
