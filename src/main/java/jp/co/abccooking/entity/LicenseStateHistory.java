package jp.co.abccooking.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "LICENSE_STATE_HISTORY")
@Where(clause="DELETE_FLG = 0")
@Getter
@Setter
public class LicenseStateHistory {

	@EmbeddedId
	@ManyToOne(fetch = FetchType.LAZY)
	private MemberId memberId;
	
	@Column(name = "STATUS")
	private String status; 
	
}
