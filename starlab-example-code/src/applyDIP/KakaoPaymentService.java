package applyDIP;

public class KakaoPaymentService implements PaymentService {
	@Override
	public void pay() {
		System.out.println("Do Kakao Pay !");
	}
}

class NaverPaymentService implements PaymentService {
	@Override
	public void pay() {
		System.out.println("Do Naver Pay !");	
	}
}

class SamsungPaymentService implements PaymentService {
	@Override
	public void pay() {
		System.out.println("Do Samsung Pay !");
	}
}
