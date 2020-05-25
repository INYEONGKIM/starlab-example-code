package DIP;

class NaverPaymentService {
	String paymentType = "Naver";
	
	public void pay() {
		System.out.println("Do Naver Pay !");
	}
}

class SamsumgPaymentService {
	String paymentType = "Samsung";
	
	public void pay() {
		System.out.println("Do Samsung Pay !");
	}
}

public class KakaoPaymentService {
	String paymentType = "Kakao";
		
	public void pay() {
		System.out.println("Do Kakao Pay !");
	}

}

