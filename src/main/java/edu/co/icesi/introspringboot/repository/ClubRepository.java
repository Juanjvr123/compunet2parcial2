package edu.co.icesi.introspringboot.repository;

import edu.co.icesi.introspringboot.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer> {

    /**

     */
    List<Club> findDistinctByPlayerClubs_Player_Country_HomeMatches_IdOrPlayerClubs_Player_Country_AwayMatches_Id(Integer matchId, Integer matchIdAgain);

    /**
     * 2. Obtener los clubes donde actualmente juega un jugador dado un nombre, ignorando las mayúsculas.
     */
    List<Club> findDistinctByPlayerClubs_Player_NameIgnoreCase(String playerName);

    /**
     * 4. Obtener los clubes donde sus jugadores jueguen entre dos fechas específicas y un estadio específico.
     */



}

