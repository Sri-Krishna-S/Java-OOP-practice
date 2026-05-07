class shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
    public final void resize(){
        System.out.println("resizing a shape");
    } 
}
class circle extends shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
        super.draw();
    }
}