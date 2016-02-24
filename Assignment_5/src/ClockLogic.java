import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockLogic {
	
	private DigitalClockGui GUI;
	int alarmHour;
	int alarmMinute;
	private DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
	private DateFormat timeFormat2 = new SimpleDateFormat("hh:mm");
	
	

	public ClockLogic(DigitalClockGui gui) {
		this.GUI = gui;
		
		ClockThread clockThread = new ClockThread();
		clockThread.start();
	}

	public void setAlarm(int hour, int minute){
		
		this.alarmHour = hour;
		this.alarmMinute = minute;
	}
	public void clearAlarm(){
		alarmHour = 0;
		alarmMinute = 100;
	}
	public class ClockThread extends Thread{
		public void run(){
			while(true){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Date date = new Date();
				String Time = timeFormat.format(date);
				String Time2 = timeFormat2.format(date);
				GUI.setTimeOnLabel(Time);
				
				System.out.println(alarmHour+":"+alarmMinute + "\n" + Time2);
				if(alarmHour<10&&alarmMinute>9){
				if(Time2.equals("0"+alarmHour+":"+alarmMinute)){
					GUI.activateAlarm(true);
					boolean test = true;
					System.out.println(test);
				}
				else{
					GUI.activateAlarm(false);
					boolean test = false;
					System.out.print(test);
				}
				}
				
				if(alarmHour>10&&alarmMinute<10){
				if(Time2.equals(alarmHour+":"+"0"+alarmMinute)){
					GUI.activateAlarm(true);
				}
				else{
					GUI.activateAlarm(false);
				}
				};
				if(alarmHour<10&&alarmMinute<10){
				if(Time2.equals("0"+alarmHour+":"+"0"+alarmMinute)){
					GUI.activateAlarm(true);
				}
				else{
					GUI.activateAlarm(false);
				}
				}
				if(Time2.equals(alarmHour+":"+alarmMinute)){
					GUI.activateAlarm(true);
				}
				else{
					GUI.activateAlarm(false);
					System.out.println(timeFormat2+" "+alarmHour+":"+alarmMinute);
				}
		}
	}
	}
}
