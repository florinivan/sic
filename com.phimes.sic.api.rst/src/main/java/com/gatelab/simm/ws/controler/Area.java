package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.service.IAreaService;

	@Controller
	@RequestMapping(value="auth/area")
	public class Area {
		
		@Autowired
		private IAreaService areaService;
		
		@GetMapping(value="/area") 
		@ResponseBody
		public AreaDto area(@RequestParam(name="username", required=true)String username,
							@RequestParam(name="codeApp",required=true)String codeApp,
							@RequestParam(name="codeAr",required=true)String codeAr) {
			return areaService.getAreaDto(username, codeApp, codeAr);
		}
		
		@GetMapping(value="/areas") 
		@ResponseBody
		public List<AreaDto> areas (@RequestParam(name="username", required=true)String username,
									@RequestParam(name="codeApp",required=true)String codeApp){
			return areaService.getAreaListDto(username, codeApp);
		}
}
