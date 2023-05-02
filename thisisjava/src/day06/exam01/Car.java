package day06.exam01;

public class Car {
	//�븘�뱶�꽑�뼵
	public String company = "�쁽���옄�룞李�";
	public String model;
	public String color;
	public int maxSpeed;
	
//	�깮�꽦�옄 �꽑�뼵 湲곕낯 �깮�꽦�옄
//	�깮�꽦�옄 �삤踰꾨줈�뵫 : 留ㅺ컻 蹂��닔�쓽 ���엯, 媛쒖닔, �닚�꽌媛� �떎瑜� �깮�꽦�옄瑜� �뿬�윭媛� �옉�꽦
//	紐⑹쟻 : 媛앹껜�쓽 �븘�뱶瑜� �떎�뼇�븯寃� 珥덇린�솕 �븷 �닔 �엳�쓬
	public Car() {	// 1踰� �깮�꽦�옄
		
	}
	
	public Car(String model) {
		this(model, "�씛�깋");
	}
	
	public Car(String model, String color) {
		this(model,color,200);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
		public String company = "�쁽���옄�룞李�";
		public String model;
		public String color;
		public int maxspeed;

		//�깮�꽦�옄 �꽑�뼵 湲곕낯 �깮�꽦�옄
		//�깮�꽦�옄 �삤踰꾨줈�뵫 : 留ㅺ컻 蹂��닔�쓽 ���엯, 媛쒖닔, �닚�꽌媛� �떎瑜� �깮�꽦�옄瑜� �뿬�윭媛� �옉�꽦
		//紐⑹쟻 : 媛앹껜�쓽 �븘�뱶瑜� �떎�뼇�븯寃� 珥덇린�솕 �븷�닔�엳�쓬
		public Car() {      // 1踰� �깮�꽦�옄

		}
		Car my = new Car("ddd");
		public Car(String model) {      //2踰� �깮�꽦�옄
			this(model,"�씛�깋");  // 3踰� �깮�꽦�옄 �샇異�
		}
		public Car(String model, String color) { //3踰� �깮�꽦�옄
			this(model,color,200); //4踰� �깮�꽦�옄 �샇異�
		}
		//�깮�꽦�옄 �꽑�뼵
		public Car(String model, String color, int maxspeed) {
			this.model = model;
			this.color = color;
			this.maxspeed = maxspeed;
		}