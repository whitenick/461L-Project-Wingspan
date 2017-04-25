package controllers;

import play.data.validation.Constraints;

public class LsData {

    @Constraints.Required
    private String name;

    @Constraints.Required
    private Integer age;

    public LsData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("LsData(%s, %s)", name, age);
    }

}
