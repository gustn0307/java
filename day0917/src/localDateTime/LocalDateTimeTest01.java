package localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
	public static void main(String[] args) {
		LocalDateTime toDay = LocalDateTime.now();
		System.out.println(toDay.toLocalDate());
		System.out.println(toDay.toLocalTime());
		System.out.println(toDay);

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDateTime f = LocalDateTime.of(2021, 9, 21, 0, 1); // 년 월 일 시간 분
		System.out.println(f);
		
	}

}
