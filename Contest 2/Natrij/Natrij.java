import java.io.*;
import java.util.*;

public class Natrij {
    public static void main(String[] args) {
        String curTime; String exTime; int left;
        int hours; int mins; int secs;
        Scanner sc = new Scanner(System.in);

        curTime = sc.nextLine(); exTime = sc.nextLine();

        left = getLeft(curTime, exTime);

        hours = left / 3600;
        mins = (left%3600) / 60;
        secs = ((left%3600)%60);

        int[] time = {hours, mins, secs};
        print(time);
    }

    private static void print(int[] time){
        for(int i = 0; i<3; i++){
            if(time[i] < 10) System.out.print("0" + time[i]);
            else System.out.print(time[i]);
            
            if(i<2) System.out.print(":");
        }
    }

    private static int getLeft(String t1, String t2){
        String[] time1 = t1.split(":");
        String[] time2 = t2.split(":");

        if(Integer.valueOf(time2[0]) <= Integer.valueOf(time1[0])){
            time2[0] = Integer.valueOf(time2[0]) + 24 + "";
        }

        return getSeconds(time2) - getSeconds(time1);
    }

    private static int getSeconds(String[] timeArray){
        int rtn = 
        Integer.valueOf(timeArray[0]) * 3600 +
        Integer.valueOf(timeArray[1]) * 60 +
        Integer.valueOf(timeArray[2]);

        return rtn;
    }
}