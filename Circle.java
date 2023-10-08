package domain.model;

public class Circle extends Shape{

    public Circle(int newX, int newY) {
      super(newY, newY);
        //TODO Auto-generated constructor stub
    }

    private int radius=0;

    //get radius of the circle 





    @Override
    public int getPerimeter(){
        return (int)(2*Math.PI*getRadius()) ; //multiplicacion de pi por perimetro
    }
    public int getRadius() {
        return radius;
    }

    //set radius of the circle
    public void setRadius(int newRadius){
        if(newRadius >= 0){
            radius=newRadius;
        }
    }
    public int getArea(){
        return (int)(Math.PI*Math.pow(getRadius(), 2));    //pi por radio al cuadrado
    }
   
    }   