/*******************************************************************************
 * File Name:     Item.java
 * Name:          Jonathan Chung
 * Class:         ICS4U-01
 * Date:          2016/12/29
 * Description:   This class defines an item.
 *******************************************************************************/

abstract class Item {
	private long id;					//Item identification number
	private boolean isOut;			//Whether the item is out of the library or not
	private String title;			//Title of the item
	private Date dayBorrowed;		//Day item was borrowed
	
	public Item (long id, boolean isOut, String title, Date dayBorrowed) {
		this.id = id;
		this.isOut = isOut;
		this.title = title;
		this.dayBorrowed = dayBorrowed;
	} //Item constructor
	
	public abstract String getType ();
	public abstract int getMaxDaysOut ();
	
	public long getId () {
		return id;
	} //getId method
	
	public boolean isOut () {
		return isOut;
	} //getStatus method
	
	public String getTitle () {
		return title;
	} //getPrice method
	
	public void setIsOut (boolean isOut) {
		this.isOut = isOut;
	} //setIsOut method
	
	public int getDaysOverdue (Date curDate) {
		return dayBorrowed.compareTo(curDate) - getMaxDaysOut();
	} //getDaysOverdue method
	
	public String toString () {
		String output =
			"ID: " + id + "\n" +
			"Status: ";
		
		if (isOut) {
			output += "Out";
		} else {
			output += "In";
		} //if structure
		
		output +=
			"\n" +
			"Title: " + title;
			
		return output;
	} //toString method
	
	public boolean equals (Item other) {
		return
			this.getType().equals(other.getType()) &&
			this.id == other.id;
	} //equals method
} //Item class