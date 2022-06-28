/**
 * Sample Skeleton for 'FillingComplaint.fxml' Controller Class
 */

package il.cshaifasweng.OCSFMediatorExample.client;

//import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class FillingComplaintController {

	@FXML // fx:id="Send_the_complaint"
	private Button Send_the_complaint; // Value injected by FXMLLoader

	@FXML // fx:id="Back_to_home"
	private Button Back_to_home; // Value injected by FXMLLoader

	@FXML
	void backPrimary(ActionEvent event) throws IOException {
		Window window = ((Node) (event.getSource())).getScene().getWindow();
		if (window instanceof Stage) {
			((Stage) window).close();
		}

		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Home");
		primaryStage.show();

	}

	@FXML
	void sendComplaintandhome(ActionEvent event) throws IOException {
		// awl eshi lazm nnade 3la fonktsyat l send complaint mn hdlak lawlad
		Window window = ((Node) (event.getSource())).getScene().getWindow();
		if (window instanceof Stage) {
			((Stage) window).close();
		}

		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Home");
		primaryStage.show();

	}

}
