package com.sym.tickets;


import java.util.List;

public class Cinema {

    private String tittle;
    private String adress;
    private List<Film> films;

    public Cinema(String tittle, String adress, List<Film> films) {
        this.tittle = tittle;
        this.adress = adress;
        this.films = films;
    }

    public Cinema() {

    }



    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cinema{");
        sb.append(", tittle='").append(tittle).append('\'');
        sb.append(", adress='").append(adress).append('\'');
        sb.append(", films=").append(films);
        sb.append('}');
        return sb.toString();
    }
}
