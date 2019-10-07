/**
 * 
 */
package jp.co.abccooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author sanghyun.yoo
 *
 */
@Data
@Entity
@Table(name = "m_member")
public class Member {

	@Column(name = "member_sys_id")
	private String memberSysId;
	
	@Column(name = "last_name_kanji")
	private String lastNameKanji;
	
	@Column(name = "first_name_kanji")
	private String firstNameKanji;
	
	@Column(name = "first_name_kana")
	private String firstNameKana;
	
	@Column(name = "last_name_kana")
	private String lastNameKana;
	
}
