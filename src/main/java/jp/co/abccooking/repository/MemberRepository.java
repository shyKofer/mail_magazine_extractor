/**
 * 
 */
package jp.co.abccooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

import jp.co.abccooking.entity.Member;


/**
 * @author sanghyun.yoo
 *
 */
@Transactional(readOnly = true)
public interface MemberRepository  extends JpaRepository<Member, Long>, JpaSpecificationExecutor<Member> {

	@Transactional(timeout = 10)
	List<Member> findByMemberSysId(Integer memberSysId);
	
	@Transactional(timeout = 10)
	List<Member> findAll();
	
	@Transactional(timeout = 10)
	long count();
	/*
	 * @Transactional(timeout = 10) List<Member> findByMemberSysId(Example<Member>);
	 */
}
