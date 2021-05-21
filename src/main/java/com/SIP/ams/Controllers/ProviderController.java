package com.SIP.ams.Controllers;


import java.util.ArrayList; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;


import com.SIP.ams.entities.Provider;
@RequestMapping("/provider")
@Controller
public class ProviderController {
	static ArrayList<Provider>objs = new ArrayList<>();   //objet globale
	static {
		objs.add(new Provider("HP","usa","hp@gmail.com"));
		objs.add(new Provider("Toshiba","Korea","toshiba@gmail.com"));
		objs.add(new Provider("Dell","usa","dell@gmail.com"));
	}
	
	@RequestMapping("/List")  
	//@ResponseBody  //c le path
	public String providerList(Model m)  //method providerList
	{
		
		ArrayList<String>providers = new ArrayList<>();
		
		
		
		
		
		
		
		
		
		m.addAttribute("providers", providers);
		
		m.addAttribute("objs",objs);
		
		
		return "provider/listProviders"; //on place le nom de la vue
	   }

   

	@GetMapping("add") 
	
    public String addProviderGet(Model m) 
    
    {
		m.addAttribute("provider", new Provider());
	 return "provider/addProvider";
    }
	@PostMapping("add") 
	//@ResponseBody
    public String addProviderPost( Provider provider )
    		
    		 
    {
		//ici on va ajouter un nouveau provider dans la liste
		System.out.println(provider);
		objs.add(provider);
	 return "redirect:List";
    }


}  
   