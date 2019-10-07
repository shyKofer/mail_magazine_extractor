/**
 * 
 */
package jp.co.abccooking.constant;

/**
 * @author sanghyun.yoo
 *
 */
public enum HeaderColumn {
	
	/** */ MEMBER_NO("会員番号"),
	/** */ LAST_NAME_KANJI("姓"),
	/** */ FIRST_NAME_KANJI("名"),
	/** */ LAST_NAME_KANA("姓（カナ）"),
	/** */ FIRST_NAME_KANA("名（カナ）"),
	/** */ MAIL_MAGAZINE_DESTINATION("MAIL_MAGAZINE_DESTINATION"),
	/** */ MAIL_ADDRESS("メールアドレス"),
	/** */ BIRTHDAY("誕生日"),
	/** */ STUDIO_NAME("在籍スタジオ");
	
	private String columnName;
	
	HeaderColumn(final String columnName){
		this.columnName = columnName;
	}
	
	public String getColumnName () {
		return columnName;
	}
	
}
