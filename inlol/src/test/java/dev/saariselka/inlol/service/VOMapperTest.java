package dev.saariselka.inlol.service;

import dev.saariselka.inlol.dto.MatchMasterDto;
import dev.saariselka.inlol.dto.MatchPerksDto;
import dev.saariselka.inlol.entity.*;
import dev.saariselka.inlol.service.VOMapper;
import dev.saariselka.inlol.vo.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class VOMapperTest {

    @Autowired
    VOMapper voMapper;

    @Test
    @DisplayName("Convert SummonerSpellVOList To SummonerSpellEntityList")
    public void toSummonerSpellEntityList() {

        //given
        String name = "testSummonerSpellName";
        String description = "testSummonerSpellDesc";
        int spellKey = 0;
        String image = "testSummonerSpellImage";
        SummonerSpellVO summonerSpellVO = new SummonerSpellVO(name,description,spellKey,image);
        List<SummonerSpellVO> summonerSpellVOList = new ArrayList<>();
        summonerSpellVOList.add(summonerSpellVO);

        //when
        List<SummonerSpellEntity> summonerSpellEntities = new ArrayList<>();
        summonerSpellEntities = voMapper.toSummonerSpellEntityList(summonerSpellVOList);

        //then
        assertThat(summonerSpellEntities.get(0).getName()).isEqualTo(name);
        assertThat(summonerSpellEntities.get(0).getDescription()).isEqualTo(description);
        assertThat(summonerSpellEntities.get(0).getSpellKey()).isEqualTo(spellKey);
        assertThat(summonerSpellEntities.get(0).getImage()).isEqualTo(image);
    }

    @Test
    @DisplayName("Convert SummonerSpellEntityList To SummonerSpellVOList")
    public void toSummonerSpellVOList() {

        //given
        String name = "testSummonerSpellName";
        String description = "testSummonerSpellDesc";
        int spellKey = 0;
        String image = "testSummonerSpellImage";
        SummonerSpellEntity summonerSpellEntity = new SummonerSpellEntity(name,description,spellKey,image);
        List<SummonerSpellEntity> summonerSpellEntityList = new ArrayList<>();
        summonerSpellEntityList.add(summonerSpellEntity);

        //when
        List<SummonerSpellVO> summonerSpellVOList = new ArrayList<>();
        summonerSpellVOList = voMapper.toSummonerSpellVOList(summonerSpellEntityList);

        //then
        assertThat(summonerSpellVOList.get(0).getName()).isEqualTo(name);
        assertThat(summonerSpellVOList.get(0).getDescription()).isEqualTo(description);
        assertThat(summonerSpellVOList.get(0).getSpellKey()).isEqualTo(spellKey);
        assertThat(summonerSpellVOList.get(0).getImage()).isEqualTo(image);
    }

    @Test
    @DisplayName("Convert MatchBanVOList To MatchBanEntityList")
    public void toMatchBanEntityList() {

        //given
        String matchId = "KR_5804413147";
        int pickTurn = 1;
        int teamId = 100;
        int championId = 99;
        MatchBanVO matchBanVO = new MatchBanVO(matchId,pickTurn,teamId,championId);
        List<MatchBanVO> matchBanVOList = new ArrayList<>();
        matchBanVOList.add(matchBanVO);

        //when
        List<MatchBanEntity> matchBanEntityList = new ArrayList<>();
        matchBanEntityList = voMapper.toMatchBanEntityList(matchBanVOList);

        //then
        assertThat(matchBanEntityList.get(0).getMatchBanId().getMatchId()).isEqualTo(matchId);
        assertThat(matchBanEntityList.get(0).getMatchBanId().getPickTurn()).isEqualTo(pickTurn);
        assertThat(matchBanEntityList.get(0).getMatchBanId().getTeamId()).isEqualTo(teamId);
        assertThat(matchBanEntityList.get(0).getChampionId()).isEqualTo(championId);
    }

    @Test
    @DisplayName("Convert MatchBanEntityList To MatchBanVOList")
    public void toMatchBanVOList() {

        //given
        String matchId = "KR_5804413147";
        int pickTurn = 1;
        int teamId = 100;
        int championId = 99;
        Timestamp rrt = new Timestamp(System.currentTimeMillis());
        MatchBanEntity matchBanEntity = new MatchBanEntity(new MatchBanId(matchId,pickTurn,teamId),championId,rrt);
        List<MatchBanEntity> matchBanEntityList = new ArrayList<>();
        matchBanEntityList.add(matchBanEntity);

        //when
        List<MatchBanVO> matchBanVOList = new ArrayList<>();
        matchBanVOList = voMapper.toMatchBanVOList(matchBanEntityList);

        //then
        assertThat(matchBanVOList.get(0).getMatchId()).isEqualTo(matchId);
        assertThat(matchBanVOList.get(0).getPickTurn()).isEqualTo(pickTurn);
        assertThat(matchBanVOList.get(0).getTeamId()).isEqualTo(teamId);
        assertThat(matchBanVOList.get(0).getChampionId()).isEqualTo(championId);
    }

    @Test
    @DisplayName("Convert QueueTypeEntityList To QueueTypeVOList")
    public void toQueueTypeVOList() {
        // given
        List<QueueTypeEntity> entityList = new ArrayList<>();
        QueueTypeEntity entity = new QueueTypeEntity(999, "TestMap", "TestDes");
        entityList.add(entity);

        // when
        List<QueueTypeVO> voList = voMapper.toQueueTypeVOList(entityList);

        // then
        assertThat(voList.get(0).getQueueId()).isEqualTo(999);
        assertThat(voList.get(0).getMap()).isEqualTo("TestMap");
        assertThat(voList.get(0).getDescription()).isEqualTo("TestDes");
    }

    @Test
    @DisplayName("Convert ChampionEntityList To ChampionVOList")
    public void toChampionEntityList() {
        // given
        List<ChampionVO> voList = new ArrayList<>();
        ChampionVO vo = new ChampionVO(999, "Test", "테스트", "/testimage.png");
        voList.add(vo);

        // when
        List<ChampionEntity> entityList = voMapper.toChampionEntityList(voList);

        // then
        assertThat(entityList.get(0).getId()).isEqualTo(999);
        assertThat(entityList.get(0).getNameEng()).isEqualTo("Test");
        assertThat(entityList.get(0).getNameKo()).isEqualTo("테스트");
        assertThat(entityList.get(0).getImagePath()).isEqualTo("/testimage.png");

    }

    @Test
    @DisplayName("Convert DdrgonVersionEntityList To DdragonVersionVOList")
    public void toDdragonVersionVOList() {
        //given
        List<DdragonVersionEntity> ddragonVersionEntityList = new ArrayList<>();
        DdragonVersionEntity ddragonVersionEntity = new DdragonVersionEntity(12345L, "12345", "Y");
        ddragonVersionEntityList.add(ddragonVersionEntity);

        //when
        List<DdragonVersionVO> ddragonVersionVOList = voMapper.toDdragonVersionVOList(ddragonVersionEntityList);

        //then
        assertThat(ddragonVersionVOList.get(0).getId()).isEqualTo(ddragonVersionEntity.getId());
        assertThat(ddragonVersionVOList.get(0).getVersion()).isEqualTo(ddragonVersionEntity.getVersion());
        assertThat(ddragonVersionVOList.get(0).getCurrent()).isEqualTo(ddragonVersionEntity.getCurrent());
    }

    @Test
    @DisplayName("Convert DdrgonVersionEntity To DdragonVersionVO")
    public void toDdragonVersionVO() {
        //given
        Optional<DdragonVersionEntity> ddragonVersionEntity = Optional.of(new DdragonVersionEntity(12345L, "12345", "Y"));

        //when
        Optional<DdragonVersionVO> ddragonVersionVO = voMapper.toDdragonVersionVO(ddragonVersionEntity);

        //then
        assertThat(ddragonVersionVO.get().getId()).isEqualTo(ddragonVersionEntity.get().getId());
        assertThat(ddragonVersionVO.get().getVersion()).isEqualTo(ddragonVersionEntity.get().getVersion());
        assertThat(ddragonVersionVO.get().getCurrent()).isEqualTo(ddragonVersionEntity.get().getCurrent());
    }

    @Test
    @DisplayName("Convert LeagueMiniseriesEntity To LeagueMiniseriesVO")
    public void toLeagueMiniseriesVO(){
        // given
        String summonerId = "testSummonerId";
        String queueType = "RANKED_SOLO_5x5";
        int target = 3;
        int wins = 2;
        int losses = 1;
        String progress = "Test";
        Timestamp rrt = new Timestamp(System.currentTimeMillis());
        LeagueMiniSeriesEntity leagueMiniSeriesEntity = new LeagueMiniSeriesEntity(new LeagueMiniSeriesId(summonerId,queueType),losses,progress,target,wins,rrt);

        //when
        LeagueMiniSeriesVO leagueMiniSeriesVO = voMapper.toLeagueMiniseriesVO(leagueMiniSeriesEntity);

        //then
        assertThat(leagueMiniSeriesVO.getSummonerId()).isEqualTo(summonerId);
        assertThat(leagueMiniSeriesVO.getQueueType()).isEqualTo(queueType);
        assertThat(leagueMiniSeriesVO.getTarget()).isEqualTo(target);
        assertThat(leagueMiniSeriesVO.getWins()).isEqualTo(wins);
        assertThat(leagueMiniSeriesVO.getLosses()).isEqualTo(losses);
        assertThat(leagueMiniSeriesVO.getProgress()).isEqualTo(progress);
    }

    @Test
    @DisplayName("Convert LeagueEntry Entity List To LeagueEntry VO List")
    public void toLeagueEntryVOList() {

        //given
        String summonerId = "testSummonerId";
        String queueType = "RANKED_SOLO_5x5";
        String leagueId = "05fb99f4-e149-3133-a78e-821597582f9d";
        String summonerName = "Hide on bush";
        String tier = "CHALLENGER";
        String ranks = "I";
        int leaguePoints = 1008;
        int wins = 358;
        int losses = 309;
        boolean hotStreak = false;
        boolean veteran = true;
        boolean freshBlood = false;
        boolean inactive = false;
        Timestamp rrt = new Timestamp(System.currentTimeMillis());

        LeagueEntryEntity leagueEntryEntity = new LeagueEntryEntity(new LeagueEntryId(summonerId,queueType),leagueId,summonerName,tier,ranks,leaguePoints,wins,losses,hotStreak,
                veteran,freshBlood,inactive,rrt);
        List<LeagueEntryEntity> leagueEntryEntityList = new ArrayList<>();
        leagueEntryEntityList.add(leagueEntryEntity);

        //when
        List<LeagueEntryVO> leagueEntryVOList = new ArrayList<>();
        leagueEntryVOList = voMapper.toLeagueEntryVOList(leagueEntryEntityList);

        //then
        assertThat(leagueEntryVOList.get(0).getSummonerId()).isEqualTo(summonerId);
        assertThat(leagueEntryVOList.get(0).getQueueType()).isEqualTo(queueType);
    }

    @Test
    @DisplayName("Convert SummonerPerk Entity List To SummonerPerk VO List")
    public void toSummonerPerkVOList() {
        //given
        List<SummonerPerkEntity> summonerPerkEntityList = new ArrayList<>();
        SummonerPerkEntity summonerPerkEntity =
                new SummonerPerkEntity(
                        12345
                        , "nameEng"
                        , "한글이름"
                        , "iconpath"
                        , "description"
                );
        summonerPerkEntityList.add(summonerPerkEntity);

        //when
        List<SummonerPerkVO> summonerPerkVOList = voMapper.toSummonerPerkVOList(summonerPerkEntityList);

        //then
        assertThat(summonerPerkVOList.get(0).getPerkId()).isEqualTo(summonerPerkEntity.getPerkId());
        assertThat(summonerPerkVOList.get(0).getNameEng()).isEqualTo(summonerPerkEntity.getNameEng());
        assertThat(summonerPerkVOList.get(0).getNameKor()).isEqualTo(summonerPerkEntity.getNameKor());
        assertThat(summonerPerkVOList.get(0).getIcon()).isEqualTo(summonerPerkEntity.getIcon());
        assertThat(summonerPerkVOList.get(0).getDescription()).isEqualTo(summonerPerkEntity.getDescription());
    }

    @Test
    @DisplayName("Convert SummonerPerk VO List To SummonerPerk Entity List")
    public void toSummonerPerkEntityList() {
        //given
        List<SummonerPerkVO> summonerPerkVOList = new ArrayList<>();
        SummonerPerkVO summonerPerkVO =
                new SummonerPerkVO(
                        12345
                        , "nameEng"
                        , "한글이름"
                        , "iconpath"
                        , "description"
                );
        summonerPerkVOList.add(summonerPerkVO);

        //when
        List<SummonerPerkEntity> summonerPerkEntityList = voMapper.toSummonerPerkEntityList(summonerPerkVOList);

        //then
        assertThat(summonerPerkEntityList.get(0).getPerkId()).isEqualTo(summonerPerkVO.getPerkId());
        assertThat(summonerPerkEntityList.get(0).getNameEng()).isEqualTo(summonerPerkVO.getNameEng());
        assertThat(summonerPerkEntityList.get(0).getNameKor()).isEqualTo(summonerPerkVO.getNameKor());
        assertThat(summonerPerkEntityList.get(0).getIcon()).isEqualTo(summonerPerkVO.getIcon());
        assertThat(summonerPerkEntityList.get(0).getDescription()).isEqualTo(summonerPerkVO.getDescription());
    }

    @Test
    @DisplayName("Convert MatchPerks Entity List To MatchPerks VO List")
    public void toMatchPerksVOList() {
        //given
        String matchId = "KR12345";
        String puuid = "FEFEFE";
        int primaryStyle = 11111;
        int primaryPerk1 = 22222;
        int primaryPerk2 = 33333;
        int primaryPerk3 = 44444;
        int primaryPerk4 = 55555;
        int subStyle = 66666;
        int subPerk1 = 77777;
        int subPerk2 = 88888;
        int statPerkDefense = 4321;
        int statPerkFlex = 1234;
        int statPerkOffense = 8765;
        Timestamp rrt = new Timestamp(System.currentTimeMillis());

        List<MatchPerksEntity> matchPerksEntityList = new ArrayList<>();
        MatchPerksEntity matchPerksEntity =
                new MatchPerksEntity(
                        new MatchPerksId(matchId, puuid)
                        , primaryStyle
                        , primaryPerk1
                        , primaryPerk2
                        , primaryPerk3
                        , primaryPerk4
                        , subStyle
                        , subPerk1
                        , subPerk2
                        , statPerkDefense
                        , statPerkFlex
                        , statPerkOffense
                        , rrt
                );
        matchPerksEntityList.add(matchPerksEntity);

        //when
        List<MatchPerksVO> matchPerksVOList = voMapper.toMatchPerksVOList(matchPerksEntityList);

        //then
        assertThat(matchPerksVOList.get(0).getMatchId()).isEqualTo(matchPerksEntity.getMatchPerksId().getMatchId());
        assertThat(matchPerksVOList.get(0).getPuuid()).isEqualTo(matchPerksEntity.getMatchPerksId().getPuuid());
        assertThat(matchPerksVOList.get(0).getPrimaryStyle()).isEqualTo(matchPerksEntity.getPrimaryStyle());
        assertThat(matchPerksVOList.get(0).getPrimaryPerk1()).isEqualTo(matchPerksEntity.getPrimaryPerk1());
        assertThat(matchPerksVOList.get(0).getPrimaryPerk2()).isEqualTo(matchPerksEntity.getPrimaryPerk2());
        assertThat(matchPerksVOList.get(0).getPrimaryPerk3()).isEqualTo(matchPerksEntity.getPrimaryPerk3());
        assertThat(matchPerksVOList.get(0).getPrimaryPerk4()).isEqualTo(matchPerksEntity.getPrimaryPerk4());
        assertThat(matchPerksVOList.get(0).getSubStyle()).isEqualTo(matchPerksEntity.getSubStyle());
        assertThat(matchPerksVOList.get(0).getSubPerk1()).isEqualTo(matchPerksEntity.getSubPerk1());
        assertThat(matchPerksVOList.get(0).getSubPerk2()).isEqualTo(matchPerksEntity.getSubPerk2());
        assertThat(matchPerksVOList.get(0).getStatPerkDefense()).isEqualTo(matchPerksEntity.getStatPerkDefense());
        assertThat(matchPerksVOList.get(0).getStatPerkFlex()).isEqualTo(matchPerksEntity.getStatPerkFlex());
        assertThat(matchPerksVOList.get(0).getStatPerkOffense()).isEqualTo(matchPerksEntity.getStatPerkOffense());
        assertThat(matchPerksVOList.get(0).getRrt()).isEqualTo(matchPerksEntity.getRrt());
    }

    @Test
    @DisplayName("Convert MatchMaster Entity List To MatchMaster VO List")
    public void toMatchMasterVOList() {
        //given
        String dataVersion = "2";
        String matchId = "KR_5804413147";
        long gameCreation = 1646753771000L;
        long gameDuration = 694L;
        long gameEndTimeStamp = 1646754647544L;
        long gameId = 5803564866L;
        String gameMode = "ARAM";
        String gameName = "hondoner 님의 게임";
        long gameStartTimeStamp = 1646753953169L;
        String gameType = "CUSTOM_GAME";
        String gameVersion = "12.5.425.9171";
        int mapId = 12;
        String platformId = "KR";
        int queueId = 0;
        String queueType = "일반";
        int teamId1 = 100;
        int teamId2 = 200;
        String tournamentCode = null;

        MatchMasterEntity matchMasterEntity = new MatchMasterEntity(new MatchMasterId(dataVersion,matchId),gameCreation,gameDuration,gameEndTimeStamp,gameId,gameMode,gameName,
                gameStartTimeStamp,gameType,gameVersion,mapId,platformId,queueId,queueType,teamId1,teamId2,tournamentCode,null);

        List<MatchMasterEntity> matchMasterEntityList = new ArrayList<>();

        matchMasterEntityList.add(matchMasterEntity);

        //when
        MatchMasterVO matchMasterVO = voMapper.toMatchMasterVOList(matchMasterEntityList).get(0);

        //then
        assertThat(matchMasterVO.getMatchId()).isEqualTo(matchId);
        assertThat(matchMasterVO.getDataVersion()).isEqualTo(dataVersion);
    }

    @Test
    @DisplayName("Convert MatchObjectives Entity List To MatchObjectives VO List")
    public void toMatchObjectivesVOList() {
        // given
        List<MatchObjectivesEntity> matchObjectivesEntityList = new ArrayList<>();
        Timestamp rrt = new Timestamp(System.currentTimeMillis());
        MatchObjectivesId matchObjectivesId = new MatchObjectivesId("Test1", 999);
        MatchObjectivesEntity matchObjectivesEntity = new MatchObjectivesEntity(matchObjectivesId,
                true, 1,
                false, 2,
                true, 3,
                false, 4,
                true, 5,
                false, 6,
                rrt
                );
        matchObjectivesEntityList.add(matchObjectivesEntity);

        // when
        MatchObjectivesVO matchObjectivesVO = voMapper.toMatchObjectivesVOList(matchObjectivesEntityList).get(0);

        // then
        assertThat(matchObjectivesVO.getBaron().isFirst()).isEqualTo(matchObjectivesEntity.isBaron_first());
        assertThat(matchObjectivesVO.getBaron().getKills()).isEqualTo(matchObjectivesEntity.getBaron_kills());
        assertThat(matchObjectivesVO.getChampion().isFirst()).isEqualTo(matchObjectivesEntity.isChampion_first());
        assertThat(matchObjectivesVO.getChampion().getKills()).isEqualTo(matchObjectivesEntity.getChampion_kills());
        assertThat(matchObjectivesVO.getDragon().isFirst()).isEqualTo(matchObjectivesEntity.isDragon_first());
        assertThat(matchObjectivesVO.getDragon().getKills()).isEqualTo(matchObjectivesEntity.getDragon_kills());
        assertThat(matchObjectivesVO.getInhibitor().isFirst()).isEqualTo(matchObjectivesEntity.isInhibitor_first());
        assertThat(matchObjectivesVO.getInhibitor().getKills()).isEqualTo(matchObjectivesEntity.getInhibitor_kills());
        assertThat(matchObjectivesVO.getRiftHeraId().isFirst()).isEqualTo(matchObjectivesEntity.isRiftherald_first());
        assertThat(matchObjectivesVO.getRiftHeraId().getKills()).isEqualTo(matchObjectivesEntity.getRiftherald_kills());
        assertThat(matchObjectivesVO.getTower().isFirst()).isEqualTo(matchObjectivesEntity.isTower_first());
        assertThat(matchObjectivesVO.getTower().getKills()).isEqualTo(matchObjectivesEntity.getTower_kills());

    }

    @Test
    @DisplayName("Convert MatchTeam Entity List To MathTeam VO List")
    public void toMatchTeamVOList() {
        // given
        Timestamp rrt = new Timestamp(System.currentTimeMillis());
        List<TeamEntity> teamEntityList = new ArrayList<>();
        TeamEntity teamEntity = new TeamEntity(new TeamId("Test1", 999), false, rrt);
        teamEntityList.add(teamEntity);

        // when
        MatchTeamVO matchTeamVO = voMapper.toMatchTeamVOList(teamEntityList).get(0);

        // then
        assertThat(matchTeamVO.getTeamId()).isEqualTo(String.valueOf(teamEntity.getTeamId().getTeamId()));
        assertThat(matchTeamVO.getWin()).isEqualTo(String.valueOf(teamEntity.isWin()));

    }

    @Test
    @DisplayName("Convert Summoner Entity List To Summoner VO List")
    public void toSummonerVOList() {
        // given
        List<SummonerEntity> summonerEntityList = new ArrayList<>();
        Timestamp rrt = new Timestamp(System.currentTimeMillis());
        SummonerEntity summonerEntity = new SummonerEntity("yNr_v4gSrhBU8EhJ5edZpXGRjG_892njE-EGMaRLdSXyMY2RJHGDMoFsbv4eD--2aQvdruC0YqNY4g",
                "dAU3oF9-T5Rok7LzAwqhHDDTGiNNuvakeANcZcDWexPy",
                "qdDRYfl_uN6Pt7V-9kSwLGoc-jNfw0hjQj0n7XT1yVrLiA",
                "Test on bush",
                6,
                1655406735000L,
                576L,
                rrt);
        summonerEntityList.add(summonerEntity);

        // when
        SummonerVO summonerVO = voMapper.toSummonerVOList(summonerEntityList).get(0);

        // then
        assertThat(summonerVO.getPuuid()).isEqualTo(summonerEntity.getPuuid());
        assertThat(summonerVO.getAccountId()).isEqualTo(summonerEntity.getAccountid());
        assertThat(summonerVO.getId()).isEqualTo(summonerEntity.getId());
        assertThat(summonerVO.getName()).isEqualTo(summonerEntity.getName());
        assertThat(summonerVO.getProfileIconId()).isEqualTo(String.valueOf(summonerEntity.getProfileiconid()));
        assertThat(summonerVO.getRevisionDate()).isEqualTo(String.valueOf(summonerEntity.getRevisiondate()));
        assertThat(summonerVO.getSummonerLevel()).isEqualTo(String.valueOf(summonerEntity.getSummonerlevel()));
        assertThat(summonerVO.getLastRefreshTimeForUI()).isEqualTo("0분 전");
        assertThat(summonerVO.getLastRefreshTimeForAPI()).isEqualTo(rrt.toInstant().getEpochSecond());
    }

    @Test
    @DisplayName("Convert MatchParticipant Entity List To MatchParticipant VO List")
    public void toMatchParticipantVOList() {
        //given
        List<MatchParticipantEntity> matchParticipantEntityList = new ArrayList<>();
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

        MatchParticipantEntity matchParticipantEntity
                = new MatchParticipantEntity(
                new MatchParticipantId(
                        puuid,
                        dataVersion,
                        matchId,
                        participantId
                ),
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

        matchParticipantEntityList.add(matchParticipantEntity);

        //when
        MatchParticipantVO matchParticipantVO = voMapper.toMatchParticipantVOList(matchParticipantEntityList).get(0);

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
    @DisplayName("Convert MatchParticipant VO TO MatchParticipant Entity")
    public void toMatchParticipantEntity() {
        //given
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

        //when
        MatchParticipantEntity matchParticipantEntity
                = voMapper.toMatchParticipantEntity(matchParticipantVO);

        //then
        assertThat(matchParticipantEntity.getMatchParticipantId().getPuuid()).isEqualTo(puuid);
        assertThat(matchParticipantEntity.getMatchParticipantId().getDataVersion()).isEqualTo(dataVersion);
        assertThat(matchParticipantEntity.getMatchParticipantId().getMatchId()).isEqualTo(matchId);
        assertThat(matchParticipantEntity.getMatchParticipantId().getParticipantId()).isEqualTo(participantId);
        assertThat(matchParticipantEntity.getAssists()).isEqualTo(assists);
        assertThat(matchParticipantEntity.getBaronKills()).isEqualTo(baronKills);
        assertThat(matchParticipantEntity.getBountyLevel()).isEqualTo(bountyLevel);
        assertThat(matchParticipantEntity.getChampExperience()).isEqualTo(champExperience);
        assertThat(matchParticipantEntity.getChampLevel()).isEqualTo(champLevel);
        assertThat(matchParticipantEntity.getChampionId()).isEqualTo(championId);
        assertThat(matchParticipantEntity.getChampionName()).isEqualTo(championName);
        assertThat(matchParticipantEntity.getChampionNameKR()).isEqualTo(championNameKR);
        assertThat(matchParticipantEntity.getChampionImg()).isEqualTo(championImg);
        assertThat(matchParticipantEntity.getChampionTransform()).isEqualTo(championTransform);
        assertThat(matchParticipantEntity.getConsumablesPurchased()).isEqualTo(consumablesPurchased);
        assertThat(matchParticipantEntity.getDamageDealtToBuildings()).isEqualTo(damageDealtToBuildings);
        assertThat(matchParticipantEntity.getDamageDealtToObjectives()).isEqualTo(damageDealtToObjectives);
        assertThat(matchParticipantEntity.getDamageSelfMitigated()).isEqualTo(damageSelfMitigated);
        assertThat(matchParticipantEntity.getDeaths()).isEqualTo(deaths);
        assertThat(matchParticipantEntity.getDetectorWardsPlaced()).isEqualTo(detectorWardsPlaced);
        assertThat(matchParticipantEntity.getDoubleKills()).isEqualTo(doubleKills);
        assertThat(matchParticipantEntity.getDragonKills()).isEqualTo(dragonKills);
        assertThat(matchParticipantEntity.isFirstBloodAssist()).isEqualTo(firstBloodAssist);
        assertThat(matchParticipantEntity.isFirstBloodKill()).isEqualTo(firstBloodKill);
        assertThat(matchParticipantEntity.isFirstTowerAssist()).isEqualTo(firstTowerAssist);
        assertThat(matchParticipantEntity.isFirstTowerKill()).isEqualTo(firstTowerKill);
        assertThat(matchParticipantEntity.isGameEndedInEarlySurrender()).isEqualTo(gameEndedInEarlySurrender);
        assertThat(matchParticipantEntity.isGameEndedInSurrender()).isEqualTo(gameEndedInSurrender);
        assertThat(matchParticipantEntity.getGoldEarned()).isEqualTo(goldEarned);
        assertThat(matchParticipantEntity.getGoldSpent()).isEqualTo(goldSpent);
        assertThat(matchParticipantEntity.getIndividualPosition()).isEqualTo(individualPosition);
        assertThat(matchParticipantEntity.getInhibitorKills()).isEqualTo(inhibitorKills);
        assertThat(matchParticipantEntity.getInhibitorTakedowns()).isEqualTo(inhibitorTakedowns);
        assertThat(matchParticipantEntity.getInhibitorsLost()).isEqualTo(inhibitorsLost);
        assertThat(matchParticipantEntity.getItem0()).isEqualTo(item0);
        assertThat(matchParticipantEntity.getItem1()).isEqualTo(item1);
        assertThat(matchParticipantEntity.getItem2()).isEqualTo(item2);
        assertThat(matchParticipantEntity.getItem3()).isEqualTo(item3);
        assertThat(matchParticipantEntity.getItem4()).isEqualTo(item4);
        assertThat(matchParticipantEntity.getItem5()).isEqualTo(item5);
        assertThat(matchParticipantEntity.getItem6()).isEqualTo(item6);
        assertThat(matchParticipantEntity.getItemsPurchased()).isEqualTo(itemsPurchased);
        assertThat(matchParticipantEntity.getKillingSprees()).isEqualTo(killingSprees);
        assertThat(matchParticipantEntity.getKills()).isEqualTo(kills);
        assertThat(matchParticipantEntity.getLane()).isEqualTo(lane);
        assertThat(matchParticipantEntity.getLargestCriticalStrike()).isEqualTo(largestCriticalStrike);
        assertThat(matchParticipantEntity.getLargestKillingSpree()).isEqualTo(largestKillingSpree);
        assertThat(matchParticipantEntity.getLongestTimeSpentLiving()).isEqualTo(longestTimeSpentLiving);
        assertThat(matchParticipantEntity.getMagicDamageDealt()).isEqualTo(magicDamageDealt);
        assertThat(matchParticipantEntity.getMagicDamageDealtToChampions()).isEqualTo(magicDamageDealtToChampions);
        assertThat(matchParticipantEntity.getMagicDamageTaken()).isEqualTo(magicDamageTaken);
        assertThat(matchParticipantEntity.getNeutralMinionsKilled()).isEqualTo(neutralMinionsKilled);
        assertThat(matchParticipantEntity.getNexusKills()).isEqualTo(nexusKills);
        assertThat(matchParticipantEntity.getNexusLost()).isEqualTo(nexusLost);
        assertThat(matchParticipantEntity.getNexusTakedowns()).isEqualTo(nexusTakedowns);
        assertThat(matchParticipantEntity.getObjectivesStolen()).isEqualTo(objectivesStolen);
        assertThat(matchParticipantEntity.getObjectivesStolenAssists()).isEqualTo(objectivesStolenAssists);
        assertThat(matchParticipantEntity.getPentaKills()).isEqualTo(pentaKills);
        assertThat(matchParticipantEntity.getPhysicalDamageDealt()).isEqualTo(physicalDamageDealt);
        assertThat(matchParticipantEntity.getPhysicalDamageDealtToChampions()).isEqualTo(physicalDamageDealtToChampions);
        assertThat(matchParticipantEntity.getPhysicalDamageTaken()).isEqualTo(physicalDamageTaken);
        assertThat(matchParticipantEntity.getProfileIcon()).isEqualTo(profileIcon);
        assertThat(matchParticipantEntity.getQuadraKills()).isEqualTo(quadraKills);
        assertThat(matchParticipantEntity.getRiotIdName()).isEqualTo(riotIdName);
        assertThat(matchParticipantEntity.getRiotIdTagline()).isEqualTo(riotIdTagline);
        assertThat(matchParticipantEntity.getRole()).isEqualTo(role);
        assertThat(matchParticipantEntity.getSightWardsBoughtInGame()).isEqualTo(sightWardsBoughtInGame);
        assertThat(matchParticipantEntity.getSpell1Casts()).isEqualTo(spell1Casts);
        assertThat(matchParticipantEntity.getSpell2Casts()).isEqualTo(spell2Casts);
        assertThat(matchParticipantEntity.getSpell3Casts()).isEqualTo(spell3Casts);
        assertThat(matchParticipantEntity.getSpell4Casts()).isEqualTo(spell4Casts);
        assertThat(matchParticipantEntity.getSummoner1Casts()).isEqualTo(summoner1Casts);
        assertThat(matchParticipantEntity.getSummoner1Id()).isEqualTo(summoner1Id);
        assertThat(matchParticipantEntity.getSummoner2Casts()).isEqualTo(summoner2Casts);
        assertThat(matchParticipantEntity.getSummoner2Id()).isEqualTo(summoner2Id);
        assertThat(matchParticipantEntity.getSummonerId()).isEqualTo(summonerId);
        assertThat(matchParticipantEntity.getSummonerLevel()).isEqualTo(summonerLevel);
        assertThat(matchParticipantEntity.getSummonerName()).isEqualTo(summonerName);
        assertThat(matchParticipantEntity.isTeamEarlySurrendered()).isEqualTo(teamEarlySurrendered);
        assertThat(matchParticipantEntity.getTeamId()).isEqualTo(teamId);
        assertThat(matchParticipantEntity.getTeamPosition()).isEqualTo(teamPosition);
        assertThat(matchParticipantEntity.getTimeCCingOthers()).isEqualTo(timeCCingOthers);
        assertThat(matchParticipantEntity.getTimePlayed()).isEqualTo(timePlayed);
        assertThat(matchParticipantEntity.getTotalDamageDealt()).isEqualTo(totalDamageDealt);
        assertThat(matchParticipantEntity.getTotalDamageDealtToChampions()).isEqualTo(totalDamageDealtToChampions);
        assertThat(matchParticipantEntity.getTotalDamageTaken()).isEqualTo(totalDamageTaken);
        assertThat(matchParticipantEntity.getTotalHeal()).isEqualTo(totalHeal);
        assertThat(matchParticipantEntity.getTotalHealsOnTeammates()).isEqualTo(totalHealsOnTeammates);
        assertThat(matchParticipantEntity.getTotalMinionsKilled()).isEqualTo(totalMinionsKilled);
        assertThat(matchParticipantEntity.getTotalTimeCCDealt()).isEqualTo(totalTimeCCDealt);
        assertThat(matchParticipantEntity.getTotalTimeSpentDead()).isEqualTo(totalTimeSpentDead);
        assertThat(matchParticipantEntity.getTotalUnitsHealed()).isEqualTo(totalUnitsHealed);
        assertThat(matchParticipantEntity.getTripleKills()).isEqualTo(tripleKills);
        assertThat(matchParticipantEntity.getTrueDamageDealt()).isEqualTo(trueDamageDealt);
        assertThat(matchParticipantEntity.getTrueDamageDealtToChampions()).isEqualTo(trueDamageDealtToChampions);
        assertThat(matchParticipantEntity.getTrueDamageTaken()).isEqualTo(trueDamageTaken);
        assertThat(matchParticipantEntity.getTurretKills()).isEqualTo(turretKills);
        assertThat(matchParticipantEntity.getTurretTakedowns()).isEqualTo(turretTakedowns);
        assertThat(matchParticipantEntity.getTurretsLost()).isEqualTo(turretsLost);
        assertThat(matchParticipantEntity.getUnrealKills()).isEqualTo(unrealKills);
        assertThat(matchParticipantEntity.getVisionScore()).isEqualTo(visionScore);
        assertThat(matchParticipantEntity.getVisionWardsBoughtInGame()).isEqualTo(visionWardsBoughtInGame);
        assertThat(matchParticipantEntity.getWardsKilled()).isEqualTo(wardsKilled);
        assertThat(matchParticipantEntity.getWardsPlaced()).isEqualTo(wardsPlaced);
        assertThat(matchParticipantEntity.isWin()).isEqualTo(win);
        assertThat(matchParticipantEntity.getRrt()).isEqualTo(rrt);
    }

}
