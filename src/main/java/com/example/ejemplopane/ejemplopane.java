package com.example.ejemplopane;

// Programa Java para crear un Pane
// y añadir un label al Pane
// y añadirlo a un Stage
import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.control.*;
        import javafx.stage.Stage;
        import javafx.scene.layout.Pane;

public class ejemplopane extends Application {
    // Lanzar la aplicacion
    public void start(Stage stage)
    {
        try {
            // Nombrar titulo para el Stage
            stage.setTitle("Pane");
            // Crear un label
            Label label = new Label("this is Pane example");
            // Crear un Pane
            Pane pane = new Pane(label);
            // Crear scene
            Scene scene = new Scene(pane, 400, 300);
            // Establecer scene
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // Metodo principal
    public static void main(String args[])
    {
        // Lanzar la aplicacion
        launch(args);
    }
}