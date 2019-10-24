/**
 * 
 */
package jp.co.abccooking.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.abccooking.entity.Member;
import jp.co.abccooking.repository.LicenseStateHistoryRepository;
import jp.co.abccooking.repository.MemberRepository;

/**
 * @author sanghyun.yoo
 *
 */
@Service
public class MailMagazineService {
	
	private Logger logger = LoggerFactory.getLogger(MailMagazineService.class);
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired	
	private LicenseStateHistoryRepository licenseStateHistoryRepo;	
		
	@Transactional(readOnly = true)
	public Member run(Integer memberSysId) {
		System.out.println("aa"+memberSysId);
		List<Member> members = memberRepo.findByMemberSysId(memberSysId);
		/*
		 * final String filePath = "C:\\task\\test.xls"; System.out.println("aa");
		 * PoiUtil poi = new PoiUtil(); Workbook wb = poi.createWorkbook(); Sheet sheet
		 * = poi.createSheet(wb, "test"); poi.createHeaderRow(sheet);
		 * poi.writeExcelFile(wb, filePath);
		 */
		return members.get(0);
	}
	
	@Transactional(readOnly = true)
	public long getAllMemberCnt() {
		System.out.println("Count");
		return memberRepo.count();
	}

	@Transactional(readOnly = true)
	public List<Member> getLicenseHolders() {
		logger.info("getLicenseHolders");
		int i = 15953;
		// List<Member> members = memberRepo.findByMemberSysId(i);
		List<Member> members = memberRepo.findAll();
		logger.info(String.valueOf(members.size()));
		return members;
	}
	
}
