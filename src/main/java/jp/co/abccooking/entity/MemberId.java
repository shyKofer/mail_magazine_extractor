/**
 * 
 */
package jp.co.abccooking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author sanghyun.yoo
 *
 */
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class MemberId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1144398041997364284L;
	
	@Id
	@Column(name = "MEMBER_SYS_ID")
	private Long memberSysId;
	
	public MemberId(Long memberSysId) {
		this.memberSysId = memberSysId;
	}

}
