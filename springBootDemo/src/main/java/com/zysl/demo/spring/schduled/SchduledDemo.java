package com.zysl.demo.spring.schduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchduledDemo {

    /**
     * 定时任务10s执行一次
     */
    @Scheduled(fixedDelay = 10000)
    public void SchduleDemo1(){
        System.out.println("fixedDelay方式10s执行一次的定时任务！");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("fixedDelay执行定时任务:" + format.format(date));
    }

    @Scheduled(fixedRate = 10000)
    public void SchduleDemo2(){
        System.out.println("fixedRate方式10s执行一次的定时任务！");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("fixedRate执行定时任务:" + format.format(date));
    }

    @Scheduled(cron = "0 40 16 * * ?" )
    public  void SchduleDemo3(){
        System.out.println("16:30执行一次的定时任务！");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("cron执行定时任务:" + format.format(date));
    }
}
