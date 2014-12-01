package bookcrossing.service;

import java.util.List;

import bookcrossing.domain.BookInfo;
import bookcrossing.domain.ForbiddenBookInfo;
import bookcrossing.domain.ReadyBookInfo;

public interface PersonalBook {

	/**添加漂书*/
    boolean addBook(String currentUsername, BookInfo book);
	/**收藏书本*/
	boolean collectBook(String currentUsername, int bookid);
	/**设置为可漂*/
	boolean setBookToReady(int bookid);
	/**设置为不可漂*/
	boolean setBookToForbidden(int bookid);
	/**查看待漂*/
    List<ReadyBookInfo> displayReadyBookInfo(String username);
    /**查看不可漂*/
    List<ForbiddenBookInfo> displayForbidBookInfo(String username);
    /**查看已漂*/
    List<BookInfo> displayFloatedBookInfo(String username);
    /**查看收藏*/
    List<BookInfo> displayCollectedBookInfo(String username);
    /**查看积分*/
    int displayIntegral(String username);

   
}
