package Level1ProgramingElement;

/*
 2.	Sam’s mark in Maths is 94,
  Physics is 95 and Chemistry is 96 out of 100. 
  Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 


 */
public class CalculateMarks {
    public static void main(String[] args) {
        String name = "Sam's";
        int mathsMarks = 94;
        int PhysicsMarks = 95;
        int chemistryMarks = 96;
        int Sum = mathsMarks+PhysicsMarks+ chemistryMarks;
        int count = 3;
        int average = Sum/count;
        System.out.println("Sam's acerage marks in pcm is : " + average);
    }
}
