package bookcrossing.dao;



import java.util.List;

import bookcrossing.domain.CollectedBookRecords;
/**
 * 用户收藏书籍的记录类
 * @author 周艺伟 2014-11-25
 *
 */
public interface CollectedBookRecordsDao {

	/**
	 * 添加一条记录
	 * @param book
	 */
	void addCollectedBookRecords(CollectedBookRecords book);
	
	/**
	 * 打印出所有的记录
	 * @return
	 */
	List<CollectedBookRecords> loadall();
	
	/**
	 * 移除一条记录
	 * @param book
	 */
	void removeCollectedBookRecords(CollectedBookRecords book);
	

}
