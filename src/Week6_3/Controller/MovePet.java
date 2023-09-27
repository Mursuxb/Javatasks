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

    public void move(double mouseX, double mouseY) {
        double[] petPosition = {pet.getPositionX(), pet.getPositionY()};
        double width = playground.getCanvasWidth()/20;
        double height = playground.getCanvasHeight()/20;
        if (inArea) {
            if (pet.getPositionX() < mouseX && pet.getPositionX() < width) {
                pet.move(1, 0);
                petPosition[0] = pet.getPositionX();
            } else if (pet.getPositionX() > mouseX && pet.getPositionX() > 0) {
                pet.move(-1, 0);
                petPosition[0] = pet.getPositionX();
            }
            if (pet.getPositionY() < mouseY && pet.getPositionY() < height) {
                pet.move(0, 1);
                petPosition[1] = pet.getPositionY();
            } else if (pet.getPositionY() > mouseY && pet.getPositionY() > 0) {
                pet.move(0, -1);
                petPosition[1] = pet.getPositionY();
            }
//            playground.updateCanvas(petPosition[0], petPosition[1]);
        }
    }

    public void mouseInArea() {
        inArea = true;
    }

    public void mouseOutArea() {
        inArea = false;
    }
}
