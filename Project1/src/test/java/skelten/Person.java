package skelten;

public class Person 
{
	private String message;
	private int distance;
	public void setDistance(Integer int1)
	{
		// TODO Auto-generated method stub
		distance=int1;
	}

	public void setMessage(String string) {
		// TODO Auto-generated method stub
		if(distance>0&&distance<30)
		message=string;
		else
		message=null;
	}

	public String getMesaage() {
		// TODO Auto-generated method stub
		return message;
	}

}
