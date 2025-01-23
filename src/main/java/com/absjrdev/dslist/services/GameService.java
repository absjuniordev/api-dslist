package com.absjrdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.absjrdev.dslist.dto.GameDTO;
import com.absjrdev.dslist.dto.GameMinDTO;
import com.absjrdev.dslist.entities.Game;
import com.absjrdev.dslist.repositories.GameRepositoy;

@Service
public class GameService {

	@Autowired
	private GameRepositoy gameRepositoy;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepositoy.findById(id).get();
		return new GameDTO(result);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		var result = gameRepositoy.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
