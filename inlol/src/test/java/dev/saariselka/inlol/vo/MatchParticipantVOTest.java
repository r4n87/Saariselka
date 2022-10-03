package dev.saariselka.inlol.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.assertj.core.api.Assertions.assertThat;
public class MatchParticipantVOTest {
    @Test
    @DisplayName("Lombok Get Function")
    public void testLombokGetFunction() {
        //given
        String puuid = "A1B2C3D4";
        String dataVersion = "2";
        String matchId = "AAAAAA";
        int participantId = 5;

        int assists = 6;
        int baronKills = 3;
        int bountyLevel = 6;
        int champExperience = 6;
        int champLevel = 10;
        int championId = 32;
        String championName = "Ezreal";
        String championNameKR = "이즈리얼";
        String championImg = "Ezreal.png";
        int championTransform = 0;
        int consumablesPurchased = 0;
        int damageDealtToBuildings = 562;
        int damageDealtToObjectives = 652;
        int damageDealtToTurrets = 424;
        int damageSelfMitigated = 456;
        int deaths = 3;
        int detectorWardsPlaced = 10;
        int doubleKills = 3;
        int dragonKills = 2;
        boolean firstBloodAssist = false;
        boolean firstBloodKill = true;
        boolean firstTowerAssist = false;
        boolean firstTowerKill = true;
        boolean gameEndedInEarlySurrender = false;
        boolean gameEndedInSurrender = true;
        int goldEarned = 5240;
        int goldSpent = 4270;
        String individualPosition = "BOTTOM";
        int inhibitorKills = 3;
        int inhibitorTakedowns = 6;
        int inhibitorsLost = 2;
        int item0 = 1;
        int item1 = 2;
        int item2 = 3;
        int item3 = 4;
        int item4 = 5;
        int item5 = 6;
        int item6 = 7;
        int itemsPurchased = 50;
        int killingSprees = 60;
        int kills = 7;
        String lane = "BOTTOM";
        int largestCriticalStrike = 5;
        int largestKillingSpree = 6;
        int largestMultiKill = 7;
        int longestTimeSpentLiving = 8;
        int magicDamageDealt = 9200;
        int magicDamageDealtToChampions = 6300;
        int magicDamageTaken = 5200;
        int neutralMinionsKilled = 52;
        int nexusKills = 3;
        int nexusTakedowns = 5;
        int nexusLost = 3;
        int objectivesStolen = 2;
        int objectivesStolenAssists = 1;
        int pentaKills = 1;
        int physicalDamageDealt = 12691;
        int physicalDamageDealtToChampions = 11591;
        int physicalDamageTaken = 6000;
        int profileIcon = 32;
        int quadraKills = 1;
        String riotIdName = "HIROO";
        String riotIdTagline = "HIROO321";
        String role = "HIHI";
        int sightWardsBoughtInGame = 5;
        int spell1Casts = 1;
        int spell2Casts = 2;
        int spell3Casts = 3;
        int spell4Casts = 4;
        int summoner1Casts = 5;
        String summoner1Id = "6";
        int summoner2Casts = 7;
        String summoner2Id = "8";
        String summonerId = "HelloSummoner";
        int summonerLevel = 10;
        String summonerName = "EZREALISGOD";
        boolean teamEarlySurrendered = false;
        int teamId = 100;
        String teamPosition = "RED";
        int timeCCingOthers = 5;
        int timePlayed = 10;
        int totalDamageDealt = 6000;
        int totalDamageDealtToChampions = 7000;
        int totalDamageShieldedOnTeammates = 8000;
        int totalDamageTaken = 9000;
        int totalHeal = 500;
        int totalHealsOnTeammates = 600;
        int totalMinionsKilled = 230;
        int totalTimeCCDealt = 100;
        int totalTimeSpentDead = 500;
        int totalUnitsHealed = 600;
        int tripleKills = 0;
        int trueDamageDealt = 18000;
        int trueDamageDealtToChampions = 17000;
        int trueDamageTaken = 16000;
        int turretKills = 3;
        int turretTakedowns = 60;
        int turretsLost = 2;
        int unrealKills = 1234;
        int visionScore = 10;
        int visionWardsBoughtInGame = 15;
        int wardsKilled = 6;
        int wardsPlaced = 1;
        boolean win = true;
        Timestamp rrt = new Timestamp(System.currentTimeMillis());

        //when
        MatchParticipantVO matchParticipantVO
                = new MatchParticipantVO(
                        puuid,
                        dataVersion,
                        matchId,
                        participantId,
                        assists,
                        baronKills,
                        bountyLevel,
                        champExperience,
                        champLevel,
                        championId,
                        championName,
                        championNameKR,
                        championImg,
                        championTransform,
                        consumablesPurchased,
                        damageDealtToBuildings,
                        damageDealtToObjectives,
                        damageDealtToTurrets,
                        damageSelfMitigated,
                        deaths,
                        detectorWardsPlaced,
                        doubleKills,
                        dragonKills,
                        firstBloodAssist,
                        firstBloodKill,
                        firstTowerAssist,
                        firstTowerKill,
                        gameEndedInEarlySurrender,
                        gameEndedInSurrender,
                        goldEarned,
                        goldSpent,
                        individualPosition,
                        inhibitorKills,
                        inhibitorTakedowns,
                        inhibitorsLost,
                        item0,
                        item1,
                        item2,
                        item3,
                        item4,
                        item5,
                        item6,
                        itemsPurchased,
                        killingSprees,
                        kills,
                        lane,
                        largestCriticalStrike,
                        largestKillingSpree,
                        largestMultiKill,
                        longestTimeSpentLiving,
                        magicDamageDealt,
                        magicDamageDealtToChampions,
                        magicDamageTaken,
                        neutralMinionsKilled,
                        nexusKills,
                        nexusTakedowns,
                        nexusLost,
                        objectivesStolen,
                        objectivesStolenAssists,
                        pentaKills,
                        physicalDamageDealt,
                        physicalDamageDealtToChampions,
                        physicalDamageTaken,
                        profileIcon,
                        quadraKills,
                        riotIdName,
                        riotIdTagline,
                        role,
                        sightWardsBoughtInGame,
                        spell1Casts,
                        spell2Casts,
                        spell3Casts,
                        spell4Casts,
                        summoner1Casts,
                        summoner1Id,
                        summoner2Casts,
                        summoner2Id,
                        summonerId,
                        summonerLevel,
                        summonerName,
                        teamEarlySurrendered,
                        teamId,
                        teamPosition,
                        timeCCingOthers,
                        timePlayed,
                        totalDamageDealt,
                        totalDamageDealtToChampions,
                        totalDamageShieldedOnTeammates,
                        totalDamageTaken,
                        totalHeal,
                        totalHealsOnTeammates,
                        totalMinionsKilled,
                        totalTimeCCDealt,
                        totalTimeSpentDead,
                        totalUnitsHealed,
                        tripleKills,
                        trueDamageDealt,
                        trueDamageDealtToChampions,
                        trueDamageTaken,
                        turretKills,
                        turretTakedowns,
                        turretsLost,
                        unrealKills,
                        visionScore,
                        visionWardsBoughtInGame,
                        wardsKilled,
                        wardsPlaced,
                        win,
                        rrt
                );

        //then
        assertThat(matchParticipantVO.getPuuid()).isEqualTo(puuid);
        assertThat(matchParticipantVO.getDataVersion()).isEqualTo(dataVersion);
        assertThat(matchParticipantVO.getMatchId()).isEqualTo(matchId);
        assertThat(matchParticipantVO.getParticipantId()).isEqualTo(participantId);
        assertThat(matchParticipantVO.getAssists()).isEqualTo(assists);
        assertThat(matchParticipantVO.getBaronKills()).isEqualTo(baronKills);
        assertThat(matchParticipantVO.getBountyLevel()).isEqualTo(bountyLevel);
        assertThat(matchParticipantVO.getChampExperience()).isEqualTo(champExperience);
        assertThat(matchParticipantVO.getChampLevel()).isEqualTo(champLevel);
        assertThat(matchParticipantVO.getChampionId()).isEqualTo(championId);
        assertThat(matchParticipantVO.getChampionName()).isEqualTo(championName);
        assertThat(matchParticipantVO.getChampionNameKR()).isEqualTo(championNameKR);
        assertThat(matchParticipantVO.getChampionImg()).isEqualTo(championImg);
        assertThat(matchParticipantVO.getChampionTransform()).isEqualTo(championTransform);
        assertThat(matchParticipantVO.getConsumablesPurchased()).isEqualTo(consumablesPurchased);
        assertThat(matchParticipantVO.getDamageDealtToBuildings()).isEqualTo(damageDealtToBuildings);
        assertThat(matchParticipantVO.getDamageDealtToObjectives()).isEqualTo(damageDealtToObjectives);
        assertThat(matchParticipantVO.getDamageSelfMitigated()).isEqualTo(damageSelfMitigated);
        assertThat(matchParticipantVO.getDeaths()).isEqualTo(deaths);
        assertThat(matchParticipantVO.getDetectorWardsPlaced()).isEqualTo(detectorWardsPlaced);
        assertThat(matchParticipantVO.getDoubleKills()).isEqualTo(doubleKills);
        assertThat(matchParticipantVO.getDragonKills()).isEqualTo(dragonKills);
        assertThat(matchParticipantVO.isFirstBloodAssist()).isEqualTo(firstBloodAssist);
        assertThat(matchParticipantVO.isFirstBloodKill()).isEqualTo(firstBloodKill);
        assertThat(matchParticipantVO.isFirstTowerAssist()).isEqualTo(firstTowerAssist);
        assertThat(matchParticipantVO.isFirstTowerKill()).isEqualTo(firstTowerKill);
        assertThat(matchParticipantVO.isGameEndedInEarlySurrender()).isEqualTo(gameEndedInEarlySurrender);
        assertThat(matchParticipantVO.isGameEndedInSurrender()).isEqualTo(gameEndedInSurrender);
        assertThat(matchParticipantVO.getGoldEarned()).isEqualTo(goldEarned);
        assertThat(matchParticipantVO.getGoldSpent()).isEqualTo(goldSpent);
        assertThat(matchParticipantVO.getIndividualPosition()).isEqualTo(individualPosition);
        assertThat(matchParticipantVO.getInhibitorKills()).isEqualTo(inhibitorKills);
        assertThat(matchParticipantVO.getInhibitorTakedowns()).isEqualTo(inhibitorTakedowns);
        assertThat(matchParticipantVO.getInhibitorsLost()).isEqualTo(inhibitorsLost);
        assertThat(matchParticipantVO.getItem0()).isEqualTo(item0);
        assertThat(matchParticipantVO.getItem1()).isEqualTo(item1);
        assertThat(matchParticipantVO.getItem2()).isEqualTo(item2);
        assertThat(matchParticipantVO.getItem3()).isEqualTo(item3);
        assertThat(matchParticipantVO.getItem4()).isEqualTo(item4);
        assertThat(matchParticipantVO.getItem5()).isEqualTo(item5);
        assertThat(matchParticipantVO.getItem6()).isEqualTo(item6);
        assertThat(matchParticipantVO.getItemsPurchased()).isEqualTo(itemsPurchased);
        assertThat(matchParticipantVO.getKillingSprees()).isEqualTo(killingSprees);
        assertThat(matchParticipantVO.getKills()).isEqualTo(kills);
        assertThat(matchParticipantVO.getLane()).isEqualTo(lane);
        assertThat(matchParticipantVO.getLargestCriticalStrike()).isEqualTo(largestCriticalStrike);
        assertThat(matchParticipantVO.getLargestKillingSpree()).isEqualTo(largestKillingSpree);
        assertThat(matchParticipantVO.getLongestTimeSpentLiving()).isEqualTo(longestTimeSpentLiving);
        assertThat(matchParticipantVO.getMagicDamageDealt()).isEqualTo(magicDamageDealt);
        assertThat(matchParticipantVO.getMagicDamageDealtToChampions()).isEqualTo(magicDamageDealtToChampions);
        assertThat(matchParticipantVO.getMagicDamageTaken()).isEqualTo(magicDamageTaken);
        assertThat(matchParticipantVO.getNeutralMinionsKilled()).isEqualTo(neutralMinionsKilled);
        assertThat(matchParticipantVO.getNexusKills()).isEqualTo(nexusKills);
        assertThat(matchParticipantVO.getNexusLost()).isEqualTo(nexusLost);
        assertThat(matchParticipantVO.getNexusTakedowns()).isEqualTo(nexusTakedowns);
        assertThat(matchParticipantVO.getObjectivesStolen()).isEqualTo(objectivesStolen);
        assertThat(matchParticipantVO.getObjectivesStolenAssists()).isEqualTo(objectivesStolenAssists);
        assertThat(matchParticipantVO.getPentaKills()).isEqualTo(pentaKills);
        assertThat(matchParticipantVO.getPhysicalDamageDealt()).isEqualTo(physicalDamageDealt);
        assertThat(matchParticipantVO.getPhysicalDamageDealtToChampions()).isEqualTo(physicalDamageDealtToChampions);
        assertThat(matchParticipantVO.getPhysicalDamageTaken()).isEqualTo(physicalDamageTaken);
        assertThat(matchParticipantVO.getProfileIcon()).isEqualTo(profileIcon);
        assertThat(matchParticipantVO.getQuadraKills()).isEqualTo(quadraKills);
        assertThat(matchParticipantVO.getRiotIdName()).isEqualTo(riotIdName);
        assertThat(matchParticipantVO.getRiotIdTagline()).isEqualTo(riotIdTagline);
        assertThat(matchParticipantVO.getRole()).isEqualTo(role);
        assertThat(matchParticipantVO.getSightWardsBoughtInGame()).isEqualTo(sightWardsBoughtInGame);
        assertThat(matchParticipantVO.getSpell1Casts()).isEqualTo(spell1Casts);
        assertThat(matchParticipantVO.getSpell2Casts()).isEqualTo(spell2Casts);
        assertThat(matchParticipantVO.getSpell3Casts()).isEqualTo(spell3Casts);
        assertThat(matchParticipantVO.getSpell4Casts()).isEqualTo(spell4Casts);
        assertThat(matchParticipantVO.getSummoner1Casts()).isEqualTo(summoner1Casts);
        assertThat(matchParticipantVO.getSummoner1Id()).isEqualTo(summoner1Id);
        assertThat(matchParticipantVO.getSummoner2Casts()).isEqualTo(summoner2Casts);
        assertThat(matchParticipantVO.getSummoner2Id()).isEqualTo(summoner2Id);
        assertThat(matchParticipantVO.getSummonerId()).isEqualTo(summonerId);
        assertThat(matchParticipantVO.getSummonerLevel()).isEqualTo(summonerLevel);
        assertThat(matchParticipantVO.getSummonerName()).isEqualTo(summonerName);
        assertThat(matchParticipantVO.isTeamEarlySurrendered()).isEqualTo(teamEarlySurrendered);
        assertThat(matchParticipantVO.getTeamId()).isEqualTo(teamId);
        assertThat(matchParticipantVO.getTeamPosition()).isEqualTo(teamPosition);
        assertThat(matchParticipantVO.getTimeCCingOthers()).isEqualTo(timeCCingOthers);
        assertThat(matchParticipantVO.getTimePlayed()).isEqualTo(timePlayed);
        assertThat(matchParticipantVO.getTotalDamageDealt()).isEqualTo(totalDamageDealt);
        assertThat(matchParticipantVO.getTotalDamageDealtToChampions()).isEqualTo(totalDamageDealtToChampions);
        assertThat(matchParticipantVO.getTotalDamageTaken()).isEqualTo(totalDamageTaken);
        assertThat(matchParticipantVO.getTotalHeal()).isEqualTo(totalHeal);
        assertThat(matchParticipantVO.getTotalHealsOnTeammates()).isEqualTo(totalHealsOnTeammates);
        assertThat(matchParticipantVO.getTotalMinionsKilled()).isEqualTo(totalMinionsKilled);
        assertThat(matchParticipantVO.getTotalTimeCCDealt()).isEqualTo(totalTimeCCDealt);
        assertThat(matchParticipantVO.getTotalTimeSpentDead()).isEqualTo(totalTimeSpentDead);
        assertThat(matchParticipantVO.getTotalUnitsHealed()).isEqualTo(totalUnitsHealed);
        assertThat(matchParticipantVO.getTripleKills()).isEqualTo(tripleKills);
        assertThat(matchParticipantVO.getTrueDamageDealt()).isEqualTo(trueDamageDealt);
        assertThat(matchParticipantVO.getTrueDamageDealtToChampions()).isEqualTo(trueDamageDealtToChampions);
        assertThat(matchParticipantVO.getTrueDamageTaken()).isEqualTo(trueDamageTaken);
        assertThat(matchParticipantVO.getTurretKills()).isEqualTo(turretKills);
        assertThat(matchParticipantVO.getTurretTakedowns()).isEqualTo(turretTakedowns);
        assertThat(matchParticipantVO.getTurretsLost()).isEqualTo(turretsLost);
        assertThat(matchParticipantVO.getUnrealKills()).isEqualTo(unrealKills);
        assertThat(matchParticipantVO.getVisionScore()).isEqualTo(visionScore);
        assertThat(matchParticipantVO.getVisionWardsBoughtInGame()).isEqualTo(visionWardsBoughtInGame);
        assertThat(matchParticipantVO.getWardsKilled()).isEqualTo(wardsKilled);
        assertThat(matchParticipantVO.getWardsPlaced()).isEqualTo(wardsPlaced);
        assertThat(matchParticipantVO.isWin()).isEqualTo(win);
        assertThat(matchParticipantVO.getRrt()).isEqualTo(rrt);
    }

