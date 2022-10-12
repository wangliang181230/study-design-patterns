package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else.example2;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Service
class BusinessService2 {

	private final BusinessCheckerChainHolder chainHolder;


	public void doBusiness(String businessId, String userId, Integer userAge, String userType) {
		System.out.printf("开始前置条件校验：%s, %s, %d, %s%n\r\n", businessId, userId, userAge, userType);
		chainHolder.get().doCheck(new BusinessContext(businessId, userId, userAge, userType));

		System.out.println("\r\n前置条件校验通过，继续执行业务");
	}

}
