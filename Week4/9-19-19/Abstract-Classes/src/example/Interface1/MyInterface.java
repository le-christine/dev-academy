package example.Interface1;

// interface is more secure
// a collection of abstractions
public interface MyInterface {
    /**
     * Compiler will treat them as
     * public abstract void method1();
     * public abstract void method2();
     *
     */

    public void method1();
    public void method2();

}