    @Test
    @DisplayName("Lombok Set Function")
    public void testLombokSetFunction() {
        //given
        MatchParticipantVO matchParticipantVO = createMatchParticipantVOForSetTest();
        String puuid = "A1B2C3D4";
        String dataVersion = "2";
        String matchId = "AAAAAA";
        int participantId = 5;

        int assists = 6;
        int baronKills = 3;
        int bountyLevel = 6;
        int champExperience = 6;
        int champLevel = 10;
        int championId = 32;
        String championName = "Ezreal";
        String championNameKR = "이즈리얼";
        String championImg = "Ezreal.png";
        int championTransform = 0;
        int consumablesPurchased = 0;
        int damageDealtToBuildings = 562;
        int damageDealtToObjectives = 652;
        int damageDealtToTurrets = 424;
        int damageSelfMitigated = 456;
        int deaths = 3;
        int detectorWardsPlaced = 10;
        int doubleKills = 3;
        int dragonKills = 2;
        boolean firstBloodAssist = false;
        boolean firstBloodKill = true;
        boolean firstTowerAssist = false;
        boolean firstTowerKill = true;
        boolean gameEndedInEarlySurrender = false;
        boolean gameEndedInSurrender = true;
        int goldEarned = 5240;
        int goldSpent = 4270;
        String individualPosition = "BOTTOM";
        int inhibitorKills = 3;
        int inhibitorTakedowns = 6;
        int inhibitorsLost = 2;
        int item0 = 1;
        int item1 = 2;
        int item2 = 3;
        int item3 = 4;
        int item4 = 5;
        int item5 = 6;
        int item6 = 7;
        int itemsPurchased = 50;
        int killingSprees = 60;
        int kills = 7;
        String lane = "BOTTOM";
        int largestCriticalStrike = 5;
        int largestKillingSpree = 6;
        int largestMultiKill = 7;
        int longestTimeSpentLiving = 8;
        int magicDamageDealt = 9200;
        int magicDamageDealtToChampions = 6300;
        int magicDamageTaken = 5200;
        int neutralMinionsKilled = 52;
        int nexusKills = 3;
        int nexusTakedowns = 5;
        int nexusLost = 3;
        int objectivesStolen = 2;
        int objectivesStolenAssists = 1;
        int pentaKills = 1;
        int physicalDamageDealt = 12691;
        int physicalDamageDealtToChampions = 11591;
        int physicalDamageTaken = 6000;
        int profileIcon = 32;
        int quadraKills = 1;
        String riotIdName = "HIROO";
        String riotIdTagline = "HIROO321";
        String role = "HIHI";
        int sightWardsBoughtInGame = 5;
        int spell1Casts = 1;
        int spell2Casts = 2;
        int spell3Casts = 3;
        int spell4Casts = 4;
        int summoner1Casts = 5;
        String summoner1Id = "6";
        int summoner2Casts = 7;
        String summoner2Id = "8";
        String summonerId = "HelloSummoner";
        int summonerLevel = 10;
        String summonerName = "EZREALISGOD";
        boolean teamEarlySurrendered = false;
        int teamId = 100;
        String teamPosition = "RED";
        int timeCCingOthers = 5;
        int timePlayed = 10;
        int totalDamageDealt = 6000;
        int totalDamageDealtToChampions = 7000;
        int totalDamageShieldedOnTeammates = 8000;
        int totalDamageTaken = 9000;
        int totalHeal = 500;
        int totalHealsOnTeammates = 600;
        int totalMinionsKilled = 230;
        int totalTimeCCDealt = 100;
        int totalTimeSpentDead = 500;
        int totalUnitsHealed = 600;
        int tripleKills = 0;
        int trueDamageDealt = 18000;
        int trueDamageDealtToChampions = 17000;
        int trueDamageTaken = 16000;
        int turretKills = 3;
        int turretTakedowns = 60;
        int turretsLost = 2;
        int unrealKills = 1234;
        int visionScore = 10;
        int visionWardsBoughtInGame = 15;
        int wardsKilled = 6;
        int wardsPlaced = 1;
        boolean win = true;
        Timestamp rrt = new Timestamp(System.currentTimeMillis());

        //when
        matchParticipantVO.setPuuid(puuid);
        matchParticipantVO.setDataVersion(dataVersion);
        matchParticipantVO.setMatchId(matchId);
        matchParticipantVO.setParticipantId(participantId);
        matchParticipantVO.setAssists(assists);
        matchParticipantVO.setBaronKills(baronKills);
        matchParticipantVO.setBountyLevel(bountyLevel);
        matchParticipantVO.setChampExperience(champExperience);
        matchParticipantVO.setChampLevel(champLevel);
        matchParticipantVO.setChampionId(championId);
        matchParticipantVO.setChampionName(championName);
        matchParticipantVO.setChampionNameKR(championNameKR);
        matchParticipantVO.setChampionImg(championImg);
        matchParticipantVO.setChampionTransform(championTransform);
        matchParticipantVO.setConsumablesPurchased(consumablesPurchased);
        matchParticipantVO.setDamageDealtToBuildings(damageDealtToBuildings);
        matchParticipantVO.setDamageDealtToObjectives(damageDealtToObjectives);
        matchParticipantVO.setDamageDealtToTurrets(damageDealtToTurrets);
        matchParticipantVO.setDamageSelfMitigated(damageSelfMitigated);
        matchParticipantVO.setDeaths(deaths);
        matchParticipantVO.setDetectorWardsPlaced(detectorWardsPlaced);
        matchParticipantVO.setDoubleKills(doubleKills);
        matchParticipantVO.setDragonKills(dragonKills);
        matchParticipantVO.setFirstBloodAssist(firstBloodAssist);
        matchParticipantVO.setFirstBloodKill(firstBloodKill);
        matchParticipantVO.setFirstTowerAssist(firstTowerAssist);
        matchParticipantVO.setFirstTowerKill(firstTowerKill);
        matchParticipantVO.setGameEndedInEarlySurrender(gameEndedInEarlySurrender);
        matchParticipantVO.setGameEndedInSurrender(gameEndedInSurrender);
        matchParticipantVO.setGoldEarned(goldEarned);
        matchParticipantVO.setGoldSpent(goldSpent);
        matchParticipantVO.setIndividualPosition(individualPosition);
        matchParticipantVO.setInhibitorKills(inhibitorKills);
        matchParticipantVO.setInhibitorTakedowns(inhibitorTakedowns);
        matchParticipantVO.setInhibitorsLost(inhibitorsLost);
        matchParticipantVO.setItem0(item0);
        matchParticipantVO.setItem1(item1);
        matchParticipantVO.setItem2(item2);
        matchParticipantVO.setItem3(item3);
        matchParticipantVO.setItem4(item4);
        matchParticipantVO.setItem5(item5);
        matchParticipantVO.setItem6(item6);
        matchParticipantVO.setItemsPurchased(itemsPurchased);
        matchParticipantVO.setKillingSprees(killingSprees);
        matchParticipantVO.setKills(kills);
        matchParticipantVO.setLane(lane);
        matchParticipantVO.setLargestCriticalStrike(largestCriticalStrike);
        matchParticipantVO.setLargestKillingSpree(largestKillingSpree);
        matchParticipantVO.setLargestMultiKill(largestMultiKill);
        matchParticipantVO.setLongestTimeSpentLiving(longestTimeSpentLiving);
        matchParticipantVO.setMagicDamageDealt(magicDamageDealt);
        matchParticipantVO.setMagicDamageDealtToChampions(magicDamageDealtToChampions);
        matchParticipantVO.setMagicDamageTaken(magicDamageTaken);
        matchParticipantVO.setNeutralMinionsKilled(neutralMinionsKilled);
        matchParticipantVO.setNexusKills(nexusKills);
        matchParticipantVO.setNexusTakedowns(nexusTakedowns);
        matchParticipantVO.setNexusLost(nexusLost);
        matchParticipantVO.setObjectivesStolen(objectivesStolen);
        matchParticipantVO.setObjectivesStolenAssists(objectivesStolenAssists);
        matchParticipantVO.setPentaKills(pentaKills);
        matchParticipantVO.setPhysicalDamageDealt(physicalDamageDealt);
        matchParticipantVO.setPhysicalDamageDealtToChampions(physicalDamageDealtToChampions);
        matchParticipantVO.setPhysicalDamageTaken(physicalDamageTaken);
        matchParticipantVO.setProfileIcon(profileIcon);
        matchParticipantVO.setQuadraKills(quadraKills);
        matchParticipantVO.setRiotIdName(riotIdName);
        matchParticipantVO.setRiotIdTagline(riotIdTagline);
        matchParticipantVO.setRole(role);
        matchParticipantVO.setSightWardsBoughtInGame(sightWardsBoughtInGame);
        matchParticipantVO.setSpell1Casts(spell1Casts);
        matchParticipantVO.setSpell2Casts(spell2Casts);
        matchParticipantVO.setSpell3Casts(spell3Casts);
        matchParticipantVO.setSpell4Casts(spell4Casts);
        matchParticipantVO.setSummoner1Casts(summoner1Casts);
        matchParticipantVO.setSummoner1Id(summoner1Id);
        matchParticipantVO.setSummoner2Casts(summoner2Casts);
        matchParticipantVO.setSummoner2Id(summoner2Id);
        matchParticipantVO.setSummonerId(summonerId);
        matchParticipantVO.setSummonerLevel(summonerLevel);
        matchParticipantVO.setSummonerName(summonerName);
        matchParticipantVO.setTeamEarlySurrendered(teamEarlySurrendered);
        matchParticipantVO.setTeamId(teamId);
        matchParticipantVO.setTeamPosition(teamPosition);
        matchParticipantVO.setTimeCCingOthers(timeCCingOthers);
        matchParticipantVO.setTimePlayed(timePlayed);
        matchParticipantVO.setTotalDamageDealt(totalDamageDealt);
        matchParticipantVO.setTotalDamageDealtToChampions(totalDamageDealtToChampions);
        matchParticipantVO.setTotalDamageShieldedOnTeammates(totalDamageShieldedOnTeammates);
        matchParticipantVO.setTotalDamageTaken(totalDamageTaken);
        matchParticipantVO.setTotalHeal(totalHeal);
        matchParticipantVO.setTotalHealsOnTeammates(totalHealsOnTeammates);
        matchParticipantVO.setTotalMinionsKilled(totalMinionsKilled);
        matchParticipantVO.setTotalTimeCCDealt(totalTimeCCDealt);
        matchParticipantVO.setTotalTimeSpentDead(totalTimeSpentDead);
        matchParticipantVO.setTotalUnitsHealed(totalUnitsHealed);
        matchParticipantVO.setTripleKills(tripleKills);
        matchParticipantVO.setTrueDamageDealt(trueDamageDealt);
        matchParticipantVO.setTrueDamageDealtToChampions(trueDamageDealtToChampions);
        matchParticipantVO.setTrueDamageTaken(trueDamageTaken);
        matchParticipantVO.setTurretKills(turretKills);
        matchParticipantVO.setTurretTakedowns(turretTakedowns);
        matchParticipantVO.setTurretsLost(turretsLost);
        matchParticipantVO.setUnrealKills(unrealKills);
        matchParticipantVO.setVisionScore(visionScore);
        matchParticipantVO.setVisionWardsBoughtInGame(visionWardsBoughtInGame);
        matchParticipantVO.setWardsKilled(wardsKilled);
        matchParticipantVO.setWardsPlaced(wardsPlaced);
        matchParticipantVO.setWin(win);
        matchParticipantVO.setRrt(rrt);

        //then
        assertThat(matchParticipantVO.getPuuid()).isEqualTo(puuid);
        assertThat(matchParticipantVO.getDataVersion()).isEqualTo(dataVersion);
        assertThat(matchParticipantVO.getMatchId()).isEqualTo(matchId);
        assertThat(matchParticipantVO.getParticipantId()).isEqualTo(participantId);
        assertThat(matchParticipantVO.getAssists()).isEqualTo(assists);
        assertThat(matchParticipantVO.getBaronKills()).isEqualTo(baronKills);
        assertThat(matchParticipantVO.getBountyLevel()).isEqualTo(bountyLevel);
        assertThat(matchParticipantVO.getChampExperience()).isEqualTo(champExperience);
        assertThat(matchParticipantVO.getChampLevel()).isEqualTo(champLevel);
        assertThat(matchParticipantVO.getChampionId()).isEqualTo(championId);
        assertThat(matchParticipantVO.getChampionName()).isEqualTo(championName);
        assertThat(matchParticipantVO.getChampionNameKR()).isEqualTo(championNameKR);
        assertThat(matchParticipantVO.getChampionImg()).isEqualTo(championImg);
        assertThat(matchParticipantVO.getChampionTransform()).isEqualTo(championTransform);
        assertThat(matchParticipantVO.getConsumablesPurchased()).isEqualTo(consumablesPurchased);
        assertThat(matchParticipantVO.getDamageDealtToBuildings()).isEqualTo(damageDealtToBuildings);
        assertThat(matchParticipantVO.getDamageDealtToObjectives()).isEqualTo(damageDealtToObjectives);
        assertThat(matchParticipantVO.getDamageSelfMitigated()).isEqualTo(damageSelfMitigated);
        assertThat(matchParticipantVO.getDeaths()).isEqualTo(deaths);
        assertThat(matchParticipantVO.getDetectorWardsPlaced()).isEqualTo(detectorWardsPlaced);
        assertThat(matchParticipantVO.getDoubleKills()).isEqualTo(doubleKills);
        assertThat(matchParticipantVO.getDragonKills()).isEqualTo(dragonKills);
        assertThat(matchParticipantVO.isFirstBloodAssist()).isEqualTo(firstBloodAssist);
        assertThat(matchParticipantVO.isFirstBloodKill()).isEqualTo(firstBloodKill);
        assertThat(matchParticipantVO.isFirstTowerAssist()).isEqualTo(firstTowerAssist);
        assertThat(matchParticipantVO.isFirstTowerKill()).isEqualTo(firstTowerKill);
        assertThat(matchParticipantVO.isGameEndedInEarlySurrender()).isEqualTo(gameEndedInEarlySurrender);
        assertThat(matchParticipantVO.isGameEndedInSurrender()).isEqualTo(gameEndedInSurrender);
        assertThat(matchParticipantVO.getGoldEarned()).isEqualTo(goldEarned);
        assertThat(matchParticipantVO.getGoldSpent()).isEqualTo(goldSpent);
        assertThat(matchParticipantVO.getIndividualPosition()).isEqualTo(individualPosition);
        assertThat(matchParticipantVO.getInhibitorKills()).isEqualTo(inhibitorKills);
        assertThat(matchParticipantVO.getInhibitorTakedowns()).isEqualTo(inhibitorTakedowns);
        assertThat(matchParticipantVO.getInhibitorsLost()).isEqualTo(inhibitorsLost);
        assertThat(matchParticipantVO.getItem0()).isEqualTo(item0);
        assertThat(matchParticipantVO.getItem1()).isEqualTo(item1);
        assertThat(matchParticipantVO.getItem2()).isEqualTo(item2);
        assertThat(matchParticipantVO.getItem3()).isEqualTo(item3);
        assertThat(matchParticipantVO.getItem4()).isEqualTo(item4);
        assertThat(matchParticipantVO.getItem5()).isEqualTo(item5);
        assertThat(matchParticipantVO.getItem6()).isEqualTo(item6);
        assertThat(matchParticipantVO.getItemsPurchased()).isEqualTo(itemsPurchased);
        assertThat(matchParticipantVO.getKillingSprees()).isEqualTo(killingSprees);
        assertThat(matchParticipantVO.getKills()).isEqualTo(kills);
        assertThat(matchParticipantVO.getLane()).isEqualTo(lane);
        assertThat(matchParticipantVO.getLargestCriticalStrike()).isEqualTo(largestCriticalStrike);
        assertThat(matchParticipantVO.getLargestKillingSpree()).isEqualTo(largestKillingSpree);
        assertThat(matchParticipantVO.getLongestTimeSpentLiving()).isEqualTo(longestTimeSpentLiving);
        assertThat(matchParticipantVO.getMagicDamageDealt()).isEqualTo(magicDamageDealt);
        assertThat(matchParticipantVO.getMagicDamageDealtToChampions()).isEqualTo(magicDamageDealtToChampions);
        assertThat(matchParticipantVO.getMagicDamageTaken()).isEqualTo(magicDamageTaken);
        assertThat(matchParticipantVO.getNeutralMinionsKilled()).isEqualTo(neutralMinionsKilled);
        assertThat(matchParticipantVO.getNexusKills()).isEqualTo(nexusKills);
        assertThat(matchParticipantVO.getNexusLost()).isEqualTo(nexusLost);
        assertThat(matchParticipantVO.getNexusTakedowns()).isEqualTo(nexusTakedowns);
        assertThat(matchParticipantVO.getObjectivesStolen()).isEqualTo(objectivesStolen);
        assertThat(matchParticipantVO.getObjectivesStolenAssists()).isEqualTo(objectivesStolenAssists);
        assertThat(matchParticipantVO.getPentaKills()).isEqualTo(pentaKills);
        assertThat(matchParticipantVO.getPhysicalDamageDealt()).isEqualTo(physicalDamageDealt);
        assertThat(matchParticipantVO.getPhysicalDamageDealtToChampions()).isEqualTo(physicalDamageDealtToChampions);
        assertThat(matchParticipantVO.getPhysicalDamageTaken()).isEqualTo(physicalDamageTaken);
        assertThat(matchParticipantVO.getProfileIcon()).isEqualTo(profileIcon);
        assertThat(matchParticipantVO.getQuadraKills()).isEqualTo(quadraKills);
        assertThat(matchParticipantVO.getRiotIdName()).isEqualTo(riotIdName);
        assertThat(matchParticipantVO.getRiotIdTagline()).isEqualTo(riotIdTagline);
        assertThat(matchParticipantVO.getRole()).isEqualTo(role);
        assertThat(matchParticipantVO.getSightWardsBoughtInGame()).isEqualTo(sightWardsBoughtInGame);
        assertThat(matchParticipantVO.getSpell1Casts()).isEqualTo(spell1Casts);
        assertThat(matchParticipantVO.getSpell2Casts()).isEqualTo(spell2Casts);
        assertThat(matchParticipantVO.getSpell3Casts()).isEqualTo(spell3Casts);
        assertThat(matchParticipantVO.getSpell4Casts()).isEqualTo(spell4Casts);
        assertThat(matchParticipantVO.getSummoner1Casts()).isEqualTo(summoner1Casts);
        assertThat(matchParticipantVO.getSummoner1Id()).isEqualTo(summoner1Id);
        assertThat(matchParticipantVO.getSummoner2Casts()).isEqualTo(summoner2Casts);
        assertThat(matchParticipantVO.getSummoner2Id()).isEqualTo(summoner2Id);
        assertThat(matchParticipantVO.getSummonerId()).isEqualTo(summonerId);
        assertThat(matchParticipantVO.getSummonerLevel()).isEqualTo(summonerLevel);
        assertThat(matchParticipantVO.getSummonerName()).isEqualTo(summonerName);
        assertThat(matchParticipantVO.isTeamEarlySurrendered()).isEqualTo(teamEarlySurrendered);
        assertThat(matchParticipantVO.getTeamId()).isEqualTo(teamId);
        assertThat(matchParticipantVO.getTeamPosition()).isEqualTo(teamPosition);
        assertThat(matchParticipantVO.getTimeCCingOthers()).isEqualTo(timeCCingOthers);
        assertThat(matchParticipantVO.getTimePlayed()).isEqualTo(timePlayed);
        assertThat(matchParticipantVO.getTotalDamageDealt()).isEqualTo(totalDamageDealt);
        assertThat(matchParticipantVO.getTotalDamageDealtToChampions()).isEqualTo(totalDamageDealtToChampions);
        assertThat(matchParticipantVO.getTotalDamageTaken()).isEqualTo(totalDamageTaken);
        assertThat(matchParticipantVO.getTotalHeal()).isEqualTo(totalHeal);
        assertThat(matchParticipantVO.getTotalHealsOnTeammates()).isEqualTo(totalHealsOnTeammates);
        assertThat(matchParticipantVO.getTotalMinionsKilled()).isEqualTo(totalMinionsKilled);
        assertThat(matchParticipantVO.getTotalTimeCCDealt()).isEqualTo(totalTimeCCDealt);
        assertThat(matchParticipantVO.getTotalTimeSpentDead()).isEqualTo(totalTimeSpentDead);
        assertThat(matchParticipantVO.getTotalUnitsHealed()).isEqualTo(totalUnitsHealed);
        assertThat(matchParticipantVO.getTripleKills()).isEqualTo(tripleKills);
        assertThat(matchParticipantVO.getTrueDamageDealt()).isEqualTo(trueDamageDealt);
        assertThat(matchParticipantVO.getTrueDamageDealtToChampions()).isEqualTo(trueDamageDealtToChampions);
        assertThat(matchParticipantVO.getTrueDamageTaken()).isEqualTo(trueDamageTaken);
        assertThat(matchParticipantVO.getTurretKills()).isEqualTo(turretKills);
        assertThat(matchParticipantVO.getTurretTakedowns()).isEqualTo(turretTakedowns);
        assertThat(matchParticipantVO.getTurretsLost()).isEqualTo(turretsLost);
        assertThat(matchParticipantVO.getUnrealKills()).isEqualTo(unrealKills);
        assertThat(matchParticipantVO.getVisionScore()).isEqualTo(visionScore);
        assertThat(matchParticipantVO.getVisionWardsBoughtInGame()).isEqualTo(visionWardsBoughtInGame);
        assertThat(matchParticipantVO.getWardsKilled()).isEqualTo(wardsKilled);
        assertThat(matchParticipantVO.getWardsPlaced()).isEqualTo(wardsPlaced);
        assertThat(matchParticipantVO.isWin()).isEqualTo(win);
        assertThat(matchParticipantVO.getRrt()).isEqualTo(rrt);
    }

