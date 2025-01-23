package com.absjrdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.absjrdev.dslist.dto.GameDTO;
import com.absjrdev.dslist.dto.GameListDTO;
import com.absjrdev.dslist.dto.GameMinDTO;
import com.absjrdev.dslist.entities.Game;
import com.absjrdev.dslist.entities.GameList;
import com.absjrdev.dslist.repositories.GameListRepositoy;
import com.absjrdev.dslist.repositories.GameRepositoy;

@Service
public class GameListService {

	@Autowired
	private GameListRepositoy gameListRepositoy;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepositoy.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}

}
