package ${basepackage}.${childpackage}.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basepackage}.${childpackage}.dao.${table.className}Dao;
import ${basepackage}.${childpackage}.beans.${table.className};
import ${basepackage}.${childpackage}.service.I${table.className}Service;
import ${basepackage}.${childpackage}.service.impl.${table.className}ServiceImpl;
import ${basepackage}.base.paginator.mybatis.PageList;
import ${basepackage}.${childpackage}.search.${table.className}Search;

@Service
public class ${table.className}ServiceImpl implements I${table.className}Service {
	public static Log log = LogFactory.getLog(${table.className}ServiceImpl.class);
	@Autowired
	private ${table.className}Dao ${table.entityName}Dao;

	@Override
	public Integer save${table.className}(${table.className} ${table.entityName}) throws Exception {
		return ${table.entityName}Dao.insert(${table.entityName});
	}

	@Override
	public Integer edit${table.className}(${table.className} ${table.entityName}) {
		return ${table.entityName}Dao.update(${table.entityName});
	}

	@Override
	public Integer delete${table.className}(Long ${table.entityName}Id) throws Exception {
		return ${table.entityName}Dao.delete(${table.entityName}Id);
	}

	@Override
	public ${table.className} selectById(Long ${table.entityName}Id) {
		return ${table.entityName}Dao.selectById(${table.entityName}Id);
	}

	@Override
	public PageList<${table.className}> selectBySearch(${table.className}Search ${table.entityName}Search) {
		return ${table.entityName}Dao.selectBySearch(${table.entityName}Search);
	}
}