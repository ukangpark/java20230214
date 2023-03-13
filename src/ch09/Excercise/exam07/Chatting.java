package ch09.Excercise.exam07;

public class Chatting {
	class Chat {
		void start() {}
		void sendMessage (String message) {}
	}
	
	void start(String chatId) {
//		String nickName = null;
//		nickName = chatId;
		String nickName = chatId;// 값을 한번만 할당(final이기 때문)
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}

}
