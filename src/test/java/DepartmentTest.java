import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepartmentTest {
	
	Personnel p1;
	Personnel p2;
	Personnel p3;
	Personnel p4;
	
	Groupe g1;
	Groupe g2;
	Groupe g3;
	Groupe g4;
	
	
	
	

	@Test
	void test1() {
		p1 = new Personnel.Builder("Akrami", "Payam", 1).build();
		p2 = new Personnel.Builder("Zacki", "Marc", 2).build();
		p3 = new Personnel.Builder("Gates", "Bill", 3).build();
		p4 = new Personnel.Builder("Bezos", "Jeff", 4).build();
		
		p1.print();
		p2.print();
		p3.print();
		p4.print();
		System.out.println();
	
		g1 = new Groupe("alpha");
		g1.addTo(p1);
		g1.addTo(p2);
		
		g2 = new Groupe("betta");
		g2.addTo(g1);
		g2.addTo(p3);
		
		g4 = new Groupe ("tetta");
		g4.addTo(p4);
		
		g3 = new Groupe("gamma");
		g3.addTo(g2);
		g3.addTo(g1);
		
		g3.print();
	}

}
