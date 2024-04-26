package inheritance;

class Electronics {
	void types() {
		System.out.println("Electronic Items:-");
		System.out.println("Mobiles\nEarphones\nTrimmer");
	}
}

class mobile extends Electronics {
	void company1() {
		System.out.println("Mobile Companies:-");
		System.out.println("MI\nApple\nSamsung");
	}
}

class earphone extends mobile {
	void company2() {
		System.out.println("Earphones Companies:-");
		System.out.println("JBL\nSony\nBose");
	}
}

class trimmer extends earphone {
	void company3() {
		System.out.println("Trimmer Companies:-");
		System.out.println("Nova\nPhillips\nSyska");
	}
}

public class multilevel {

	public static void main(String[] args) {
		
		trimmer t=new trimmer();
		t.types();
		t.company1();
		t.company2();
		t.company3();
	}
}