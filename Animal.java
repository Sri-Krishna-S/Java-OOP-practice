class Animal{
    void eat(){
        System.out.println("Eating...");
    }
    class dog extends Animal{//single inheritance
        void bark(){
            System.out.println("What the dawg doin...");
        }
    }
    class puppy extends Dog{//multilevel inheritance
        void weep(){
            System.out.println("Weeping...");
        }
    }
    class cat extends Animal{//hierarchial inheritance
        void meow(){
            System.out.println("mewing...");
        }
    }
}
