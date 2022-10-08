package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
class BusinessService {

	private final IBusinessCheckChain chain;


	public void doBusiness(String businessId, String userId, Integer age) {
		System.out.printf("开始前置判断条件：%s, %s, %d%n", businessId, userId, age);

		chain.doCheck(new BusinessContext(businessId, userId, age));

		System.out.println("前置判断条件通过，继续执行业务");
	}

}
