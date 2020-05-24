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
		
		
	}
	
	
	}

