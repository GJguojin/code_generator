<#assign className = table.className>   
package ${basepackage}.${childpackage}.dao;

import ${basepackage}.base.dao.BaseDao;
import ${basepackage}.base.paginator.mybatis.PageList;
import ${basepackage}.${childpackage}.beans.${className};
import ${basepackage}.${childpackage}.search.${className}Search;


public interface ${className}Dao extends BaseDao<${className}>{
	
	public PageList<${className}> selectBySearch( ${className}Search ${table.entityName}Search );

}
