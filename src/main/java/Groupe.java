import java.util.ArrayList;

public class Groupe implements Department{

	private ArrayList<Department> sousHierarchie;
	
	
	

	public Groupe(ArrayList<Department> sousHierarchie) {
		super();
		this.sousHierarchie = sousHierarchie;
	}

	
	public void addTo (Department d) {
		sousHierarchie.add(d);
	}
	
	public void removeFrom (Department d) {
		sousHierarchie.remove(d);
	}
	
	public void print() {
		sousHierarchie.forEach((n) -> System.out.println(n)); 
	}


}
