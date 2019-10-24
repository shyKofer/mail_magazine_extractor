/**
 * 
 */
package jp.co.abccooking.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author sanghyun.yoo
 *
 */

@Entity
@Table(name = "M_MEMBER")
@Where(clause="DELETE_FLG = 0")
@Getter
@Setter
@NoArgsConstructor
public class Member {
	

	@EmbeddedId
	private MemberId memberId;
		
	@Column(name = "LAST_NAME_KANJI")
	private String lastNameKanji;
	
	@Column(name = "FIRST_NAME_KANJI")
	private String firstNameKanji;
	
	@Column(name = "LAST_NAME_KANA")
	private String lastNameKana;

	@Column(name = "FIRST_NAME_KANA")
	private String firstNameKana;
	
	@Column(name = "MAIL_ADDRESS")
	private String mailAddress;
	
	@Column(name = "MOBILE_MAIL_ADDRESS")
	private String mobileMailAddress;
	
	@Column(name = "MAIL_MAGAZINE_DESTINATION")
	private String mailMagazineDestination;
	
}
