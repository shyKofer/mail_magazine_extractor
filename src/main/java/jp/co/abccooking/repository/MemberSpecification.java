/**
 * 
 */
package jp.co.abccooking.repository;



import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import jp.co.abccooking.entity.Member;

/**
 * @author sanghyun.yoo
 *
 */
public final class MemberSpecification {
	
	private MemberSpecification() {}
	/*
	 * static Specification<Member> hasLicense(String status){ return new
	 * Specification<Member>() {
	 * 
	 * };
	 * 
	 * }
	 */
}
