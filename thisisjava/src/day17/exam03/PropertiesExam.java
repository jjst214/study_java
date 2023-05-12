package day17.exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		//Properties 컬렉션 생성
		Properties properties = new Properties();
		
		try {
			properties.load(PropertiesExam.class.getResourceAsStream("database.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//주어진 키에 대한 값
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		String url = properties.getProperty("url");
		String driver = properties.getProperty("driver");
		
		//값 출력
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("admin : " + admin);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}

}
