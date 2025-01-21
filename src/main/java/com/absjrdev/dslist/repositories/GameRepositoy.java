package com.absjrdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absjrdev.dslist.entities.Game;

public interface GameRepositoy extends JpaRepository<Game, Long> {

}
