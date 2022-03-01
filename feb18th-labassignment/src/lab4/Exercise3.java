package lab4;
abstract class item{
	private double Id;
	private String title;
	private int copies;
	private static boolean Checkedin;
	public static void setCheckedin(boolean checkedin) {
		checkedin=checkedin;
	}
	public boolean isCheckedin() {
		return Checkedin;
	}
	
	public double getId() {
		return Id;
	}
	public void setId(double id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	
	
	
}
public class Exercise3 {
	

}
