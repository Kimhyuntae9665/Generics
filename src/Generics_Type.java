import java.util.*;

class Product{};
class Tv extends Product{};
class Audio extends Product{};




public class Generics_Type {

	public static void main(String[] args) {
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		productlist.add(new Tv()); //지네익 타입이 Product 이면서 Product의 자손 class를 넣을 수 있다.
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
