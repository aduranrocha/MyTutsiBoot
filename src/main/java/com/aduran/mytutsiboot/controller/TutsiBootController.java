package com.aduran.mytutsiboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aduran.mytutsiboot.model.TutsiBoot;
import com.aduran.mytutsiboot.service.TutsiBootService;

@RestController
@RequestMapping("/tutsiBoots")
public class TutsiBootController {
	
	@Autowired
	private TutsiBootService service;
	
	@PostMapping()
	public TutsiBoot createTutsiBoot(@RequestBody TutsiBoot myTutsiBoot) {
		return service.createTutsiBoot(myTutsiBoot);
	}
	
	@GetMapping
	public List<TutsiBoot> getAll(){
		return service.getAllBoot();
	}
	
	@GetMapping({"/{idBoot}"})
	public TutsiBoot getBootById(@PathVariable("idBoot") String idBoot) {
		return service.getById(idBoot);
	}
	
	@PutMapping
	public TutsiBoot updateTutsiBoot(@RequestBody TutsiBoot myTutsiBoot) {
		return service.updateTutsiBoot(myTutsiBoot);
	}
	
	@DeleteMapping("/{idBoot}")
	public ResponseEntity<Void> deleteTutsiBoot(@PathVariable("idBoot") String idBoot) {
		service.deleteTutsiBoot(idBoot);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
