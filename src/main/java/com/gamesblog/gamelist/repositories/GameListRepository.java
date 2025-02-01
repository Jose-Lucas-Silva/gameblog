package com.gamesblog.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesblog.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
