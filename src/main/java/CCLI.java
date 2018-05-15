public class CCLI {
    public static void main(String[] args) throws Exception {
        System.out.println("CCUI initialized");


        for(String paths : FileFinder.walk((args[0]))){
            System.out.println(paths);
        }
    }

}
