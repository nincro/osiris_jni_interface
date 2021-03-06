import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JniImpl {
    
    static {

        String nativeSharedLib = "/home/ninn/jnidemo/osiris_jni_interface/interface/lib/libOsiInterface.so";
        String rdir = "lib/libOsiInterface.so";
        nativeSharedLib = Paths.get("interface").toAbsolutePath().resolve(rdir).toString();
        System.out.println("nativeSharedLib:"+nativeSharedLib);
        System.load(nativeSharedLib);
    }

    

    //private static native String matching(String code_rdir, String mask_rdir);

    public static native String getCodeAndMask(String img_rdir);
    
    public static native String getIrisFeature(String img_rdir);

    public static native float matching(String a_rdir, String b_rdir);

    static void demoMatching(){
        String a_rdir = "0000_000.bmp";
        String b_rdir = "0000_001.bmp";
        System.out.println(matching(a_rdir, b_rdir));
    }
    
    static void demoGetIrisFeature(){
        String a_rdir = "0000_001.bmp";
        System.out.println(getIrisFeature(a_rdir));
    }
    
    public static void main(String[] args) {
        //System.loadLibrary("Hello");
       System.out.println("welcome");
       demoGetIrisFeature();
       //String feature = getIrisFeature("0000_000.bmp");
       //System.out.println(feature);
    }

    private static native void sayHello();
}
