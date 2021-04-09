package com.jpa.ujian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.ujian.repository.MahasiswaRepository;

@Controller
public class HomePage {

//1	@Autowired
//1	MahasiswaRepository mahasiswaRepo;
	
	
//2	@GetMapping("/")
//2	public String viewHomePage(Model model) {
//1		model.addAttribute("mahasiswa", mahasiswaRepo.findAll());
		
//2		model.addAttribute("wicak", "hello");
//2		model.addAttribute("sono", "heloooww");
		
//2		return "index";
//2	}
	
//2	@GetMapping("/wicak")
//2	public String wicak(@RequestParam String pesan, Model model) {
		
//2		model.addAttribute("pesan", pesan);
//2		return "wicak";
//2		}
	
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		

		return "index";
		
	}
	
	
}
