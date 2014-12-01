/**
 * 
 */
package bookcrossing.dao;

import java.util.List;
import bookcrossing.domain.ForbiddenBookInfo;

/**
 * 对数据库中表T_ForbiddenBook_Info进行增删改查操作的接口
 * @author 王鈃润  2014-11-27
 *
 */
public interface ForbiddenBookInfoDao {
	
	/**
	 * 添加不可漂书籍
	 * @param forbiddenBookInfo
	 */
	void addForbiddenBookInfo(ForbiddenBookInfo forbiddenBookInfo);
	
	/**
	 * 根据书籍编号删除不可漂书籍
	 * @param bookId
	 */
	void removeForbiddenBookInfo(int bookId);
	
	/**
	 * 根据书籍删除不可漂书籍
	 * @param forbiddenBookInfo
	 */
	void removeForbiddenBookInfo(ForbiddenBookInfo forbiddenBookInfo);
	
	/**
	 * 修改不可漂书籍信息
	 * @param forbiddenBookInfo
	 */
	void updateForbiddenBookInfo(ForbiddenBookInfo forbiddenBookInfo);
	
	/**查看所有不可漂书籍
	 * 
	 * @return
	 */
	List<ForbiddenBookInfo> loadall();
	
	/**
	 * 通过书名查找不可漂书籍
	 * @param bookName
	 * @return
	 */
	ForbiddenBookInfo getForbiddenBookInfoByBookName(String bookName);

}
