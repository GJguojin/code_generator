package ${basepackage}.${childpackage}.service;

import ${basepackage}.base.paginator.mybatis.PageList;
import ${basepackage}.${childpackage}.beans.${table.className};
import ${basepackage}.${childpackage}.search.${table.className}Search;

public interface I${table.className}Service{
	public Integer save${table.className}(${table.className} ${table.entityName}) throws Exception;

	public Integer edit${table.className}(${table.className} ${table.entityName});

	public Integer delete${table.className}(Long ${table.entityName}Id) throws Exception;

	public ${table.className} selectById(Long ${table.entityName}Id);

	public PageList<${table.className}> selectBySearch(${table.className}Search ${table.entityName}Search);
}
