import java.util.ArrayList;
import java.util.Iterator;


public class affchParGrp implements Container{
	
	ArrayList<Department> Arr = new ArrayList<Department>();
	
	
	
	public affchParGrp(ArrayList<Department> Arr) {
		this.Arr=Arr;
	}
	
	@Override
	public Iterator getIterator() {
		return new grpIterator();
	}
	
	

	private class grpIterator implements Iterator{
		
		int index=0;
		
		public boolean hasNext() {
			if(index<Arr.size())
				return true;			
			return false;
		}

		
		public Department next() {
			if(this.hasNext()) {
				index++;
				return Arr.get(index-1);
			}	
			return null;
		}
		
		public void affichageParProfond() {
			
			int verifier=0;
			
			while(verifier<Arr.size()) {
				if(Arr.get(verifier) instanceof Groupe) {
					Groupe test=(Groupe)Arr.get(verifier);
					System.out.println(test.gpName);
					
					for (int i = 0; i < Arr.size(); i++) {
						
					}
					
					
					int i=0;
					
					while(i<test.getSize()) {
						Arr.add(test.getIndex(i));
						i++;
					}
				}
				else {
					Arr.get(verifier).print();
				}
				verifier++;
			}
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Department> Arr = new ArrayList<Department>();
		
		Personnel p1;
		Personnel p2;
		Personnel p3;
		Personnel p4;
		
		Groupe g1;
		Groupe g2;
		Groupe g3;
		Groupe g4;
		
			p1 = new Personnel.Builder("Akrami", "Payam", 1).build();
			p2 = new Personnel.Builder("Zacki", "Marc", 2).build();
			p3 = new Personnel.Builder("Gates", "Bill", 3).build();
			p4 = new Personnel.Builder("Bezos", "Jeff", 4).build();
			
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
			
			
			
			Arr.add(g3);
			
			affchParGrp p = new affchParGrp(Arr);
			
			System.out.println("====================================");
			
			for(Iterator iter = p.getIterator(); iter.hasNext();){
		         Department name = (Department) iter.next();
		         name.print();
		         //System.out.println("Name : " + name);
		      } 
			
			System.out.println("====================================");
			
	}


	
	}

