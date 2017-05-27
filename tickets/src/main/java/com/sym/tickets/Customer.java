package com.sym.tickets;


public class Customer {

    private String firstName;
    private String lastName;
    private String middleName;
    private String taxid;
    private String reputation;

    public Customer(String firstName, String lastName, String middleName, String taxid, String reputation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.taxid = taxid;
        this.reputation = reputation;
    }

    public Customer() {
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

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", taxid='").append(taxid).append('\'');
        sb.append(", reputation='").append(reputation).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
