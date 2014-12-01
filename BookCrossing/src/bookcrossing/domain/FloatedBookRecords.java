/**
 * 
 */
package bookcrossing.domain;

/**
 * 已漂书籍历史记录
 * @author 林燕  2014-11-25
 *  
 */
public class FloatedBookRecords {
	
	/** 用户名 */
	private String userName;
	
	/** 书本ID */
	private int bookId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	
}
