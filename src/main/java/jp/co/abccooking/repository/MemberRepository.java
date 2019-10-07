/**
 * 
 */
package jp.co.abccooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.abccooking.entity.Member;


/**
 * @author sanghyun.yoo
 *
 */
@Transactional(readOnly = true)
public interface MemberRepository  extends JpaRepository<Member, Long> {

	@Transactional(timeout = 10)
	Member findByMemberSysId(Integer carId);
	
	@Transactional(timeout = 10)
	List<Member> findAll();
	
}
