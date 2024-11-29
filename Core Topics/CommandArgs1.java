// Command Line Arguments

public class CommandArgs1 {
    public static void main(String args[])
    {
        if(args.length > 0){
            System.out.println("the command line arguments are");
            for (String v:args)
            {
                System.out.println(v);
            }
        }
        else{
            System.out.println("No arguments passed");
        }
    }
}
