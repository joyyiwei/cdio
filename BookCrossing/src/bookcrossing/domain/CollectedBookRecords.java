/**
 * 
 */
package bookcrossing.domain;

/**
 * 收藏书籍记录
 * @author 林燕  2014-11-25
 * 
 */
public class CollectedBookRecords {

	/** 收藏人的用户名*/
	private String userName;
	
	/** 收藏的书本ID*/
	private String bookId;
	
	public CollectedBookRecords(){
		
	}
	
	public CollectedBookRecords(String userName, String bookId){
		this.userName = userName;
		this.bookId = bookId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	
	
	
}
