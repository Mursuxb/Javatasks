package Week6_3.View;

import Week6_3.Controller.MovePet;
import Week6_3.Model.Pet;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Playground extends Application {

    private int canvasWidth = 800;
    private int canvasHeight = 800;
    private static final int CELL_SIZE = 20;
    private Canvas canvas;
    private GraphicsContext gc;
    private MovePet controller;

    @Override
    public void start(Stage primaryStage) {
        controller = new MovePet(this, new Pet(canvasHeight / 2, canvasWidth / 2));
        canvas = new Canvas(canvasHeight, canvasWidth);
        gc = canvas.getGraphicsContext2D();
        Image hamster = new Image("hamster.png", true);
        gc.drawImage(hamster, 0, 0, 20, 20);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, canvasHeight, canvasWidth);
        primaryStage.setTitle("Canvas Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

        canvas.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();
//            double[] petPosition = controller.move(x, y);
            controller.move(x, y);
            System.out.println("Mouse moved to (" + x + ", " + y + ")");
        });
        canvas.setOnMouseEntered(event -> {
            controller.mouseInArea();
            System.out.println("Mouse entered canvas");
        });
        canvas.setOnMouseExited(event -> {
            controller.mouseOutArea();
            System.out.println("Mouse exited canvas");
        });
    }

    public int getCanvasHeight() {
        return canvasHeight;
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }

//    public void updateCanvas(double playerX, double playerY) {
//        gc.clearRect(10, 10, canvasHeight, canvasWidth);
//
//        gc.setFill(Color.RED);
//        double x = playerX * CELL_SIZE;
//        double y = playerY * CELL_SIZE;
//        gc.fillRect(x, y, CELL_SIZE, CELL_SIZE);
//    }
}