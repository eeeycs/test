package test;
public class JNIDemo {
	public native void sayHello();
	public static void main(String[] args) {
		System.loadLibrary("ConsoleApplication5");
		new JNIDemo().sayHello();
	}
    
}