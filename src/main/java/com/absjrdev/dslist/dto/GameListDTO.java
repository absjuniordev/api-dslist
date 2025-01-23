package com.absjrdev.dslist.dto;

import com.absjrdev.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	 
	public GameListDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
