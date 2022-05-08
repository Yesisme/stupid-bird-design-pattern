package com.lym.design.pattern.behavioral.memento;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName GameServer.java
 * @Description
 * @createTime 2022-05-08 19:06
 */
public class GameServer {

    Map<Integer,GameRecord>  map = new HashMap<>();
    int i = 1;
    void add(GameRecord gameRecord){
        gameRecord.setId(i);
        map.put(i,gameRecord);
        i++;
    }

    GameRecord get(Integer id){
        return map.get(id);
    }


}
