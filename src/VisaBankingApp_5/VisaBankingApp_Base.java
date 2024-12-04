package VisaBankingApp_5;

import java.time.LocalDate;

public class VisaBankingApp_Base  {

    private String fullName;
    private LocalDate dateOfBirth;
    private String nationality;
    private int contactNumber;
    private String emailAddress;
    private int accountNumber;
    private String accountType;
    private String securityProfile;
    private int creditScore;
    private String CardType;


    public VisaBankingApp_Base(String fullName, LocalDate dateOfBirth, String nationality, int contactNumber, String emailAddress, int accountNumber, String accountType, String securityProfile, int creditScore, String cardType) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.securityProfile = securityProfile;
        this.creditScore = creditScore;
        CardType = cardType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getSecurityProfile() {
        return securityProfile;
    }

    public void setSecurityProfile(String securityProfile) {
        this.securityProfile = securityProfile;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }
}
