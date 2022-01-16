package com.lym.design.pattern.behavioral.template.v1;

public abstract class Course {

    public final void doCouse(){
        this.makePPT();
        this.packgeCourse();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("制作手记");
    }

    abstract void packgeCourse();

    protected boolean needWriteArticle(){
        return false;
    }
}
