package day17.coffee;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	//싱글톤 패턴 : 클래스에서 객체를 하나만 생성해두고 외부에서 객체를 더 생성하지 못하게끔 생성자를 private로 잠금
	private static Menu instance = new Menu();
	private List<MenuItem> items;
	
	public static Menu getInstance() {
		return instance;
	}
	
	private Menu() {
		items = new ArrayList<MenuItem>();
		items.add(new MenuItem("아메리카노", 1500));
		items.add(new MenuItem("카페모카", 2000));
		items.add(new MenuItem("허니자몽블랙티", 2500));
		items.add(new MenuItem("바닐라라떼", 2500));
		items.add(new MenuItem("녹차", 2000));
		items.add(new MenuItem("홍차", 2000));
	}
//	choose("말차라떼")
	public MenuItem choose(String menuName) {
		for(MenuItem menuitem : items) {
			if(menuitem.getName().equals(menuName)) {
				return menuitem;
			}
		}
		return null;	
	}
}
