package br.com.bwn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bwn.repository.ItemRepositorio;

@RestController
public class CadastroDeItem {

	private ItemRepositorio repositorio;
	
	@RequestMapping("/")
	String index() {
		return "Hello World";
	}
	
	CadastroDeItem(ItemRepositorio itemRepositorio) {
	       this.repositorio = itemRepositorio;
	}
	
	@GetMapping
	public List findAll(){
	   return repositorio.findAll();
	}
}
