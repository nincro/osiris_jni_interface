package jni;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JniInterface {
static {

        String nativeSharedLib = "/home/ninn/jnidemo/osiris_jni_interface/interface/lib/libOsiInterface.so";
        String rdir = "lib/libOsiInterface.so";
        nativeSharedLib = Paths.get(".").toAbsolutePath().resolve(rdir).toString();
        System.out.println("nativeSharedLib:"+nativeSharedLib);
        System.load(nativeSharedLib);
    }

public static native String irisDetect(String rdir);

public static void main(String[] args){
String mask_rdir = irisDetect("0000_000.bmp");
System.out.println(mask_rdir);
}
}
