package VisaBankingApp_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class VisaBankingApp_Main {

    public static void main(String[] args) {


        ArrayList<BankingProfile> Profile = new ArrayList<>();

        // Profile 1
        BankingProfile Profile1 = new BankingProfile();
        Profile1.setFullName("John Doe");
        Profile1.setDateOfBirth(LocalDate.of(1985, 6, 15));
        Profile1.setNationality("American");
        Profile1.setContactNumber("+1-123-456-7890");
        Profile1.setEmailAddress("johndoe@example.com");
        Profile1.setAccountNumber("ACC1234567890");
        Profile1.setAccountType("Savings");
        Profile1.setSecurityProfile("Basic");
        Profile1.setCreditScore(750);
        Profile1.setCardType("Credit");

// Profile 2
        BankingProfile Profile2 = new BankingProfile();
        Profile2.setFullName("Jane Smith");
        Profile2.setDateOfBirth(LocalDate.of(1990, 12,05));
        Profile2.setNationality("British");
        Profile2.setContactNumber("+44-20-7946-0958");
        Profile2.setEmailAddress("janesmith@example.co.uk");
        Profile2.setAccountNumber("ACC2233445566");
        Profile2.setAccountType("Checking");
        Profile2.setSecurityProfile("Premium");
        Profile2.setCreditScore(820);
        Profile2.setCardType("Debit");

// Profile 3
        BankingProfile Profile3 = new BankingProfile();
        Profile3.setFullName("Liam Johnson");
        Profile3.setDateOfBirth(LocalDate.of(1995, 9, 25));
        Profile3.setNationality("Canadian");
        Profile3.setContactNumber("+1-647-555-1234");
        Profile3.setEmailAddress("liam.johnson@example.ca");
        Profile3.setAccountNumber("ACC3344556677");
        Profile3.setAccountType("Savings");
        Profile3.setSecurityProfile("Standard");
        Profile3.setCreditScore(700);
        Profile3.setCardType("Credit");

// Profile 4
        BankingProfile Profile4 = new BankingProfile();
        Profile4.setFullName("Emily Brown");
        Profile4.setDateOfBirth(LocalDate.of(1988,03,30));
        Profile4.setNationality("Australian");
        Profile4.setContactNumber("+61-2-9876-5432");
        Profile4.setEmailAddress("emily.brown@example.au");
        Profile4.setAccountNumber("ACC4455667788");
        Profile4.setAccountType("Fixed Deposit");
        Profile4.setSecurityProfile("Basic");
        Profile4.setCreditScore(780);
        Profile4.setCardType("Credit");

// Profile 5
        BankingProfile Profile5 = new BankingProfile();
        Profile5.setFullName("Noah Wilson");
        Profile5.setDateOfBirth(LocalDate.of(2000,01,01));
        Profile5.setNationality("New Zealander");
        Profile5.setContactNumber("+64-21-987-6543");
        Profile5.setEmailAddress("noah.wilson@example.nz");
        Profile5.setAccountNumber("ACC5566778899");
        Profile5.setAccountType("Current");
        Profile5.setSecurityProfile("Premium");
        Profile5.setCreditScore(820);
        Profile5.setCardType("Debit");

// Profile 6
        BankingProfile Profile6 = new BankingProfile();
        Profile6.setFullName("Sophia Martinez");
        Profile6.setDateOfBirth(LocalDate.of(1992, 11,22));
        Profile6.setNationality("Spanish");
        Profile6.setContactNumber("+34-91-123-4567");
        Profile6.setEmailAddress("sophia.martinez@example.es");
        Profile6.setAccountNumber("ACC6677889900");
        Profile6.setAccountType("Savings");
        Profile6.setSecurityProfile("Standard");
        Profile6.setCreditScore(760);
        Profile6.setCardType("Credit");

// Profile 7
        BankingProfile Profile7 = new BankingProfile();
        Profile7.setFullName("James Garcia");
        Profile7.setDateOfBirth(LocalDate.of(1987,8,19));
        Profile7.setNationality("Mexican");
        Profile7.setContactNumber("+52-55-9876-5432");
        Profile7.setEmailAddress("james.garcia@example.mx");
        Profile7.setAccountNumber("ACC7788990011");
        Profile7.setAccountType("Checking");
        Profile7.setSecurityProfile("Basic");
        Profile7.setCreditScore(710);
        Profile7.setCardType("Debit");

// Profile 8
        BankingProfile Profile8 = new BankingProfile();
        Profile8.setFullName("Isabella Lee");
        Profile8.setDateOfBirth(LocalDate.of(1993,07, 11));
        Profile8.setNationality("South Korean");
        Profile8.setContactNumber("+82-10-1234-5678");
        Profile8.setEmailAddress("isabella.lee@example.kr");
        Profile8.setAccountNumber("ACC8899001122");
        Profile8.setAccountType("Savings");
        Profile8.setSecurityProfile("Premium");
        Profile8.setCreditScore(810);
        Profile8.setCardType("Credit");

// Profile 9
        BankingProfile Profile9 = new BankingProfile();
        Profile9.setFullName("Ethan Davis");
        Profile9.setDateOfBirth(LocalDate.of(1984,05, 23));
        Profile9.setNationality("South African");
        Profile9.setContactNumber("+27-83-123-4567");
        Profile9.setEmailAddress("ethan.davis@example.za");
        Profile9.setAccountNumber("ACC9900112233");
        Profile9.setAccountType("Fixed Deposit");
        Profile9.setSecurityProfile("Standard");
        Profile9.setCreditScore(780);
        Profile9.setCardType("Debit");

// Profile 10
        BankingProfile Profile10 = new BankingProfile();
        Profile10.setFullName("Mia Chen");
        Profile10.setDateOfBirth(LocalDate.of(1998,04,16));
        Profile10.setNationality("Chinese");
        Profile10.setContactNumber("+86-10-9876-5432");
        Profile10.setEmailAddress("mia.chen@example.cn");
        Profile10.setAccountNumber("ACC0011223344");
        Profile10.setAccountType("Current");
        Profile10.setSecurityProfile("Premium");
        Profile10.setCreditScore(830);
        Profile10.setCardType("Credit");

        Profile.add(Profile1);
        Profile.add(Profile2);
        Profile.add(Profile3);
        Profile.add(Profile4);
        Profile.add(Profile5);
        Profile.add(Profile6);
        Profile.add(Profile7);
        Profile.add(Profile8);
        Profile.add(Profile9);
        Profile.add(Profile10);

        Collections.sort(Profile);

        System.out.println("Sorted Profiles by Credit Score and Name:");
        for (BankingProfile profile : Profile) {
            System.out.println(profile.getFullName() + " - Credit Score: " + profile.getCreditScore());
        }
    }
    }














