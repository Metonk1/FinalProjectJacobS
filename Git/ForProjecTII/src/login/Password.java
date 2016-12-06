//good for password security
package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Password extends Application{

	@Override
	public void start(Stage stage) throws Exception {

	String file = "management.txt";

	final Label message = new Label("");

	VBox vb = new VBox();
	vb.setPadding(new Insets(10, 0, 0, 10));
	vb.setSpacing(10);
	HBox hb = new HBox();
	hb.setSpacing(10);
	hb.setAlignment(Pos.CENTER_LEFT);

	Label label = new Label("Password");
	final PasswordField pb = new PasswordField();

	pb.setOnAction(new EventHandler<ActionEvent>() {
	    public void handle(ActionEvent e) {
	        if (!pb.getText().equals("T2f$Ay!")) {
	            message.setText("Your password is incorrect!");
	            message.setTextFill(Color.rgb(210, 39, 30));
	        } else {
	            message.setText("Your password has been confirmed");
	            message.setTextFill(Color.rgb(21, 117, 84));
	        }
	        pb.clear();
	    }

	});
	

	hb.getChildren().addAll(label, pb);
	vb.getChildren().addAll(hb, message);
	
	Scene scene = new Scene(vb);
	stage.setScene(scene);
	stage.show();
	
}
	
	public static void main(String[] args){
		launch(args);
	}
}