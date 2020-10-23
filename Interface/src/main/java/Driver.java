public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind w = new Wind();
		Percussion p = new Percussion();
		Stringed s = new Stringed();
		w.play();
		String str = w.what();
		System.out.println(str);
		w.adjust();
		p.play();
		str = p.what();
		System.out.println(str);
		p.adjust();
		s.play();
		str = s.what();
		System.out.println(str);
		s.adjust();
	}

}
