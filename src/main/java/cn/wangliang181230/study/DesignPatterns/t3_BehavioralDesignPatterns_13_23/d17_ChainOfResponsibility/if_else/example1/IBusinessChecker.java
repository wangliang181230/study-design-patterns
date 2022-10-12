package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example1;

interface IBusinessChecker {

	void doCheck(BusinessContext context, IBusinessCheckerChain chain);

}
