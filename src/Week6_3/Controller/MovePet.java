package Week6_3.Controller;

import Week6_3.Model.Pet;
import Week6_3.View.Playground;

public class MovePet {
    private Playground playground;
    private Pet pet;
    private boolean inArea = false;

    public MovePet(Playground playground, Pet pet) {
        this.playground = playground;
        this.pet = pet;
    }

//    public void move(double mouseX, double mouseY) {
//        double[] petPosition = {pet.getPositionX(), pet.getPositionY()};
//        double width = playground.getCanvasWidth();
//        double height = playground.getCanvasHeight();
//        if (inArea) {
//            if (pet.getPositionX() < mouseX && pet.getPositionX() < width) {
//                pet.move(0.5, 0);
//                petPosition[0] = pet.getPositionX();
//            } else if (pet.getPositionX() > mouseX && pet.getPositionX() > 0) {
//                pet.move(-0.5, 0);
//                petPosition[0] = pet.getPositionX();
//            }
//            if (pet.getPositionY() < mouseY && pet.getPositionY() < height) {
//                pet.move(0, 0.5);
//                petPosition[1] = pet.getPositionY();
//            } else if (pet.getPositionY() > mouseY && pet.getPositionY() > 0) {
//                pet.move(0, -0.5);
//                petPosition[1] = pet.getPositionY();
//            }
//            playground.updateCanvas(petPosition[0], petPosition[1]);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
public void move(double mouseX, double mouseY) {
    double[] petPosition = {pet.getPositionX(), pet.getPositionY()};
    double width = playground.getCanvasWidth();
    double height = playground.getCanvasHeight();

    if (inArea) {
        double speed = 0.002; // Adjust this to control the speed of movement

        while (pet.getPositionX() != mouseX || pet.getPositionY() != mouseY) {
            double dx = mouseX - pet.getPositionX();
            double dy = mouseY - pet.getPositionY();

            // Calculate the distance to the target
            double distance = Math.sqrt(dx * dx + dy * dy);

            // Calculate the percentage of completion
            double percentComplete = speed / distance;

            // Update the pet's position based on percent completion
            pet.move(dx * percentComplete, dy * percentComplete);
            petPosition[0] = pet.getPositionX();
            petPosition[1] = pet.getPositionY();

            // Update the canvas and sleep for a short time
            playground.updateCanvas(petPosition[0], petPosition[1]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

    public void mouseInArea() {
        inArea = true;
    }

    public void mouseOutArea() {
        inArea = false;
    }
}
