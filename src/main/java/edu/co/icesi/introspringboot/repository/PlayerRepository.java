package edu.co.icesi.introspringboot.repository;

import edu.co.icesi.introspringboot.entity.Country;
import edu.co.icesi.introspringboot.entity.Player;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    /**
     * 1. Jugadores que han jugado históricamente en un club por nombre del club.
     * Navegación: Player -> playerClubs (List) -> club -> name
     */
    List<Player> findByPlayerClubs_Club_Name(String clubName);


    /**
     * 2. Jugadores de un país por nombre, que hayan jugado en un club por nombre.
     * Navegación: Player -> country -> name AND Player -> playerClubs -> club -> name
     */
    List<Player> findByCountry_NameAndPlayerClubs_Club_Name(String countryName, String clubName);


    /**
     *
     *1. Obtener los jugadores de una confederación específica, ordenados por fifa_score de manera descendente
     */

    List<Player> findByCountry_ConfederationOrderByFifaScoreDesc(String confederation);

}
