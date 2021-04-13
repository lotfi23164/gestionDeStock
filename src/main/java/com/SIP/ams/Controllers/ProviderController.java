package com.SIP.ams.Controllers;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.SIP.ams.entities.Provider;
@RequestMapping("provider")
@Controller
public class ProviderController {
	@RequestMapping("List")     //c le path
	public String providerList(Model m)  //method providerList
	{
		String provider="Samsung";
		ArrayList<String>providers = new ArrayList<>();
		
		providers.add("HP");
		providers.add("Toshiba");
		providers.add("Dell");
		
		ArrayList<Provider>objs = new ArrayList<>();
		objs.add(new Provider("HP","usa","hp@gmail.com"));
		objs.add(new Provider("Toshiba","Korea","toshiba@gmail.com"));
		objs.add(new Provider("Dell","usa","dell@gmail.com"));
		
		
		
		
		m.addAttribute("providers", providers);
		m.addAttribute("pr",provider);
		m.addAttribute("objs",objs);
		
		
		return "provider/listProviders"; //on place le nom de la vue
	   }

   

	@RequestMapping("add") 
	
    public String addProviderGet() 
    {
	 return "provider/addProvider";
    }
	@PostMapping("add") 
	//@ResponseBody
    public String addProviderPost() 
    {
		//ici on va ajouter un nouveau provider dans la liste
	 return "pageInsertion";
    }


}  
   