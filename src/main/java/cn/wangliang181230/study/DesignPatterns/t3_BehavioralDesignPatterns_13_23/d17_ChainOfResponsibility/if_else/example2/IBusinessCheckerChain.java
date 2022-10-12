package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example2;

interface IBusinessCheckerChain {

	void doCheck(BusinessContext context);

	void setNext(IBusinessCheckerChain next);

}
