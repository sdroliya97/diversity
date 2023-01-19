package com.blackrock.hack21.drise.dao;

public class Constant {
    private Constant() {
    }

    public static final double associate_ratio = 0.25;
    public static final double vice_president_ratio = 0.15;
    public static final double director_ratio = 0.12;
    public static final double managing_director_ratio = 0.08;
    public static final String analyst = "Analyst";
    public static final String associate = "Associate";
    public static final String vice_president = "Vice President";
    public static final String director = "Director";
    public static final String managing_director = "Managing Director";

    public static final String male = "MALE";
    public static final String female = "FEMALE";
    public static final double gender_Ratio = 0.5;

    public static final String youth = "Age < 25";
    public static final String middle_aged = "Age 25-40";
    public static final String old = "Age > 40";
    public static final double youth_ratio = 0.50;
    public static final double old_ratio = 0.20;

    public static final String fresher = "Exp < 3Y";
    public static final String middle_experienced = "Exp 3Y-8Y";
    public static final String professional = "Exp > 8Y";
    public static final double fresher_ratio = 0.50;
    public static final double high_experienced = 0.1;

    public static final String leavers = "leavers";
    public static final String joiners = "joiners";
    public static final String retention = "retention";
    public static final String promotions = "Promotions";

    public static final double gender_diversity_ratio = 0.40;
    public static final double age_diversity_ratio = 0.30;
    public static final double jobTitle_diversity_ratio = 0.15;
    public static final double experience_diversity_ratio = 0.30;

    public static final String gender_diversity = "genderDiversity_blk";
    public static final String age_diversity = "ageDiversity_blk";
    public static final String jobTitle_diversity = "jobTitleDiversity_blk";
    public static final String experience_diversity = "ExperienceDiversity_blk";

    public static final String gender_diversity_team = "genderDiversity_team";
    public static final String age_diversity_team = "ageDiversity_team";
    public static final String jobTitle_diversity_team = "jobTitleDiversity_team";
    public static final String experience_diversity_team = "ExperienceDiversity_team";

    public static final String gender_diversity_diff = "genderDiversity_diff";
    public static final String age_diversity_diff = "ageDiversity_diff";
    public static final String jobTitle_diversity_diff = "jobTitleDiversity_diff";
    public static final String experience_diversity_diff = "ExperienceDiversity_diff";

}
