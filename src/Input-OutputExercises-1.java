import java.io.File;

class Exercises1{
    public static void main(String[] args) {
        File file = new File("E://");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}