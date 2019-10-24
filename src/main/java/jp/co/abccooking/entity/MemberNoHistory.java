/**
 * 
 */
package jp.co.abccooking.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author sanghyun.yoo
 *
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "V_MEMBER_NO_HISTORY")
public class MemberNoHistory {

	@EmbeddedId
	private MemberId memberId;
	
	@Column(name = "MEMBER_NO")
	Integer memberNo;
	
}
