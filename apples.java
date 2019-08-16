package test;

public class apples {
private int hour;
private int minute;
private int seconds;
public apples()
{this.hour=2;
this.minute=36;
this.seconds=24;
System.out.printf("the time right now in normal format is %s",this);	
}
public void setTime(int h,int m,int s) {
	hour=((h>=0 && h<24)?h:0);
    minute=((m>=0 && m<60)?m:0);
	seconds=((s>=0 && s<60)?s:0);}

public String toMilitary() {
return String.format("%02d:%02d:%02d",hour,minute,seconds);
}
public String toString()
{
	return String.format("%d:%02d:%02d %s",((hour==0||hour==12)?12:hour%12),minute,seconds,(hour<12)?"am":"pm");
		
}
}