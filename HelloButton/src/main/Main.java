package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage ikkuna) throws Exception {
        Button helloNappi = new Button("Hello");
        helloNappi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello");
            }
        });

        StackPane ryhma = new StackPane();
        ryhma.getChildren().add(helloNappi);

        Scene nakyma = new Scene(ryhma, 400, 400);

        ikkuna.setTitle("Hello");
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
