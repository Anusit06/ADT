public class IntegetSetTest {
    public static void main(String[] args) {
         System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        System.out.println("\n--- Testing add() and sorting ---");
        IntegerSet a = new IntegerSet();
        a.add(10);
        a.add(40);
        a.add(30);
        String expected1 = "[10, 30, 40}";
        if (a.toString().equals(expected1)) {
            System.out.println("PASSED: Add and sort works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected1 + " but got " + a.toString());
            failed++;
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
