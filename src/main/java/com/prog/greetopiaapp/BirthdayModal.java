// file for different database set up not currently used on this version

package com.prog.greetopiaapp;

public class BirthdayModal {
    // variables
    private String recipientName;
    private String recipientAge;
    private int id;

    // creating getter and setter methods
    public String getRecipientName() { return recipientName; }

    public void setRecipientName(String recipientName)
    {
        this.recipientName = recipientName;
    }

    public String getRecipientAge() { return recipientAge; }

    public void setRecipientAge(String recipientAge)
    {
        this.recipientName = recipientName;
    }


//    public int getId() { return id; }
//
//    public void setId(int id) { this.id = id; }

    // constructor
    public BirthdayModal(String recipientName,
                       String recipientAge)
    {
        this.recipientName = recipientName;
        this.recipientAge = recipientAge;
    }
}


