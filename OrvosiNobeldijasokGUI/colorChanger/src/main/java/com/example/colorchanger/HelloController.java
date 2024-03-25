package com.example.colorchanger;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class HelloController {
    @FXML
    private Circle circle, circle2;

    @FXML
    private Rectangle rectangle, rectangle2;

    @FXML
    private Ellipse ellipse;

    @FXML
    private ColorPicker cottonPicker;

    @FXML
    private Slider sliderHorizontal, sliderVertical;

    @FXML
    private ImageView img;

    @FXML
    private void changeCircleColor(){
        circle.setFill(randomColor());
    }

    @FXML
    private void changeRectangleColor(){
        rectangle.setFill(randomColor());
    }

    @FXML
    private void changeEllipseWidthAndColor(){
        Random rand = new Random();
        ellipse.setStrokeWidth(rand.nextInt());
    }

    @FXML
    private void changeCircle2Color(){
        circle2.setFill(cottonPicker.getValue());
    }

    @FXML
    private void changeRectangle2Width(){
        rectangle2.setWidth(sliderHorizontal.getValue());
    }

    @FXML
    private void changeRectangle2Height(){
        rectangle2.setHeight(sliderVertical.getValue());
    }



    @FXML
    private Color randomColor() {
        Random rand = new Random();
        return Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

    }
}