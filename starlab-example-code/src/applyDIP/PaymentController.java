package applyDIP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentController {
	public void pay(PaymentService service) throws ParseException {
		/* New Functional Requirement */
		SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
		Date currentTime = f.parse(SimpleDateFormat.format(new Date()));
		Date estimatedEndTime = f.parse("2020-05-28 00:00:00");
		
		if (currentTime.compareTo(estimatedEndTime) > 0) {
			/* Do Payment Service */
			service.pay();
		} else {
			System.out.println("시스템 점검 중 입니다!");
		}
		
	}
	
	public static void main(String[] args) throws ParseException {
		PaymentController controller = new PaymentController();
		
		 controller.pay(new NaverPaymentService());
	}
}
