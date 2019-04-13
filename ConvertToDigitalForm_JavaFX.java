/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttodigitalform_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author swarnika
 */
public class ConvertToDigitalForm_JavaFX extends Application {

      @Override
            public void start(Stage stage) throws Exception {
                try{
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            // Set the AnchorPane unresizable
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
            }
                catch(Exception e){
                    e.printStackTrace();
                }
            }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}