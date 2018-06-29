import java.io.File;
import java.io.FilenameFilter;

class Exercises2{
    public static void main(String[] args) {
        File file = new File("E://");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".exe")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}