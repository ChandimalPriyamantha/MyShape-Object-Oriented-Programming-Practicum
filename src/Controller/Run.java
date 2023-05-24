package Controller;

import Services.Resizable;
import Services.imp.Circle;
import Services.imp.ResizableCircle;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

       TestCircle();
      TestCircleWithResize();


    }

    public static void TestCircle(){
        double myRadius = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        myRadius = input.nextDouble();
        while (true){

            if(myRadius >=0){
                Circle myCircle = new Circle(myRadius);
                System.out.println("Area of the Circle : " + myCircle.getArea());
                System.out.println("Perimeter of the Circle : " + myCircle.getPerimeter());
                break;
            }else{
                System.out.println("Negative values are not allowed, Please Re-enter positive value: ");
                myRadius = input.nextDouble();
            }
        }

    }

    public static void TestCircleWithResize(){
        double myRadius = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        myRadius = input.nextDouble();

        int percent=0;
        System.out.println("Enter Percent: ");
        percent = input.nextInt();

        while (true){

            if(myRadius >=0 ){

                if(percent >=-100 & percent <=100){

                    ResizableCircle myResizeCircle = new ResizableCircle(myRadius);
                    Circle myCircle = new Circle(myResizeCircle.resize(percent));
                    System.out.println("Area of the Circle : " + myCircle.getArea());
                    System.out.println("Perimeter of the Circle : " + myCircle.getPerimeter());
                    break;

                }else{

                    System.out.println("Value entered is invalid, Please re-enter a value\n" +
                            "between -100 to +100 :");
                }
                //Circle myCircle = new Circle(myRadius);
            }else{
                System.out.println("Negative values are not allowed, Please Re-enter positive value: ");
                myRadius = input.nextDouble();
            }
        }


    }


}
