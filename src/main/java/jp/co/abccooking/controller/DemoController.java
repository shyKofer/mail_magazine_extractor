/**
 * 
 */
package jp.co.abccooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.abccooking.service.CreateMailMagazineExcelService;

/**
 * @author sanghyun.yoo
 *
 */
@RestController
public class DemoController {

	@Autowired
	private CreateMailMagazineExcelService excelService;
	
	@GetMapping("/demo")
	public String demoControllerMain() {
		excelService.run();
		return "èoóÕäÆóπ";
	}

}
