package com.sym.notification;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Emails")
public class Email {

    @Id
    private String id;
    private String code;
    private String duration;
    private String firstName;
    private String lastName;
    private String middleName;
    private String taxid;
    private String body;
    private String text;
    private String tittle;
    private String adress;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Email() {

    }

    public Email(String id, String code, String duration, String firstName, String lastName, String middleName, String taxid, String body, String text, String tittle, String adress, String filmName) {

        this.id = id;
        this.code = code;
        this.duration = duration;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.taxid = taxid;
        this.body = body;
        this.text = text;
        this.tittle = tittle;
        this.adress = adress;
        this.filmName = filmName;
    }

    private String filmName;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Email{");
        sb.append("id='").append(id).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", duration='").append(duration).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", taxid='").append(taxid).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", tittle='").append(tittle).append('\'');
        sb.append(", adress='").append(adress).append('\'');
        sb.append(", filmName='").append(filmName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
