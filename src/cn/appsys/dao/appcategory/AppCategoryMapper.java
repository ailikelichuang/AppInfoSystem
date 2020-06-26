package cn.appsys.dao.appcategory;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.appsys.pojo.AppCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface AppCategoryMapper {
	
	public List<AppCategory> getAppCategoryListByParentId(@Param("parentId") Integer parentId)throws Exception;
}
