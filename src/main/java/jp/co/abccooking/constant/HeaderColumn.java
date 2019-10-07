/**
 * 
 */
package jp.co.abccooking.constant;

/**
 * @author sanghyun.yoo
 *
 */
public enum HeaderColumn {
	
	/** */ MEMBER_NO("����ԍ�"),
	/** */ LAST_NAME_KANJI("��"),
	/** */ FIRST_NAME_KANJI("��"),
	/** */ LAST_NAME_KANA("���i�J�i�j"),
	/** */ FIRST_NAME_KANA("���i�J�i�j"),
	/** */ MAIL_MAGAZINE_DESTINATION("MAIL_MAGAZINE_DESTINATION"),
	/** */ MAIL_ADDRESS("���[���A�h���X"),
	/** */ BIRTHDAY("�a����"),
	/** */ STUDIO_NAME("�ݐЃX�^�W�I");
	
	private String columnName;
	
	HeaderColumn(final String columnName){
		this.columnName = columnName;
	}
	
	public String getColumnName () {
		return columnName;
	}
	
}
