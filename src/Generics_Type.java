import java.util.*;

class Product{};
class Tv extends Product{};
class Audio extends Product{};




public class Generics_Type {

	public static void main(String[] args) {
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		productlist.add(new Tv()); //Generics 타입 생성할 때는 생성자와 매개변수의 지네릭을 맞춰야 하지만 생성후에는 지네릭 타입의 자손 class도 add로 가능
		productlist.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productlist);
//		printAll(tvList); ArrayList<Product> list = ArrayList<Tv> tvList 지네릭 타입이 불일치 
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p:list) {
			System.out.println(p);
		}
	}

}
