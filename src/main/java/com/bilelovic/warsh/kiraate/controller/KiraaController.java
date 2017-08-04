package com.bilelovic.warsh.kiraate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bilelovic.warsh.kiraate.domain.Kiraa;
import com.bilelovic.warsh.kiraate.service.KiraaService;

@Controller
public class KiraaController {

	@Autowired
	private KiraaService service;

	@RequestMapping("/")
	public String redirToList() {
		Kiraa kiraa = new Kiraa();
		kiraa.setId("warsh");
		kiraa.setName("ورش عن نافع");
		kiraa.setShortName("ورش");
		service.saveOrUpdate(kiraa );
		return "redirect:/kiraas";
	}
	
	@RequestMapping({"/kiraa/list", "/kiraas"})
    public List<Kiraa> listProducts(Model model){
        //model.addAttribute("kiraate", service.listAll());
//        return "kiraa/list";
		return service.listAll();
    }
}
