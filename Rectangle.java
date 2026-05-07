public class Rectangle{
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    public float getArea(){
        int area=length*width;
        System.out.println("The area of the Rectangle is: "+area);
        return area;
    }
    public static void main(String[] args){
        Rectangle r=new Rectangle(5,10);
        System.out.println("the area of the rectangle is: "+r.getArea());
    }
}