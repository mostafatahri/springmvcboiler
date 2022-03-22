package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.ProduitRepository;
import com.entities.Produit;

@Controller
public class MyController {

	@RequestMapping(value = "/home")
	public ModelAndView showhome() {
		ModelAndView m = new ModelAndView();
        m.addObject("products", ProduitRepository.getInstance().ShowProduits());
        m.setViewName("home.jsp");
        return m;
	}
	
	@RequestMapping(value = "/addfrm")
	public String ajouterproduit() {
		return "addproduit.jsp";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView showtest( Produit p) {
		ProduitRepository.getInstance().AddProduit(new Produit(10,p.getLibelle(),p.getPrix(),1,p.getPhotopath()));
        return new ModelAndView("forward:/home");
	}
	
}
