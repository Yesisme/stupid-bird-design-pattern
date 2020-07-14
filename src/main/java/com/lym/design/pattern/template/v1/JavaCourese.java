package com.lym.design.pattern.template.v1;

public class JavaCourese extends Course{

    private boolean needWriteArticle;

    public JavaCourese (){}

    public JavaCourese (boolean needWriteArticle){
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packgeCourse() {
        System.out.println("提供java课程源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticle;
    }
}
