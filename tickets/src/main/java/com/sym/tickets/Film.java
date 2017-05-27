package com.sym.tickets;


public class Film {

    private String name;
    private String about;
    private Integer restriction;

    Film(String name, String about, Integer restriction) {

        this.name = name;
        this.about = about;
        this.restriction = restriction;
    }

    public Film() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getRestriction() {
        return restriction;
    }

    public void setRestriction(Integer restriction) {
        this.restriction = restriction;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film{");

        sb.append(", name='").append(name).append('\'');
        sb.append(", about='").append(about).append('\'');
        sb.append(", restriction='").append(restriction).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
