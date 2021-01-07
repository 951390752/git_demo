package java5;


public class StopWatch {
 
		private long startTime;
		private long endTime;
		public StopWatch() {
			java.util.Date date=new java.util.Date();
			startTime=date.getTime();
		}
		public void start(long startTime) {
			 this.startTime=startTime;
		}
		public void Stop(long endTime) {
			this.endTime=endTime;
		}
		public long getElapsedTime() {
			java.util.Date time=new java.util.Date(); 
			return time.getTime();
		}
		public long getStartTime() {
			return startTime;
		}
		public long getEndTime() {
			return endTime;
		}
}
