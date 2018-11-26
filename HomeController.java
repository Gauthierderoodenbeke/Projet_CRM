package fr.inti.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.inti.model.commercial.Commercial;
import fr.inti.service.commercial.ICommercialService;
import fr.inti.service.commercial.RespCommercialServiceImpl;
import fr.inti.validators.CommercialValidator;

@Controller
public class HomeController {
	@Autowired
	private ICommercialService comService;
	@Autowired
	private RespCommercialServiceImpl respComService;
	@Autowired
	private CommercialValidator commValidator;

//	@InitBinder
//	protected void initBinder(WebDataBinder binder) {
//		binder.addValidators(commValidator);
//	}

	@RequestMapping(value = { "/", "/{locale:en|fr}" })
	public String homePage(ModelMap model) {
		return "index";
	}
	@RequestMapping(value = { "/home", "/{locale:en|fr}/home" })
	public String retourAccueil(ModelMap model, HttpSession maSession) {
		maSession.setAttribute("comCurrent", null);
		maSession.invalidate();
		return "index";
	}
	

	@RequestMapping(value = { "/authentification",
			"/{locale:en|fr}/authentification" })
	public String authentification(ModelMap model) {
		model.addAttribute("commercial", new Commercial());
		return "authentification";
	}

	// @SessionAttribute("comCurrent")
	// public Commercial testconnexion(){
	// return null
	// }

	@RequestMapping(value = { "/connexion", "/{locale:en|fr}/connexion" })
	public String connexion(ModelMap model, Commercial respCom,
			HttpSession maSession) {
		List<Commercial> listeCom = comService.findByIdAndPw(respCom.getNom(),
				respCom.getPassword());
		if (listeCom.size() == 0) {
			model.addAttribute("commercial", new Commercial());
			return "authentification";
		} else {
			Commercial comCurrent = listeCom.get(0);
			if (comCurrent.getFonction().equalsIgnoreCase("Resp")) {
				maSession.setAttribute("comCurrent", comCurrent);
				System.out.println("\n\n\n"+comCurrent);
				return "bonjourResp";
			} else {
				maSession.setAttribute("comCurrent", comCurrent);
				System.out.println("\n\n\n"+comCurrent);
				return "bonjourCom";
			}

		}
	}
}
