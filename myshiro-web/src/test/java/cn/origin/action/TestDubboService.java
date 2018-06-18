package cn.origin.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.origin.service.IMemberAuthorizationService;
import cn.origin.service.IMemberService;

@ContextConfiguration(locations = { "classpath:spring/spring-base.xml","classpath:spring/spring-dubbo-consumer.xml"  })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDubboService {
	@Reference
	private IMemberService memberService ;
	@Reference
	private IMemberAuthorizationService memberAuthorService ;
	@Test
	public void test() {
		System.out.println(this.memberService.login("admin", "hello"));
		System.out.println(this.memberAuthorService.listByMember("admin"));
	}
	
}
