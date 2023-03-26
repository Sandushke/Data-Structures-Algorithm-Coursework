package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button playNextButton;

    @FXML
    private Button normalCustomerButton;

    @FXML
    private Button innerCustomerButton;

    @FXML
    private Button highCustomerButton;

    @FXML
    private Button submitButton;

    @FXML
    private Button backButton;

    @FXML
    private Button backButton2;

    @FXML
    private Button quitButton;

   @FXML
   private TextField Name;

    @FXML
    private TextField NICNUmber;

    @FXML
    private TextField AccountNumber;

    @FXML
    private TextField LoanType;

    @FXML
    private TextField LoanReason;

    @FXML
    private TextField Collateral;

    @FXML
    private TextArea receipt;


    public void mainPage() throws IOException {
        Stage stage = (Stage) playNextButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("secondpage.fxml"));
        primaryStage.setTitle("Customer Type Form");
        primaryStage.setScene(new Scene(root, 720, 720));
        primaryStage.show();
    }

    public void secondPage() throws IOException {
        Stage stage = (Stage) normalCustomerButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample_page2.fxml"));
        primaryStage.setTitle("Loan Form Page");
        primaryStage.setScene(new Scene(root, 720, 720));
        primaryStage.show();
    }

    public void secondPage2() throws IOException {
        Stage stage = (Stage) innerCustomerButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample_page2.fxml"));
        primaryStage.setTitle("Loan Form Page");
        primaryStage.setScene(new Scene(root, 720, 720));
        primaryStage.show();
    }

    public void secondPage3() throws IOException {
        Stage stage = (Stage) highCustomerButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample_page2.fxml"));
        primaryStage.setTitle("Loan Form Page");
        primaryStage.setScene(new Scene(root, 720, 720));
        primaryStage.show();
    }
    public void page2_backButton() throws IOException {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Main Page");
        primaryStage.setScene(new Scene(root, 720, 428));
        primaryStage.show();
    }

    public void secondPageBackButton() throws IOException {
        Stage stage = (Stage) backButton2.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("secondpage.fxml"));
        primaryStage.setTitle("Loan Form Page");
        primaryStage.setScene(new Scene(root, 720, 720));
        primaryStage.show();
    }

    public void secondPageSubmitButton() throws IOException {
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("LoanOutput.fxml"));
        primaryStage.setTitle("Loan Form Page");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }

    public void viewClosePage(){
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }

}
