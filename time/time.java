// Sum of two time intervals

import java.lang.Math;


public class Time {
	public int hours;
	public int minutes;
	public int seconds;
	
	// constructor
	Time(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	static Time sumTimeInterval(Time a, Time b){
		Time t = new Time(0, 0, 0);
		
		int secSum = a.seconds + b.seconds;
		int minSum = a.minutes + b.minutes;
		int hourSum = a.hours + b.hours;

		// seconds
		if (secSum < 60)	t.seconds = secSum;
		else{
			minSum++;
			t.seconds = Math.abs( 60 - secSum );
		}

		// minutes
		if (minSum < 60)	t.minutes = minSum;
		else{
			hourSum++;
			t.minutes = Math.abs( 60 - minSum );
		}
		
		// hours
		t.hours = (hourSum < 24) ? hourSum : Math.abs( 24 - hourSum );
		
		return t;
	}

	public static void main(String[] args) {
		
		Time t1 = new Time(18, 59, 59);
		System.out.println("Time 01 : " + t1.hours + ":" + t1.minutes + ":" + t1.seconds);
		
		Time t2 = new Time(18, 59, 59);
		System.out.println("Time 02 : " + t2.hours + ":" + t2.minutes + ":" + t2.seconds);
		
		Time timeSum = sumTimeInterval(t1, t2);
		System.out.println("Sum of time : " + 
			timeSum.hours + ":" + timeSum.minutes + ":" + timeSum.seconds);
	}
}
