 public class HW5 {
     public static void main(String[] args) {

         Week monday = new Week();

         monday.dayOfTheWeek = "Monday";
         monday.number = 1;
         monday.result();

         Week tuesday = new Week();
         tuesday.number=2;
         tuesday.dayOfTheWeek="Tuesday";
         tuesday.result();
     }
 }
    class Week {
        int number;
        String dayOfTheWeek;

        void result() {
            System.out.println(dayOfTheWeek +" "+ number);
        }

        ;


    }



