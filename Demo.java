public class Demo {
    
   

    public static void main(String[] args) {
        //System.loadLibrary("Hello");
        System.out.println("jni demo");
        String rdir = JniImpl.getCodeAndMask("0000_000.bmp");
        System.out.println(code_rdir);
    }

}
