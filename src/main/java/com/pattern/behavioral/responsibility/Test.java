package com.pattern.behavioral.responsibility;

/**
 * Description:TODO
 * Create Time:2019/1/18 23:47
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Test {
    public static void main(String[] args) {
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setArticle("JAVA 设计模式文章");
        course.setVideo("JAVA 设计模式 视频");
        course.setName("JAVA 设计模式 课程");
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);

    }
}
