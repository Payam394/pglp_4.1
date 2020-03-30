import java.util.ArrayList;

public class affchParGrp {
	
	ArrayList<Personnel> Arr = new ArrayList<Personnel>();
	
	
	
	public affchParGrp(Personnel root) {
		Arr.add(root);
	}
	
	
	

	private class grpIterator implements iterator{
		
		int index=0;
		
		public void affichage() {
			
		}

		public boolean hasNext() {
			if(index<Arr.size())
				return true;			
			return false;
		}

		
		public Personnel next() {
			if(this.hasNext()) {
				index++;
				return Arr.get(index-1);
			}	
			return null;
		};
		
	}
	
	}

