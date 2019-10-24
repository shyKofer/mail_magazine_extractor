/**
 * 
 */
package jp.co.abccooking.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jp.co.abccooking.entity.Member;
import jp.co.abccooking.entity.MemberId;
import jp.co.abccooking.service.MailMagazineService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sanghyun.yoo
 *
 */
@Slf4j
@RestController
public class DemoController {
	
	private Logger logger = LoggerFactory.getLogger(DemoController.class);

	@Autowired
	private MailMagazineService excelService;
	
	@Autowired
	private MemberId sysId;
	
	@GetMapping("/demo/{memberSysId}")
	public Member demoControllerMain(@PathVariable("memberSysId") Integer memberSysdId) {
		System.out.println(memberSysdId);
		Member member = excelService.run(memberSysdId);
		return member;
	}
	
	@GetMapping("/demo/count")
	public long demoControllerMain() {
		System.out.println("Count");
		return excelService.getAllMemberCnt();
	}
	
	@GetMapping("/license/holders")
	public List<Member> getLicenseHolders() {
		logger.info("a");
		return excelService.getLicenseHolders();
		
		
	}

}
