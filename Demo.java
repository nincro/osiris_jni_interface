public class Demo {
    
    static {
        String nativeExecuter = "/home/ninn/jnidemo/jni/Demo.so";
        nativeExecuter = "/home/ninn/jnidemo/osiris_jni_interface/interface/lib/libOsiInterface.so";
    	System.load(nativeExecuter);
    }

    public static void main(String[] args) {
        //System.loadLibrary("Hello");
        System.out.println("welcome");
        sayHello();
    }

    private static native void sayHello();
}
