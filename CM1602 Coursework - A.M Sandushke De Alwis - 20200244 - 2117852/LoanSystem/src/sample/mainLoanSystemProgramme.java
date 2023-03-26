package sample;

import java.util.Scanner;

public class mainLoanSystemProgramme {
    public static void main(String[] args) {
        String enterChoice;
        String decision = "";
        int count= 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("....................Welcome to Hatton National Bank Loan Systems..............");
        System.out.print("Normal customer - [A] \nInner customer -  [B] \nHigh priority customer - [C] ");
        System.out.println("");
        System.out.println("");
        System.out.print("Select customer type: ");
        enterChoice = sc.next();

        if (enterChoice.equals("A")){
            normalCustomer();
        }else if(enterChoice.equals("B")){
            innerCircleCustomers();
        }else if(enterChoice.equals("C")){
            highPriorityCustomers();
        }else{
            System.out.println("Invalid Input!");
        }
    }

    public static void normalCustomer(){
        loanSystemApplication normalCustomers = new loanSystemApplication();
        System.out.println("....................Normal Customer's Loans.................... ");
        normalCustomers.enqueue("Sandushke De Alwis", 752148963,1034569893,"Personal loan","Debt consolidation", "The home or real estate you purchase is often used as collateral when you take out a mortgage");
        normalCustomers.enqueue("Imaya Perera", 795136595,1203654798,"Home equity loan","Moving costs", "The vehicle you purchase is typically used as collateral when you take out a car loan");
        normalCustomers.enqueue("Ishma Perera",853126978,1031965378,"Mortgage","Alternative to a payday loan"," A cash deposit is used as collateral for secured credit cards.");
        normalCustomers.enqueue("Hirushke De Alwis",945783622,1023024589,"Auto loan","Home remodeling", "A valuable item that the lender agrees to use as collateral, such as your home or your savings account");
        String decision;
        int count = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("To enqueue you need to dequeue first");
        System.out.print("Do you want to enqueue: ");
        decision = sc.next();
        if (decision.equals("yes")){
            normalCustomers.dequeue();
            System.out.println("");
            System.out.println("Next Normal Customer's details: ");
            normalCustomers.displayDetailsFrontNode();
        }
        System.out.println("");
        System.out.print("Do you want to dequeue: ");
        decision = sc.next();
        if(decision.equals("yes")){
            System.out.println();
            System.out.println("Previous normal Customer's details: ");
            normalCustomers.displayDetailsRearNode();
        }else if(decision.equals("no")){
            System.out.println("");
        }
        else{
            System.out.println("Error!");
        }
    }


    public static void innerCircleCustomers(){
        loanSystemApplication innerCircleCustomers = new loanSystemApplication ();
        System.out.println("....................Inner Circle Customer's Loans...................... ");
        innerCircleCustomers.enqueue("Ruwinika Perera",876432169,2031265479,"Debt Consolidation loan","Vehicle Financing", "The home or real estate you purchase is often used as collateral when you take out a mortgage");
        innerCircleCustomers.enqueue("Shiran De Alwis",953164789,1023456298,"Boat loan","Wedding Expenses", "The vehicle you purchase is typically used as collateral when you take out a car loan");
        innerCircleCustomers.enqueue("Samantha Perera",984626863,1023459233,"Payday loan","Emergency Expenses", "A cash deposit is used as collateral for secured credit cards");
        innerCircleCustomers.enqueue("Ishani Perera",789432692,2031697854,"Small business loan","Home Improvement and Repairs", "A valuable item that the lender agrees to use as collateral, such as your home or your savings account");
        innerCircleCustomers.enqueue("Shamika Weudagedara",201345695,1110236549,"Title loan","Emergency Cash Assistance", "A cash deposit is used as collateral for secured credit cards");
        innerCircleCustomers.dequeue();
        System.out.println("Next Inner circle Customer's details: ");
        innerCircleCustomers.displayDetailsFrontNode();
        innerCircleCustomers.dequeue();
        System.out.println("Next Inner circle Customer's details: ");
        System.out.println();
        System.out.println("Previous Inner circle Customer's details: ");
        innerCircleCustomers.displayDetailsRearNode();
        System.out.println("");
        System.out.println("Next Normal Customer's details: ");
        innerCircleCustomers.displayDetailsFrontNode();
        System.out.println();
    }


    public static void highPriorityCustomers(){
        loanSystemApplication highPriorityCustomers = new loanSystemApplication();
        System.out.println("....................High Priority Customer's Loans......................");
        highPriorityCustomers.enqueue("Irushi Perera",935387624,203126578,"Recreational vehicle Loan","Vacation costs", "A valuable item that the lender agrees to use as collateral, such as your home or your savings account");
        highPriorityCustomers.enqueue("Chryshall Fonseka",543125978,251345632,"Gold loan","Purchasing of a Land", "The vehicle you purchase is typically used as collateral when you take out a car loan");
        highPriorityCustomers.enqueue("Rushealie Fonseka",726459835,201236546,"Family loan","Relocation to a New City", "A cash deposit is used as collateral for secured credit cards");
        highPriorityCustomers.enqueue("Rushinie Ranasinghe",726459835,201236546,"Family loan","Relocation to a New City", "A cash deposit is used as collateral for secured credit cards");
        highPriorityCustomers.dequeue();
        System.out.println("Next high priority Customer's details: ");
        highPriorityCustomers.displayDetailsFrontNode();
        System.out.println();
        System.out.println("Previous high priority Customer's details: ");
        highPriorityCustomers.displayDetailsRearNode();
        System.out.println("");
        System.out.println("Next Normal Customer's details: ");
        highPriorityCustomers.displayDetailsFrontNode();
    }
}

