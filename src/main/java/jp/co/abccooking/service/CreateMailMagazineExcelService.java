/**
 * 
 */
package jp.co.abccooking.service;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.abccooking.entity.Member;
import jp.co.abccooking.repository.MemberRepository;
import jp.co.abccooking.util.PoiUtil;

/**
 * @author sanghyun.yoo
 *
 */
@Service
public class CreateMailMagazineExcelService {
	
	@Autowired
	private MemberRepository memberRepo;
		
	@Transactional(readOnly = true)
	public void run() {
		System.out.println("11");
		Member member = memberRepo.findByMemberSysId(111111);
		System.out.println("22");
		System.out.println(member);
		final String filePath = "C:\\task\\test.xls";
		System.out.println("aa");
		PoiUtil poi = new PoiUtil();
		Workbook wb = poi.createWorkbook();
		Sheet sheet = poi.createSheet(wb, "test");
		poi.createHeaderRow(sheet);
		poi.writeExcelFile(wb, filePath);
	} 
	
}
