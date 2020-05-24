import java.time.LocalDate;


public class Personnel implements Department{
	
	
	private String nom;
	private String prenom;
	private String ID;
	
	private String telephone;
	
	private LocalDate dateDeNaissance;
	
	public static class Builder {
		
		private String nom;
		private String prenom;
		private String ID;
		
		private String telephone;
		
		private LocalDate dateDeNaissance;
		
		public Builder (String nom, String prenom) {
			this.nom=nom;
			this.prenom=prenom;
		}
		
		public Builder (String ID) {
			this.ID=ID;
		}
		
		public Builder withTelephone(String tel) {
			this.telephone=tel;
			return this;
		}
		
		public Builder withDateN(LocalDate date) {
			this.dateDeNaissance=date;
			return this;
		}
		
		
		public Personnel build () {
			Personnel p= new Personnel(this);
			
			return p;
		}
		
	}
	

	
	private Personnel(Builder personnels) {
		
		this.nom=personnels.nom;
		this.prenom=personnels.prenom;
		this.ID=personnels.ID;
		this.dateDeNaissance=personnels.dateDeNaissance;
		this.telephone=personnels.telephone;
	
	}
	
	public void print() {
		System.out.println("Personnel");
		
	}
	
	
}
