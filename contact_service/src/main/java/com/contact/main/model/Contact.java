package com.contact.main.model;

public class Contact {
    private Long cId;
    private String emailId;
    private String contactName;
    private Long userId;

    public Contact() {
    }

    public Contact(Long cId, String emailId, String contactName, Long userId) {
        this.cId = cId;
        this.emailId = emailId;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
