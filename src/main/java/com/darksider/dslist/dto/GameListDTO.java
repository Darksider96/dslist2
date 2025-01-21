package com.darksider.dslist.dto;

import com.darksider.dslist.entities.GameList;

public class GameListDTO {
	
	
	private Long Id;
	private String name;
	
	public GameListDTO () {	
	}

	public GameListDTO(GameList entity) {
		Id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}
	
	
}
