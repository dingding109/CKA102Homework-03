package hw1;

public class Howmuchtime {

	public static void main(String[] args) {
		
		int total = 256559;//總秒數
		int day = total / 86400;
		total = total % 86400;//更新total=83759

		int hour = total / 3600;//第一次出現，要加int
		total = total % 3600;//更新total=959

		int min = total / 60;
		int sec = total % 60;
		
				
		System.out.println( day + "天" + hour + "時" + min + "分" + sec + "秒");
	
	}
	
}
