public class JniImpl {
    
    static {
        String nativeExecuter = "/home/ninn/jnidemo/jni/Demo.so";
        nativeExecuter = "/home/ninn/jnidemo/osiris_jni_interface/interface/lib/libOsiInterface.so";
    	System.load(nativeExecuter);
    }

    private static native void getCodeAndMask();

    private static native String matching(String code_rdir, String mask_rdir);

    private static native String getCodeAndMask(String img_rdir);

    public static void main(String[] args) {
        //System.loadLibrary("Hello");
        System.out.println("welcome");
        sayHello();
    }

    private static native void sayHello();
}
