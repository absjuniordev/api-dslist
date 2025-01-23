package com.absjrdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absjrdev.dslist.entities.Game;
import com.absjrdev.dslist.entities.GameList;

public interface GameListRepositoy extends JpaRepository<GameList, Long> {

}
