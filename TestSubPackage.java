// import live.sonu.*;

public class TestSubPackage {
    public static void main(String[] args) {
        System.out.println("Testing sub package");
        live.sonu.SubPackage n1 = new live.sonu.SubPackage();  // import is not required in this case
        n1.sayAge();
    }
}