/**
 * 
 */
package jp.co.abccooking.repository;

import java.util.List;

import jp.co.abccooking.entity.LicenseStateHistory;

/**
 * @author sanghyun.yoo
 *
 */
public interface LicenseStateHistoryRepositoryCustom {
	
	List<LicenseStateHistory> findAllLicenseHolders();
	
}
