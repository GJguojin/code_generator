package ${basepackage}.${childpackage}.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ${basepackage}.${childpackage}.service.I${table.className}Service;
import ${basepackage}.base.controller.BaseController;

@Controller
@RequestMapping("/${table.entityName}")
public class ${table.className}Controller extends BaseController {
	public static Log log = LogFactory.getLog(${table.className}Controller.class);
	@Autowired
	private I${table.className}Service ${table.entityName}Service;
}
