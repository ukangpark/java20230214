package ch15.sec06.exam02;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		//Queue 컬렉션 생성 (LinkedList에 담아서 줄세울꺼야 Queue메소드를 사용할거야)
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메세지 넣기
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","신용권"));
		messageQueue.offer(new Message("sendKakaotalk","감자바"));
		
		//메세지 하나씩 꺼내어 처리
		while(!messageQueue.isEmpty()) { //비어있지 않다면 반복해 (먼저들어온순서대로 poll)
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			default:
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}

}
