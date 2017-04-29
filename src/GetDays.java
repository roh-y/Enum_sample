/**
 * Created by rohityarlagadda on 4/28/17.
 */
public class GetDays {
    Days days;

    public GetDays(Days days) {
        this.days = days;
    }
    public void work(){
        switch (days){
            case monday:
                System.out.println("Today is monday");
                break;
            case tuesday:
                System.out.println("Today is tuesday");
                break;
            case wednesday:
                System.out.println("Today is wednesday");
                break;
            case thursday:
                System.out.println("Today is thursday");
                break;
            case friday:
                System.out.println("Today is friday");
                break;
            case saturday:
                System.out.println("Today is saturday");
                break;
            case sunday:
                System.out.println("Today is sunday");
                break;
        }
    }
}
