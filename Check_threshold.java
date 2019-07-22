import java.lang.*;
public class Check_threshold {

public static void main(String arg[]){
    long startTime = System.currentTimeMillis();
    long endTime = startTime+(60 * 60 * 1000); // this is for 1 hr
    long threshold = endTime - startTime;
    boolean isExceed=false;
    System.out.println(endTime);
    System.out.println(System.currentTimeMillis());
    System.out.println(threshold);

    if(endTime-startTime>threshold){
        isExceed=true;
    }
    if(isExceed=true){

    }
}

}
