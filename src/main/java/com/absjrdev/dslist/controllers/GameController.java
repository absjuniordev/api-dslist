package com.absjrdev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.absjrdev.dslist.dto.GameListDTO;
import com.absjrdev.dslist.dto.GameMinDTO;
import com.absjrdev.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/list")
public class GameController {

	@Autowired
	private GameListService gameListService;
	
	

	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return ResponseEntity.ok(result);
	}
	
	
}
