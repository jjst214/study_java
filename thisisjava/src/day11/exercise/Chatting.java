package day11.exercise;

public class Chatting {
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) {
//		String nickName = ""; //여기서 값을 초기화 하면 익명 자식 객체에서 값을 변경할 수 없음
		String nickName = chatId;
		
		Chat chat = new Chat() {

			@Override
			void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
			@Override
			void sendMessage(String message) {
				
				System.out.println(message);
			}
		};
		chat.start();
	}
}
