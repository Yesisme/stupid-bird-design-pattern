package com.lym.design.pattern.template.v1;

public class FECourse extends Course{

    private boolean needWriteArticle;

    public FECourse(){}

    public FECourse(boolean needWriteArticle){
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packgeCourse() {
        System.out.println("提供前端图片多媒体视频");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticle;
    }
}
