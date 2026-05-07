public class GCDemo{
    public static void main(String[] args){
        //object creation
        Object obj1=new Object();//obj1 refers to Object A
        Object obj2=new Object();//obj2 refers to Object B
        //object reference
        obj1=obj2; //obj1 is reference of object B
        obj2=null;// obj2 is reference of null so it refers no object 
        //so object A is eligible for Garbage collection and object B isn't
        System.gc();//requesting JVM for garbage collection 
        @Override
        protected void finalize() throws Throwable{
            System.out.println("Succesfully ran garbage collection!!!");//something is wrong in this part of code, finalize() is deprecated from java.
        }
    }
}