/**
 * 
 */
package bookcrossing.dao;

import java.util.List;

import bookcrossing.domain.ReadyBookInfo;

/**
 * 对数据库中T_ReadyBook_Info表的CRUD操作的接口
 * @author 林燕  2014-11-27
 *
 */
public interface ReadyBookInfoDao {
	
	/**
	 * 增加待漂书籍
	 * @param rbi 待漂书籍信息
	 */
	void addReadyBookInfo(ReadyBookInfo rbi);
	
	/**
	 * 根据书本ID删除待漂书籍信息
	 * @param bookId 书本ID
	 */
	void removeReadyBookInfo(int bookId);
	
	/**
	 * 修改除了书本ID以外的待漂书籍信息
	 * @param rbi 修改后的用户信息
	 */
	void updateReadyBookInfo(ReadyBookInfo rbi);
	
	/**
	 * 根据书本名称获得书本信息
	 * @param bookName 书本名称
	 * @return
	 */
	ReadyBookInfo getReadyBookInfoByBookName(String bookName);
	
	/**
	 * 得到所有待漂书籍的信息
	 * @return
	 */
	List<ReadyBookInfo> loadall();
	

}
