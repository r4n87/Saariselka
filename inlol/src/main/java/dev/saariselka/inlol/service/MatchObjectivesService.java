package dev.saariselka.inlol.service;

import dev.saariselka.inlol.entity.MatchObjectivesEntity;
import dev.saariselka.inlol.repository.MatchObjectivesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchObjectivesService {
    @Autowired
    private final MatchObjectivesRepository matchObjectivesRepository;

    public List<MatchObjectivesEntity> findAll() {
        List<MatchObjectivesEntity> objectives = new ArrayList<>();
        matchObjectivesRepository.findAll().forEach(e -> objectives.add(e));

        return objectives;
    }

    public List<MatchObjectivesEntity> findByMatchidAndTeamid(String matchId, Integer teamId) {
        List<MatchObjectivesEntity> matchs = matchObjectivesRepository.findByMatchIdAndTeamId(matchId, teamId);
        return matchs;
    }
}
