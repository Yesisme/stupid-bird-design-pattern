package com.lym.design.pattern.behavioral.memento;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Random;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName PlayGame.java
 * @Description
 * @createTime 2022-05-08 19:07
 */
@Data
public class Player {

    Integer hp; //血量

    Integer coin; // 硬币

    Integer mp; //蓝量

    Integer level; //等级

    GameServer gameServer = new GameServer();

    void saveRecord() throws Exception {

        GameRecord gameRecord = new GameRecord();
        BeanUtils.copyProperties(gameRecord,this);

        gameServer.add(gameRecord);
    }


    GameRecord getFormMemento(Integer id){
        final GameRecord gameRecord = gameServer.get(id);
        final String record = gameRecord.toString();
        System.out.println("游戏记录============>:{}"+record);
        return gameServer.get(id);
    }


    void exitGame() throws Exception {
        System.out.println("开始退出游戏,准备存档。。。");
        saveRecord();
    }


    void playGame(){
        int i = new Random().nextInt(1000);
        System.out.println("play game start "+i);
        hp = i;
        coin = i;
        mp=i;
        level = i;
    }

}
