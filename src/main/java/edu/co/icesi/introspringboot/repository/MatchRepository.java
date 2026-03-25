package edu.co.icesi.introspringboot.repository;

import edu.co.icesi.introspringboot.entity.Match;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {

    /**
     Solo locales
     */
    List<Match> findDistinctByHomeCountry_Players_PlayerClubs_Club_NameAndHomeCountry_Players_PlayerClubs_EndDateIsNull(String clubName);


    /**
     * 3.Obtén los partidos jugados en un estadio específico, donde el país local tenga al menos un jugador con un fifaScore mayor a un valor dado.
     */
    List<Match> findDistinctByStadiumAndHomeCountry_Players_FifaScoreGreaterThanEqual(String stadium, int fifaScore);
}
