package xrl;
public class JNIxrl {
	public native void sayHello();
	public static void main(String[] args) {
		System.loadLibrary("ConsoleApplication5");
		new JNIxrl().sayHello();
	}
    
}