/**
 * 
 */
package gui.window;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Tingle Driftwood
 *
 */
public class ErrorMessage {
	
	
	public void showErrorMessage(String message){
		final Stage dialog = new Stage();
        dialog.setTitle("Tingle's Log Parser - System Message");
        dialog.setResizable(false);

//        Image img = new Image("pic/skull.png");
//        ImageView iView = new ImageView();
//        iView.setImage(image);
        
        FlowPane buttons = new FlowPane(10,10);
        buttons.setAlignment(Pos.CENTER);
        Button okBtn = new Button("Ok");
        okBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dialog.close();
			}
		});
        buttons.getChildren().addAll(okBtn);
        
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().addAll(new Label(message), buttons);

        Scene s = new Scene(box);
        dialog.setScene(s);
        dialog.show();
	}

}
