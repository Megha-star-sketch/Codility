package Codility;
enum Days
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
};

public class EnumDays {
	Days day;
	EnumDays(Days day)
	{
		this.day=day;
	}
	public void DayIsLike()
	{
		switch(day)
		{
		case MONDAY : System.out.println("Its working day.....");
		break;
		case TUESDAY : System.out.println("Its working and busy day.....");
		break;
		case WEDNESDAY : System.out.println("Its lazy day.....");
		break;
		case FRIDAY : System.out.println("Friday is a better day.....");
		break;
		case SATURDAY :
		case SUNDAY : System.out.println("Weekends are the best.....");
		break;
		default :
			System.out.println("No days.....!!!!!");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MONDAY";
		EnumDays e= new EnumDays(Days.valueOf(str));
		e.DayIsLike();
	}
}
