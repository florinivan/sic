package com.phimes.sic.business;

import static java.lang.System.exit;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phimes.sic.api.dto.AccessDto;
import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.MenuDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.service.IAccessService;
import com.phimes.sic.api.service.IAreaService;
import com.phimes.sic.api.service.IFilterService;
import com.phimes.sic.api.service.IFunctionService;
import com.phimes.sic.api.service.ILevelService;
import com.phimes.sic.api.service.IMenuService;
import com.phimes.sic.api.service.IRoleService;
import com.phimes.sic.business.model.Access;
import com.phimes.sic.business.model.Area;
import com.phimes.sic.business.model.Filter;
import com.phimes.sic.business.model.Function;
import com.phimes.sic.business.model.Level;
import com.phimes.sic.business.model.Menu;
import com.phimes.sic.business.model.Role;

//for jsr310 java 8 java.time.*
//@EntityScan(
//        basePackageClasses = { SpringBootConsoleApplication.class, Jsr310JpaConverters.class }
//)
//@SpringBootApplication()
public class Application {

	/*
	 * @Autowired public DataSource dataSource;
	 * 
	 * @Autowired IAccessService accSer;
	 * 
	 * @Autowired IAreaService arSer;
	 * 
	 * @Autowired IFilterService flSer;
	 * 
	 * @Autowired IFunctionService fzSer;
	 * 
	 * @Autowired ILevelService lvSer;
	 * 
	 * @Autowired IMenuService mnSer;
	 * 
	 * @Autowired IRoleService rlSer;
	 * 
	 * public void run(String... args) throws Exception {
	 * /////////////////////////////////////////////////////////////////////////////
	 * //////////////////////////////////////////////////////// List<AccessDto>
	 * listAccessDto = accSer.getAccessDto("fun_code_test");
	 * 
	 * for (AccessDto x : listAccessDto) { System.out.println(x.getDescription());
	 * System.out.println(x.getIdAccess());
	 * 
	 * }
	 * /////////////////////////////////////////////////////////////////////////////
	 * ////////////////////////////////////////////////////////// // test Area
	 * AreaDto AreaDtotestArea = arSer.getAreaDto((long) 1, "app_code_test",
	 * "ar_code_test"); Area areaTest = new Area();
	 * System.out.println(areaTest.getCode() + " " + areaTest.getDescription());
	 * /////////////////////////////////////////////////////////////////////////////
	 * //////////////////////////////////////////////////////// // test Filter
	 * List<FilterDto> listFilterDto; Filter flTest = new Filter(); listFilterDto =
	 * flSer.getFilterListDto("ar_code_test", "lev_code_test");
	 * 
	 * List<LevelDto> listLevelDto = new ArrayList(); for (FilterDto x :
	 * listFilterDto) { System.out.println(x.getCode() + " " + x.getDescription() +
	 * " " + x.getLongDescription()); listLevelDto.add(x.getLevel()); for (LevelDto
	 * y : listLevelDto) { System.out.println(y.getCode() + " " + y.getDescription()
	 * + " " + y.getLevelOrder()); } }
	 * /////////////////////////////////////////////////////////////////////////////
	 * /////////////////////////////////////////////////////////////////// // test
	 * Function List<FunctionDto> listFunctionDto; Function fzTest = new Function();
	 * listFunctionDto = fzSer.getFunctionListDto("rl_code_test", "app_code_test");
	 * 
	 * for (FunctionDto x : listFunctionDto) { System.out.println(x.getCode() + " "
	 * + x.getDescription());
	 * 
	 * }
	 * /////////////////////////////////////////////////////////////////////////////
	 * /////////////////////////////////////////////////////////////////// // test
	 * Level LevelDto lvTest = lvSer.getLevelDto("app_code_test", "fil_code_test");
	 * Level levTest = new Level(); levTest.getCode();
	 * 
	 * System.out.println(levTest.getCode() + " " + levTest.getDescription() + " " +
	 * levTest.getLevel_Order());
	 * 
	 * /////////////////////////////////////////////////////////////////////////////
	 * //////////////////////////////////////////////////////// // test Menu
	 * List<MenuDto> listMenuDto; Menu menuTest = new Menu(); listMenuDto =
	 * mnSer.getMenuDto("rl_code_test", "app_code_test", (long) 1);
	 * 
	 * for (MenuDto x : listMenuDto) { System.out.println(x.getCode() + " " +
	 * x.getDescription() + " " + x.getUrl() + " " + " " + x.getMenuOrder() + " " +
	 * " " + x.getIdSubMenu());
	 * 
	 * }
	 * 
	 * /////////////////////////////////////////////////////////////////////////////
	 * //////////////////////////////////////////////////////// // test Role
	 * List<RoleDto> listRoleDto; Role roleTest = new Role(); listRoleDto =
	 * rlSer.getRoleListDto("app_code_test", "us_username_test", 'c');
	 * 
	 * for (RoleDto x : listRoleDto) { System.out.println(x.getCode() + " " +
	 * x.getDescription()); }
	 * 
	 * 
	 * System.out.println("Done!");
	 * 
	 * exit(0);
	 * 
	 * }
	 */

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}