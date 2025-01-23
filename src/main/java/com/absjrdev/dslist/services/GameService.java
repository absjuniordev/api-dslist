package com.absjrdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.absjrdev.dslist.dto.GameDTO;
import com.absjrdev.dslist.dto.GameMinDTO;
import com.absjrdev.dslist.entities.Game;
import com.absjrdev.dslist.projections.GameMinProjection;
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
		List <Game> result = gameRepositoy.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long lisId) {
		List<GameMinProjection> result = gameRepositoy.searchByList(lisId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
