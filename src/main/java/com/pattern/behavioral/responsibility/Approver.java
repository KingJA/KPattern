package com.pattern.behavioral.responsibility;

/**
 * Description:TODO
 * Create Time:2019/1/18 23:40
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public abstract class Approver {
    protected Approver approver;
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }
    public abstract void deploy(Course course);
}
