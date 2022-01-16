package com.lym.design.pattern.creational.build.v3;

public class Home {

    private String build1;

    private String build2;

    private String build3;

    private String build4;

    public Home(HomeBuild build) {
        this.build1 = build.build1;
        this.build2 = build.build2;
        this.build3 = build.build3;
        this.build4 = build.build4;
    }

    public static class HomeBuild {

        private String build1;

        private String build2;

        private String build3;

        private String build4;

        public HomeBuild build1(String build1) {
            this.build1 = build1;
            return this;
        }

        public HomeBuild build2(String build2) {
            this.build2 = build2;
            return this;
        }


        public HomeBuild build3(String build3) {
            this.build3 = build3;
            return this;
        }

        public HomeBuild build4(String build4) {
            this.build4 = build4;
            return this;
        }

        public Home build() {
            return new Home(this);
        }
    }

    @Override
    public String toString() {
        return "Home{" +
                "build1='" + build1 + '\'' +
                ", build2='" + build2 + '\'' +
                ", build3='" + build3 + '\'' +
                ", build4='" + build4 + '\'' +
                '}';
    }
}
