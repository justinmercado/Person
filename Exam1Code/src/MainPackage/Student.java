package MainPackage;

public class Student extends Person {
	public enum Status {
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}
	
	private Status freshman;
	private Status sophomore;
	private Status junior;
	private Status senior;
	
	public Status getFreshman() {
		return freshman;
	}

	public void setFreshman(Status freshman) {
		this.freshman = freshman;
	}

	public Status getSophomore() {
		return sophomore;
	}

	public void setSophomore(Status sophomore) {
		this.sophomore = sophomore;
	}

	public Status getJunior() {
		return junior;
	}

	public void setJunior(Status junior) {
		this.junior = junior;
	}


	public Status getSenior() {
		return senior;
	}


	public void setSenior(Status senior) {
		this.senior = senior;
	}





	@Override 
	public String toString() {
		return super.toString() + getName();
	}

	
	

}
