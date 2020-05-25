package DIP;

public class PaymentController {
	public void pay(String userPaymentType) {
		KakaoPaymentService kakao = new KakaoPaymentService();
		NaverPaymentService naver = new NaverPaymentService();
		SamsumgPaymentService samsung = new SamsumgPaymentService();

		if (userPaymentType == kakao.paymentType) {
			kakao.pay();
		} else if (userPaymentType == naver.paymentType) {
			naver.pay();
		} else if (userPaymentType == samsung.paymentType) {
			samsung.pay();
		} else {
			System.out.println("Not Allowable Type !");
		}
	}
	
	public static void main(String[] args) {
		PaymentController controller = new PaymentController();
		String userPaymentType = "Naver";
		
		controller.pay(userPaymentType);
	}
}

