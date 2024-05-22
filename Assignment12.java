public class Assignment12 {
    public static void main (String args[]){
        int total_students=90;
        int number_boys=45;
        int number_girls= total_students-number_boys;
        System.out.println("total number of girls: " + number_girls);
       
        int totalGradeA = total_students / 2; // 50% of total students
       
        int boysGradeA = 20;

        // Calculate the total girls getting grade 'A'
        int girlsGradeA = totalGradeA - boysGradeA;

        // Display the result
        System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);

    }
}
