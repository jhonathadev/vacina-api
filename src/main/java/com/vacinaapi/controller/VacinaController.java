package com.vacinaapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import javax.validation.Valid;

import com.vacinaapi.model.Vacina;
import com.vacinaapi.repository.VacinaRepository;

@RestController
@RequestMapping("/vacinacao")
public class VacinaController {
	@Autowired
	private VacinaRepository vacinaRepository;
	
	@GetMapping
	public List<Vacina> listarVacinados() {
		return vacinaRepository.findAll();	
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vacina cadastrarVacina(@RequestBody @Valid Vacina vacina) {
		return vacinaRepository.save(vacina);
	}
	
}
