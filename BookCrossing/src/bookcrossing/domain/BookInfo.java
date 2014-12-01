/**
 * 
 */
package bookcrossing.domain;

/**
 * 所有书本信息（包括待漂书籍和不可漂书籍）
 * @author 林燕  2014-11-25
 * 
 */
public class BookInfo {
	
	/** 书本ID */
	private int  bookId;
	
	/** 书本名称 */
	private String  bookName;
	
	/** 作者 */
	private String  author;
	
	/** 书本图片的URL */
	private String  imageUrl;
	
	/** 出版社 */
	private String  publisher;
	
	/** 书本简介 */
	private String  introduction;
	
	/** 持有人 */
	private String  holder;
	
	/** 转漂次数 */
	private int  floatedNum;
	
	/** 书本类别 */
	private String category;
	
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getFloatedNum() {
		return floatedNum;
	}

	public void setFloatedNum(int floatedNum) {
		this.floatedNum = floatedNum;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
