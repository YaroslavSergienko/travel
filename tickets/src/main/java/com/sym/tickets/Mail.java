package com.sym.tickets;


public class Mail {

    private String code;
    private String mail;

    Mail(String id, String mail) {
        this.code = id;
        this.mail = mail;
    }

    public Mail() {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mail{");
        sb.append("code='").append(code).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
