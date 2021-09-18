// import org.graalvm.compiler.core.common.cfg.Loop;

public class Looping {
    public static void main(String[] args) {
        // for Loop Statement
        // for(int x = 0; x < 20; x++) {
        //     if (x==10 || x == 15){
        //         continue;
        //     }
        //     System.out.print("value of x : " + x );
        //     System.out.print("\n");
        //  }
        
        // While Loop Statement
        // int x = 10;
        // while( x < 10 ) {
        //     System.out.print("value of x : " + x );
        //     x++;
        //     System.out.print("\n");
        // }

        // do while loop statement 
        int x = 10;

        do {
           System.out.print("value of x : " + x );
           x++;
           System.out.print("\n");
        } while( x < 10 );

    }
}
