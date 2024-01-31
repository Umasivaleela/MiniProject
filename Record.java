package mini_project;

public class Record {
	// instance variables
	private String name;
	protected int idNumber;
	protected int contactNumber;

	// Default Constructor
	public Record() {
	}

     //Parametrized constuctor
	public Record(String name, int idNumber, int contactNumber) {
		super();
		this.name = name;//this keyword refers to current instance 
		this.idNumber = idNumber;
		this.contactNumber = contactNumber;
	}
    //getting the  name
	public String getName() {
		return name;
	}
    //setting the  name
	public void setName(String name) {
		this.name = name;
	}
    //getting the value of idnumber
	public int getIdNumber() {
		return idNumber;
	}
    //setting the value of  idnumber
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
    //getting the value of contactnumber
	public int getContactNumber() {
		return contactNumber;
	}
    //set the value of contactnumber
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override //returning the records
	public String toString() {
		return "Record [name=" + name + ", idNumber=" + idNumber + ", contactNumber=" + contactNumber + "]";
	}
	
	
}
