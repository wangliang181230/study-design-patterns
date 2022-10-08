package cn.wangliang181230.study.DesignPatterns.t3_BehavioralDesignPatterns_13_23.d17_ChainOfResponsibility.if_else;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BusinessCheckChainConfiguration {

	@Bean
	public IBusinessCheckChain defaultBusinessCheckChain() {
		return BusinessCheckChainFactory.create();
	}

}
