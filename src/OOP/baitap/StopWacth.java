package OOP.baitap;

import java.util.Scanner;

class StopWatch {

    private long startTime;
    private long stopTime;

    public StopWatch()
    {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public String stopMill() {
        stopTime = System.currentTimeMillis();
        return "StopWatch: " + getElapsedTime() + " milliseconds.";
    }
    public String stopSec(){
        stopTime = System.currentTimeMillis();
        return "StopWatch: " + getElapsedTimeSecs() + " seconds.";
    }
    public long getElapsedTime() {
        return stopTime - startTime;
    }

    public double getElapsedTimeSecs() {
        double elapsed;
        elapsed = ((double)(stopTime - startTime)) / 1000;
        return elapsed;
    }

    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.start();
        for (int i=0;i<100000;i++){
            System.out.println(i);
        }
        Scanner iput = new Scanner(System.in);

        String a =iput.nextLine();
        boolean check = false;
        check = a.equals("stop");
        if(check == true){
            s.stopMill();
            System.out.println(s.stopMill());
            System.out.println(s.stopSec());
        }
        if(check != true){
            System.out.println("To be Continue! ");
        }
    }
}
