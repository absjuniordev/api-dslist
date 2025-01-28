package com.absjrdev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.absjrdev.dslist.dto.GameListDTO;
import com.absjrdev.dslist.dto.GameMinDTO;
import com.absjrdev.dslist.dto.ReplacementDTO;
import com.absjrdev.dslist.services.GameListService;
import com.absjrdev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;

	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return ResponseEntity.ok(result);
	}

	@GetMapping(value = "/{lisId}/games")
	public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long lisId) {
		List<GameMinDTO> result = gameService.findByList(lisId);
		return ResponseEntity.ok(result);
	}
	
	@PostMapping(value = "/{lisId}/replacement")
	public void move(@PathVariable Long lisId , @RequestBody ReplacementDTO body) {
		gameListService.move(lisId,body.getSourceIndex(), body.getDestinationIndex());
		
	}

}
