package bookcrossing.service;

import java.util.List;

import bookcrossing.domain.BookInfo;

public interface AllBook {
	
	/**搜索*/
	List<BookInfo> searchBook(String bookName);
	/**按类别搜索*/
	List<BookInfo> searchBookByCategory(String category);
	/**发起对话 currentUsername为登录的用户，username为被请求的对象*/
	void communicate(String currentUsername, String username);
	/**请求发书  即被求漂的人按下计时的按钮的响应函数*/
	void requestBook(String currentUsername, int bookid);
	/**确认收到漂书  即求书的人按下收到书的按钮 结束此次交易*/
	boolean isReceived(String currentUsername, int bookid);

    
}
