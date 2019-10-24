package jp.co.abccooking.repository;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jp.co.abccooking.entity.LicenseStateHistory;

@Repository
public class LicenseStateHistoryRepositoryImpl {
	
	private final JPAQueryFactory jpaQueryFactory;
	
    public LicenseStateHistoryRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(LicenseStateHistory.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }
    
}
