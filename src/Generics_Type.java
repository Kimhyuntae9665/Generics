import java.util.*;

class Product{};
class Tv extends Product{};
class Audio extends Product{};




public class Generics_Type {

	public static void main(String[] args) {
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		productlist.add(new Tv()); //Generics Ÿ�� ������ ���� �����ڿ� �Ű������� ���׸��� ����� ������ �����Ŀ��� ���׸� Ÿ���� �ڼ� class�� add�� ����
		productlist.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productlist);
//		printAll(tvList); ArrayList<Product> list = ArrayList<Tv> tvList ���׸� Ÿ���� ����ġ 
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p:list) {
			System.out.println(p);
		}
	}

}
