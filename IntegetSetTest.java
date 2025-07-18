public class IntegetSetTest {
    public static void main(String[] args) {
         System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(70);
        a.add(40);
        a.add(60);
        String s = "[40, 50, 60, 70]";
        if (a.toString().equals(s)) {
           System.out.print("Pass");
           passed++;
        }else{

            System.out.print("Fail"+a.toString());
        }
       
       
       
       
       
       
       
       
       
        // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
    }
    
}
