/**
 * 
 */
package jp.co.abccooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.abccooking.entity.LicenseStateHistory;
import jp.co.abccooking.entity.MemberId;


/**
 * @author sanghyun.yoo
 *
 */
@Transactional(readOnly = true)
@Repository
public interface LicenseStateHistoryRepository extends JpaRepository<LicenseStateHistory, MemberId>, LicenseStateHistoryRepositoryCustom {
	
}
