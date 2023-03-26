package sample;

public class loanSystemApplication {
    loanSystemApplication.QNode fNode, rNode;

    public loanSystemApplication() {
        this.fNode = this.rNode = null;
    }

    // Creating a Method to add loan details to the queue
    void enqueue(String Name, int NIC, int accountNumber, String loanType, String reasonForApplyingTheLoan, String descriptionOfCollateral) {

        // Creating a new Linked List node
        QNode loanAppSystem = new QNode(Name, NIC, accountNumber, loanType, reasonForApplyingTheLoan, descriptionOfCollateral);

        // If queue is empty, then new node is front and rear both
        if (this.rNode == null) {
            this.fNode = this.rNode = loanAppSystem;
            return;
        }

        // Add the new node at the end of the queue and change rear
        this.rNode.next = loanAppSystem;
        this.rNode = loanAppSystem;
    }

    // Creating a Method to delete a loan application from queue.
    public void dequeue() {
        // If queue is empty, return Null
        if (this.fNode == null)
            return;

        // Store previous front and move front one node ahead
        QNode temp = this.fNode;
        this.fNode = this.fNode.next;

        // If front becomes nULL, then change rear also as NULL
        if (this.fNode == null)
            this.rNode = null;
    }

    public int displayDetailsFrontNode() {
        System.out.println("Customers Name: " + this.fNode.Name);
        System.out.println("Customers NIC No: " + this.fNode.NIC);
        System.out.println("Customers bank account No: " + this.fNode.accountNumber);
        System.out.println("Type of the Loan: " + this.fNode.loanType);
        System.out.println("Reason for taking the loan: " + this.fNode.reasonForApplyingTheLoan);
        System.out.println("Description Collateral: " + this.fNode.descriptionCollateral);
        return 0;
    }

    public void displayDetailsRearNode() {
        System.out.println("Customers NIC No: " + this.rNode.Name);
        System.out.println("Customers NIC No: " + this.rNode.NIC);
        System.out.println("Customers bank account No: " + this.rNode.accountNumber);
        System.out.println("Type of the Loan: " + this.rNode.loanType);
        System.out.println("Reason for taking the loan: " + this.rNode.reasonForApplyingTheLoan);
        System.out.println("Description Collateral: " + this.rNode.descriptionCollateral);
    }

    // Creating a Linked list Node
    class QNode {
        String Name;
        int NIC;
        int accountNumber;
        String loanType;
        String reasonForApplyingTheLoan;
        String descriptionCollateral;
        QNode next;

        // Creating a constructor to create a new linked list node
        public QNode(String name, int NIC, int accNumber, String loanType, String reasonForApplyingTheLoan, String descriptionCollateral) {
            this.Name = name;
            this.NIC = NIC;
            this.accountNumber = accNumber;
            this.loanType = loanType;
            this.reasonForApplyingTheLoan = reasonForApplyingTheLoan;
            this.descriptionCollateral = descriptionCollateral;
            this.next = null;
        }
    }
}
