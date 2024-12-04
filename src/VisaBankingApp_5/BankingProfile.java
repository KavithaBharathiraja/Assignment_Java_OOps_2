package VisaBankingApp_5;

import java.time.LocalDate;

public class BankingProfile implements Comparable<BankingProfile>{

    //comparable<BankingProfile>

        private String fullName;
        private LocalDate dateOfBirth;
        private String nationality;
        private String contactNumber;
        private String emailAddress;
        private String accountNumber;
        private String accountType;
        private String securityProfile;
        private int creditScore;
        private String cardType;

        public BankingProfile(String fullName, LocalDate dateOfBirth, String nationality, String contactNumber, String emailAddress, String accountNumber, String accountType, String securityProfile, int creditScore, String cardType) {
                this.fullName = fullName;
                this.dateOfBirth = dateOfBirth;
                this.nationality = nationality;
                this.contactNumber = contactNumber;
                this.emailAddress = emailAddress;
                this.accountNumber = accountNumber;
                this.accountType = accountType;
                this.securityProfile = securityProfile;
                this.creditScore = creditScore;
                this.cardType = cardType;
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

        public String getContactNumber() {
                return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
                this.contactNumber = contactNumber;
        }

        public String getEmailAddress() {
                return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
        }

        public String getAccountNumber() {
                return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
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
                return cardType;
        }

        public void setCardType(String cardType) {
                this.cardType = cardType;
        }

        // No-argument constructor
        public BankingProfile() {

        }

        @Override
        public int compareTo(BankingProfile other) {
                // Sort primarily by credit score in descending order
                int creditComparison = Integer.compare(other.creditScore, this.creditScore);
                if (creditComparison != 0) {
                        return creditComparison;
                }
                // If credit score is the same, sort by full name in ascending order
                return this.fullName.compareTo(other.fullName);
        }
}
