//package sample;
//
//public class loanSystem {
//
//    // Creating a class to portray a queue
//    // frontNode reserve the front node of Linked Lists and rearNode reserve the last node of Linked List
//
//    QNode
//            frontNode,
//            rearNode;
//
//    public loanSystem() {
//        this.frontNode =
//                this.rearNode =
//                        null;
//    }
//
//    // Creating a Method to add loan details to the queue
//    public void enQueue(String accHolderName, int NIC, int accountNo, String loanType, String reasonForApplyingTheLoan) {
//
//        // Creating a new Linked List node
//        QNode
//                loanApp =
//                new QNode(accHolderName, NIC, accountNo, loanType, reasonForApplyingTheLoan);
//
//        if (this.rearNode == null) {
//            this.frontNode =
//                    this.rearNode =
//                            loanApp;
//            return;
//        }
//
//        this.rearNode.next =
//                loanApp;
//        this.rearNode =
//                loanApp;
//    }
//
//    // Creating a Method to delete a loan application from queue.
//    public void deQueue() {
//
//        if (this.frontNode == null)
//            return;
//
//        QNode
//                temp =
//                this.frontNode;
//        this.frontNode =
//                this.frontNode.next;
//
//
//        if (this.frontNode == null)
//            this.rearNode =
//                    null;
//    }
//
//    public void displayDetailsFrontNode() {
//        System.out.println("Account Holder's name: " + this.frontNode.accHolderName);
//        System.out.println("Customer's NIC No: " + this.frontNode.NIC);
//        System.out.println("Customer's bank account No: " + this.frontNode.accountNo);
//        System.out.println("Type of the Loan: " + this.frontNode.loanType);
//        System.out.println("Reason for the loan: " + this.frontNode.reasonForApplyingTheLoan);
//
//    }
//
//    public void displayDetailsRearNode() {
//        System.out.println("Account Holder's name: " + this.rearNode.accHolderName);
//        System.out.println("Customer's NIC No: " + this.rearNode.NIC);
//        System.out.println("Customer's bank account No: " + this.rearNode.accountNo);
//        System.out.println("Type of the Loan: " + this.rearNode.loanType);
//        System.out.println("Reason for the loan: " + this.rearNode.reasonForApplyingTheLoan);
//    }
//
//    // LL node
//    static class QNode {
//        String
//                accHolderName;
//        int
//                NIC;
//        int
//                accountNo;
//        String
//                loanType;
//        String
//                reasonForApplyingTheLoan;
//        QNode
//                next;
//
//        // constructor
//        public QNode(int accHolderName, int NIC, String accNo, String loanType, String reasonForApplyingTheLoan) {
//            this.accHolderName =
//                    accHolderName;
//            this.NIC =
//                    NIC;
//            this.accountNo =
//                    accNo;
//            this.loanType =
//                    loanType;
//            this.reasonForApplyingTheLoan =
//                    reasonForApplyingTheLoan;
//            this.next =
//                    null;
//        }
//    }
//}
//
