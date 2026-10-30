import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
     public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

        PainterAPI painter = canvas.getPainter();
        painter.setSpeed(10); // Lower number means faster, zero means as fast as possible.
        
        // Three different PainterAPI method calls
        painter.forward(100);
        painter.turnRight(90);
        painter.circle(30);

        //Calls the method that draws the aquarium
        drawAquarium(painter);
     }


     //Draws rectangle using width and height
     public static void drawRectangle(PainterAPI painter, int width, int height) {

     }

     //Draws triangle using its size 
     public static void drawTriangle(PainterAPI painter, int size) {

     }

     //Draws a circle using its radius
     public static void drawCircle(PainterAPI painter, int radius) {

     }

     //Draws a fish using a rectangle, triangles and circles 
     public static void drawFish(PainterAPI painter, int size) {
        //calls drawRectangle 
        //Calls drawTriangle
        //Calls drawCircle
     }

     //Draws a puffer fish using a circle and triangles
     public static void drawPufferfish(PainterAPI painter, int size) {
        //Calls drawCircle
        //Calls drawTriangle
     }

     //Draws a seahorse using a circle, rectangles, and triangles
     public static void drawSeahorse(PainterAPI painter, int size) {
        //Calls drawCircle 
        //Calls drawRectangles
        //Calls drawTriangles 
     }

     //Draws a jellyfish using a circle and rectangles
     public static void drawJellysifh(PainterAPI painter, int size) {
        //Calls drawCircle
        //Calls drawRectangle 
     }

     //Draws bubbles using circles
     public static void drawBubbles(PainterAPI painter) {
        //Calls drawCircle repeadedly using a loop 
     }

     //Draws seaweed using rectangles
     public static void drawSeaweed(PainterAPI painter) {
        //Calls drawREctangles repeadedly using a loop
     }

     //Draws starfish using trangles
     public static void drawStarfish(PainterAPI painter, int size) {
        //Calls drawTrangle using a loop 
     }

     //Draws the decorations
     public static void drawDecorations(PainterAPI painter) {
        //Calls drawBubbles 
        //Calls drawSeaweed
        //Calls drawStarfish 
     }

     //Draws the entire aquarium
     public static void drawAquarium(PainterAPI painter) {
        //Calls drawFish
        //Calls drawPufferfish
        //Calls drawSeahorse
        //Calls drawJellyfish
        //Calls drawDecorations
     }
}