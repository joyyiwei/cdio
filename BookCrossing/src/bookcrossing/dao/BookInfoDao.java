/**
 * 
 */
package bookcrossing.dao;

import java.util.List;
import bookcrossing.domain.BookInfo;

/**
 * 对数据库中T_Book_Info表的CRUD操作的接口
 * @author 林佳怡  2014-11-26
 *
 */
public interface BookInfoDao {
	
	/**
	 * 增加书本信息
	 * @param book  书本
	 */
	void addBook(BookInfo book);
	/**
	 * 得到所有的书本信息
	 * @return 所有书的数组
	 */
	List<BookInfo> loadall();
	/**
	 * 通过id删除图书
	 * @param bookid  书本的id
	 */
	void removeBook(Integer bookid);
	/**
	 * 通过书的id查询到相应的书本
	 * @param bookid  书本id
	 * @return  查询到的书本信息
	 */
	BookInfo getBookByNo(Integer bookid);
	/**
	 * 通过书本名字获得书本列表
	 * @param bookname  书名
	 * @return  查询的书本列表
	 */
	List<BookInfo> getBookByName(String bookname);
	/**
	 * 修改某本书的全部信息
	 * @param book 修改后的书
	 */
	void updateBook(BookInfo book);
	/**
	 * 修改漂书持有者
	 * @param bookid  书本id
	 * @param holder  持有者姓名
	 */
	void updateBookHolder(Integer bookid,String holder);
	/**
	 * 增加漂书转漂次数
	 * @param bookid  书本id
	 */
	void AddBookfloatedNum(Integer bookid);
}
