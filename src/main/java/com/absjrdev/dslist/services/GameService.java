package com.absjrdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absjrdev.dslist.dto.GameMinDTO;
import com.absjrdev.dslist.repositories.GameRepositoy;

@Service
public class GameService {

	@Autowired
	private GameRepositoy gameRepositoy;

	public List<GameMinDTO> findAll() {
		var result = gameRepositoy.findAll();	
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}

}
