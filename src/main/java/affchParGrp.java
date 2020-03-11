import java.util.ArrayList;

public class affchParGrp {
	
	ArrayList<Personnel> Arr = new ArrayList<Personnel>();
	
	
	
	public affchParGrp(Personnel root) {
		Arr.add(root);
	}

	private class grpIterator implements iterator{

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		public Personnel next() {
			return null;
			// TODO Auto-generated method stub
			
		};
		
	}
	
	}

