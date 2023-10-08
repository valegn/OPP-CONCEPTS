
package domain.model;

public class Triangle extends Shape{

    private int sideSize1=0;
    private int sideSize2=0;
    private int sideSize3=0;

    public int getSideSiza1(){
        return sideSize1;
    }

    public void setSideSiza1(int newSideSize1){
        if(newSideSize1>=0){
            sideSize1=newSideSize1;
        }
    }

    public int getSideSiza2(){
        return sideSize2;
    }

    public void setSideSiza2(int newSideSize2){
        if(newSideSize2>=0){
            sideSize2=newSideSize2;
        }
    }

    public int getSideSiza3(){
        return sideSize3;
    }

    public void setSideSiza3(int newSideSize3){
        if(newSideSize3>=0){
            sideSize3=newSideSize3;
        }
    }

    @Override
    public int getArea(){
        return (getSideSiza1()*getSideSiza2())/2;
    }

    @Override
    public int getPerimeter(){
        return getSideSiza1()+getSideSiza2()+getSideSiza3();
    }
    
    public Triangle(int newX, int newY) {
        super(newY, newY);
        //TODO Auto-generated constructor stub
    }   
}