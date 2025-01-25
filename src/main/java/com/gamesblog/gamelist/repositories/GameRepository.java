package com.gamesblog.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesblog.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
