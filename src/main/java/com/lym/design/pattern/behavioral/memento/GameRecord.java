package com.lym.design.pattern.behavioral.memento;

import lombok.Data;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName GameRecordManagement.java
 * @Description 游戏记录管理者
 * @createTime 2022-05-08 19:05
 */
@Data
public class GameRecord {

    int id;

    int hp; //血量

    int coin; // 硬币

    int mp; //蓝量

    int level; //等级

    void getCurrent(int id){
        System.out.println("hp:"+hp+",coin"+coin+",mp"+mp+",level"+level);
    }
}
