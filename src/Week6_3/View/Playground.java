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

    private double mouseX = 0, mouseY = 0;
    private boolean inArea = false;
    private int canvasWidth = 800;
    private int canvasHeight = 800;
    private Canvas canvas;
    private GraphicsContext gc;
    private MovePet controller;
    private double xPosition = 0, yPosition = 0;

    private double imageWidth = 860 / 8;
    private double imageHeight = 555 / 8;
    private Image hamster = new Image("hamster.png", imageWidth, imageHeight, true, false);


    @Override
    public void start(Stage primaryStage) {
        controller = new MovePet(this, new Pet(canvasHeight / 2, canvasWidth / 2));
        canvas = new Canvas(canvasHeight, canvasWidth);
        gc = canvas.getGraphicsContext2D();

        gc.drawImage(hamster, xPosition, yPosition);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, canvasHeight, canvasWidth);
        primaryStage.setTitle("Canvas Demo");
        primaryStage.setScene(scene);
        primaryStage.show();


        canvas.setOnMouseMoved(event -> {
            mouseX = event.getX();
            mouseY = event.getY();
//            double[] petPosition = controller.move(x, y);
            controller.move(mouseX, mouseY);
//            System.out.println("Mouse moved to (" + mouseX + ", " + mouseY + ")");
        });
        canvas.setOnMouseEntered(event -> {
            controller.mouseInArea();
            inArea = true;
            System.out.println("Mouse entered canvas");
        });
        canvas.setOnMouseExited(event -> {
            controller.mouseOutArea();
            inArea = false;
            System.out.println("Mouse exited canvas");
        });
    }

    public int getCanvasHeight() {
        return canvasHeight;
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }

    public void updateCanvas(double playerX, double playerY) {
        gc.clearRect(0, 0, canvasHeight, canvasWidth);
        double x = playerX;
        double y = playerY;
        gc.drawImage(hamster, x, y, imageWidth, imageHeight);
        if (x != mouseX || y != mouseY) {
            controller.move(mouseX, mouseY);
        }
    }
}