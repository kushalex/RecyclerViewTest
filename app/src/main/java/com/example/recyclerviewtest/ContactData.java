package com.example.recyclerviewtest;

public class ContactData {
    String contactName;
    String contactPhone;
    int contactImage;

    public ContactData(String contactName, String contactPhone, int contactImage) {
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactImage = contactImage;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public int getContactImage() {
        return contactImage;
    }
}
