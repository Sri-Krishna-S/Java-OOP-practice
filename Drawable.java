interface Drawable{
    void draw(); // abstract Method
    default void printInfo(){
        System.info.println("Drawable Object...");
    }
    static void printVersion(){
        System.info.println("Version.1.1");
    }
}
interface Scalable{
    void scale(double factor);
}
//Implementing multiple Interfaces
class Circle implements Drawable,Scalable{
    private double radius;
    @Override
    public void draw(){
        System.out.println("Drawing circle with radius:"+radius);
    }
    @Override
    public void scale(double factor){
        radius*=factor;
    }
}