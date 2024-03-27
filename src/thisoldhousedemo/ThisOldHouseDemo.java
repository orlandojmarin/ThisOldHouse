/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thisoldhousedemo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

/**
 *
 * @author orlandomarin
 */

/*
DIRECTIONS FROM BLACKBOARD: Using constructs from this chapter or earlier, complete
Programming Challenges #1, on p995.
In addition to drawing the house as specified, add some landscaping (use your
imagination) and add the sun or the moon (any phase). If drawing the sun, 
consider drawing an eclipse of the sun with the moon.

In addition to your program running correctly, you will be graded on:
Use of comments. Your program needs to be properly commented.
Use of appropriate variable names.
Use of proper formatting of your output.
Your GUI layout.

Each class should be in a separate file (except for event listeners).

When you are done, find the source file(s) in the project directory, find your
java file(s) there and attach them to this assignment. You also need to include
a screenshot of the results. Your screenshot needs to display your name
somewhere in the results.
*/

/*
INSTRUCTIONS FROM BOOK (Chapter 14 #1 - This Old House): Use the basic shapes 
you learned in this chapter to draw a house. Be sure to include at least two 
windows and a door. Feel free to draw other objects as well, such as the sky, 
sun, and even clouds.
*/


public class ThisOldHouseDemo extends Application
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        // constants for the scene size
        
        final double sceneWidth = 600.0;
        final double sceneHeight = 600.0;
        
        // set the stage title
        
        primaryStage.setTitle("This Old House: by Orlando Marin");
        
        // draw the lines and shapes
        // SKY
        /* 
        create rectangle for sky that starts at (0,0) with a width of 600
        and a height of 550
        make the sky light blue
        */
        
        Rectangle sky = new Rectangle(0, 0, 600, 550);
        sky.setFill(Color.LIGHTSKYBLUE);
        
        // SUN
        /*
        create a sun using the circle class with the center at (500, 100) 
        and a radius of 50 and make the sun yellow
        */
        
        Circle sun = new Circle(500, 100, 50, Color.YELLOW);
        
        // GRASS
        /* 
        create rectangle for grass that starts at (0,550) with a width of 600
        and a height of 50
        make the grass green
        */ 
        
        Rectangle grass = new Rectangle(0, 550, 600, 50);
        grass.setFill(Color.LIGHTGREEN);
        
        // LEFT TREE BASE
        /* 
        create a rectangle for the base of the left tree with it's upper left 
        corner at (50, 500), with a width of 50 and a height of 100
        make the tree base brown
        */
        
        Rectangle treeBaseLeft = new Rectangle(50, 500, 50, 100);
        treeBaseLeft.setFill(Color.BROWN);
        
        // RIGHT TREE BASE
         /* 
        create a rectangle for the base of the left tree with it's upper left 
        corner at (500, 500), with a width of 50 and a height of 100
        make the tree base brown
        */
         
        Rectangle treeBaseRight = new Rectangle(500, 500, 50, 100);
        treeBaseRight.setFill(Color.BROWN);
        
        // LEFT TREE TOP (3 GREEN CIRCLES)
        /* 
        create circle1 for the top of the left tree with a center location of 
        (75, 475) and a radius of 25
        */
        
        Circle leftTreeTopCircle1 = new Circle(75, 475, 25);
        leftTreeTopCircle1.setFill(Color.GREEN);
        
        /* 
        create circle2 for the top of the left tree with a center location of 
        (50, 500) and a radius of 25
        */
        
        Circle leftTreeTopCircle2 = new Circle(50, 500, 25);
        leftTreeTopCircle2.setFill(Color.GREEN);
        
        /* 
        create circle3 for the top of the left tree with a center location of 
        (100, 500) and a radius of 25
        */
        
        Circle leftTreeTopCircle3 = new Circle(100, 500, 25);
        leftTreeTopCircle3.setFill(Color.GREEN);
        
        // RIGHT TREE TOP (3 GREEN CIRCLES)
        /* 
        create circle1 for the top of the right tree with a center location of
        (525, 475) and a radius of 25
        */
        
        Circle rightTreeTopCircle1 = new Circle(525, 475, 25);
        rightTreeTopCircle1.setFill(Color.GREEN);
        
        /* 
        create circle2 for the top of the right tree with a center location of
        (500, 500) and a radius of 25
        */
        
        Circle rightTreeTopCircle2 = new Circle(500, 500, 25);
        rightTreeTopCircle2.setFill(Color.GREEN);
        
        /* 
        create circle3 for the top of the right tree with a center location of
        (550, 500) and a radius of 25 
        */
        
        Circle rightTreeTopCircle3 = new Circle(550, 500, 25);
        rightTreeTopCircle3.setFill(Color.GREEN);
        
        // HOUSE
        /*
        create a rectangle for the base of the house
        make the house base color ivory and the outline black
        */
        
        Rectangle houseBase = new Rectangle(150, 400, 300, 200);
        houseBase.setFill(Color.IVORY);
        houseBase.setStroke(Color.BLACK);
        
        /*
        create a polygon / triangle for the roof of the house
        make the house roof color ivory and the outline black
        */
        
        Polygon houseRoof = new Polygon(150, 400, 450, 400, 300, 300);
        houseRoof.setFill(Color.IVORY);
        houseRoof.setStroke(Color.BLACK);
        
        /*
        create a rectangle for the door of the house
        make the door white and the outline black
        */
        
        Rectangle houseDoor = new Rectangle(270, 525, 60, 75);
        houseDoor.setFill(Color.WHITE);
        houseDoor.setStroke(Color.BLACK);
        
        /*
        create a circle for the door handle
        make the outline of the door handle black
        */
        
        Circle doorHandle = new Circle(280, 565, 5);
        doorHandle.setStroke(Color.BLACK);
        
        /*
        create a rectangle for the left window of the house
        make the window outline black and the fill color white
        */
        Rectangle leftWindow = new Rectangle(200, 425, 50, 60);
        leftWindow.setStroke(Color.BLACK);
        leftWindow.setFill(Color.WHITE);
        
        /*
        create a vertical and horizontal line for the left window of the house
        */
        Line leftWindowVerticalLine = new Line(225, 425, 225, 485);
        Line leftWindowHorizontalLine = new Line(200, 455, 250, 455);
        
        /*
        create a rectangle for the right window of the house
        make the window outline black and the fill color white
        */
        Rectangle rightWindow = new Rectangle(350, 425, 50, 60);
        rightWindow.setStroke(Color.BLACK);
        rightWindow.setFill(Color.WHITE);
        
        /*
        create a vertical and horizontal line for the right window of the house
        */
        Line rightWindowVerticalLine = new Line(375, 425, 375, 485);
        Line rightWindowHorizontalLine = new Line(350, 455, 400, 455);
        
        // ADD AND DISPLAY EVERYTHING
        // add the lines and shapes to the pane
        Pane pane = new Pane(sky, grass, sun, 
                treeBaseLeft, treeBaseRight, 
                leftTreeTopCircle1, leftTreeTopCircle2, 
                leftTreeTopCircle3, rightTreeTopCircle1, 
                rightTreeTopCircle2, rightTreeTopCircle3, 
                houseBase, houseRoof, houseDoor, 
                leftWindow, rightWindow, 
                leftWindowVerticalLine, leftWindowHorizontalLine, 
                rightWindowVerticalLine, rightWindowHorizontalLine,
                doorHandle);
        
        // creata the scene and display everything
        Scene scene = new Scene(pane, sceneWidth, sceneHeight);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
