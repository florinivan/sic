package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.service.ILevelService;

	
		@Controller
		@RequestMapping(value="auth/level")
		public class Level {
		
		@Autowired	
		private ILevelService levelService;	
		
		@GetMapping(value="/level")			//qui /level al sisngolare, in ProfileAccessor /levels
		@ResponseBody
		public LevelDto level(@RequestParam(name="codeApp", required=true)String codeApp,
							  @RequestParam(name="codeFl", required=true)String codeFl) {
			return levelService.getLevelDto(codeApp, codeFl);
		}
		//getLevelListDto è chiamato in ProfileAccessor
}
