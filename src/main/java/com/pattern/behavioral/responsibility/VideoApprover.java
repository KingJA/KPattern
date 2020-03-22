package com.pattern.behavioral.responsibility;


/**
 * Description:TODO
 * Create Time:2019/1/18 23:42
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (course.getVideo() != null) {
            System.out.println(course.getName()+"含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含视频，不批准，流程结束");
        }
    }
}
