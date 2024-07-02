package src.main.java.org.task.concept;

public class MethodReference {

    public static void main(String[] args) {

        Say sR = StaticReference::staticReference;
        sR.say();

        InstanceReference instance = new InstanceReference();
        Say iR = instance::InstanceReference;
        iR.say();

        Say constructorReference = ConstructorReference::new;
        constructorReference.say();

    }

}

interface Say {
    void say();
}

class StaticReference {
    public static void staticReference() {
        System.out.println("REFERENCE TO STATIC METHOD");
    }
}

class InstanceReference {
    public void InstanceReference() {
        System.out.println("REFERENCE TO INSTANCE METHOD");
    }
}

class ConstructorReference {
    ConstructorReference() {
        System.out.println("REFERENCE TO CONSTRUCTOR");
    }
}