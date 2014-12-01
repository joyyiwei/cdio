/**
 * 
 */
package bookcrossing.dao;

import java.util.List;

import bookcrossing.domain.FloatedBookRecords;

/**
 * 用于记录图书漂流历史记录的类
 * @author 李源杰 2014-11-26 
 *
 */
public interface FloatedBookRecordsDao {
	
	/**
	 *添加一条记录 
	 * @param fbr
	 */
	void addFloatedBookRecords(FloatedBookRecords fbr);
	
	/**
	 * 打印出所有历史记录
	 * @return
	 */
	List<FloatedBookRecords> loadall();
	
	/**
	 * 删除一条历史记录
	 * @param bookid
	 */
	void removeFloatedBookRecords(int bookid);
	
	/**
	 * 获得一条历史记录
	 * @param bookid
	 * @return
	 */
	FloatedBookRecords getFloatedBookRecordsByBookid(int bookid);
	
	/**
	 * 更新历史记录
	 * @param fbr
	 */
	void updateFloatedBookRecords(FloatedBookRecords fbr);	
	
}