    private MatchParticipantVO createMatchParticipantVOForSetTest() {
        String puuid = "UUUUUUUU";
        String dataVersion = "3";
        String matchId = "ABCDEFG";
        int participantId = 1;

        int assists = 9;
        int baronKills = 8;
        int bountyLevel = 7;
        int champExperience = 6;
        int champLevel = 5;
        int championId = 4;
        String championName = "Ari";
        String championNameKR = "아리";
        String championImg = "Ahri.png";
        int championTransform = 3;
        int consumablesPurchased = 2;
        int damageDealtToBuildings = 1;
        int damageDealtToObjectives = 100;
        int damageDealtToTurrets = 99;
        int damageSelfMitigated = 98;
        int deaths = 97;
        int detectorWardsPlaced = 96;
        int doubleKills = 95;
        int dragonKills = 94;
        boolean firstBloodAssist = true;
        boolean firstBloodKill = false;
        boolean firstTowerAssist = true;
        boolean firstTowerKill = false;
        boolean gameEndedInEarlySurrender = true;
        boolean gameEndedInSurrender = false;
        int goldEarned = 93;
        int goldSpent = 92;
        String individualPosition = "MIDDLE";
        int inhibitorKills = 91;
        int inhibitorTakedowns = 90;
        int inhibitorsLost = 89;
        int item0 = 88;
        int item1 = 87;
        int item2 = 86;
        int item3 = 85;
        int item4 = 84;
        int item5 = 83;
        int item6 = 82;
        int itemsPurchased = 81;
        int killingSprees = 80;
        int kills = 79;
        String lane = "MIDDLE";
        int largestCriticalStrike = 78;
        int largestKillingSpree = 77;
        int largestMultiKill = 76;
        int longestTimeSpentLiving = 75;
        int magicDamageDealt = 74;
        int magicDamageDealtToChampions = 73;
        int magicDamageTaken = 72;
        int neutralMinionsKilled = 71;
        int nexusKills = 70;
        int nexusTakedowns = 69;
        int nexusLost = 68;
        int objectivesStolen = 67;
        int objectivesStolenAssists = 66;
        int pentaKills = 65;
        int physicalDamageDealt = 64;
        int physicalDamageDealtToChampions = 63;
        int physicalDamageTaken = 62;
        int profileIcon = 61;
        int quadraKills = 60;
        String riotIdName = "BYEROO";
        String riotIdTagline = "BYEROO321";
        String role = "BYEBYE";
        int sightWardsBoughtInGame = 59;
        int spell1Casts = 58;
        int spell2Casts = 57;
        int spell3Casts = 56;
        int spell4Casts = 55;
        int summoner1Casts = 54;
        String summoner1Id = "53";
        int summoner2Casts = 52;
        String summoner2Id = "50";
        String summonerId = "ByeSummoner";
        int summonerLevel = 49;
        String summonerName = "ARIISGOD";
        boolean teamEarlySurrendered = true;
        int teamId = 48;
        String teamPosition = "BLUE";
        int timeCCingOthers = 47;
        int timePlayed = 46;
        int totalDamageDealt = 45;
        int totalDamageDealtToChampions = 44;
        int totalDamageShieldedOnTeammates = 43;
        int totalDamageTaken = 42;
        int totalHeal = 41;
        int totalHealsOnTeammates = 40;
        int totalMinionsKilled = 39;
        int totalTimeCCDealt = 38;
        int totalTimeSpentDead = 37;
        int totalUnitsHealed = 36;
        int tripleKills = 35;
        int trueDamageDealt = 34;
        int trueDamageDealtToChampions = 33;
        int trueDamageTaken = 32;
        int turretKills = 31;
        int turretTakedowns = 30;
        int turretsLost = 29;
        int unrealKills = 28;
        int visionScore = 27;
        int visionWardsBoughtInGame = 26;
        int wardsKilled = 25;
        int wardsPlaced = 24;
        boolean win = false;
        Timestamp rrt = new Timestamp(System.currentTimeMillis());

        return new MatchParticipantVO(
                puuid,
                dataVersion,
                matchId,
                participantId,
                assists,
                baronKills,
                bountyLevel,
                champExperience,
                champLevel,
                championId,
                championName,
                championNameKR,
                championImg,
                championTransform,
                consumablesPurchased,
                damageDealtToBuildings,
                damageDealtToObjectives,
                damageDealtToTurrets,
                damageSelfMitigated,
                deaths,
                detectorWardsPlaced,
                doubleKills,
                dragonKills,
                firstBloodAssist,
                firstBloodKill,
                firstTowerAssist,
                firstTowerKill,
                gameEndedInEarlySurrender,
                gameEndedInSurrender,
                goldEarned,
                goldSpent,
                individualPosition,
                inhibitorKills,
                inhibitorTakedowns,
                inhibitorsLost,
                item0,
                item1,
                item2,
                item3,
                item4,
                item5,
                item6,
                itemsPurchased,
                killingSprees,
                kills,
                lane,
                largestCriticalStrike,
                largestKillingSpree,
                largestMultiKill,
                longestTimeSpentLiving,
                magicDamageDealt,
                magicDamageDealtToChampions,
                magicDamageTaken,
                neutralMinionsKilled,
                nexusKills,
                nexusTakedowns,
                nexusLost,
                objectivesStolen,
                objectivesStolenAssists,
                pentaKills,
                physicalDamageDealt,
                physicalDamageDealtToChampions,
                physicalDamageTaken,
                profileIcon,
                quadraKills,
                riotIdName,
                riotIdTagline,
                role,
                sightWardsBoughtInGame,
                spell1Casts,
                spell2Casts,
                spell3Casts,
                spell4Casts,
                summoner1Casts,
                summoner1Id,
                summoner2Casts,
                summoner2Id,
                summonerId,
                summonerLevel,
                summonerName,
                teamEarlySurrendered,
                teamId,
                teamPosition,
                timeCCingOthers,
                timePlayed,
                totalDamageDealt,
                totalDamageDealtToChampions,
                totalDamageShieldedOnTeammates,
                totalDamageTaken,
                totalHeal,
                totalHealsOnTeammates,
                totalMinionsKilled,
                totalTimeCCDealt,
                totalTimeSpentDead,
                totalUnitsHealed,
                tripleKills,
                trueDamageDealt,
                trueDamageDealtToChampions,
                trueDamageTaken,
                turretKills,
                turretTakedowns,
                turretsLost,
                unrealKills,
                visionScore,
                visionWardsBoughtInGame,
                wardsKilled,
                wardsPlaced,
                win,
                rrt
        );
    }
}
