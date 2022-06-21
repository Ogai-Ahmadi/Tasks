package class20task.teacher;

public class UserInfo extends User {
	String address;
	UserInfo(String name, long mobile_num,String add){
		super( name, mobile_num);
		
	}
	
	void userDetails(String name,String add, long mobile_num) {
		this.name=name;
		this.mobile_num=mobile_num;
		this.address=add;
		System.out.println("Name: "+ name + " Address: "+address+ " Mobile: "+mobile_num);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserInfo user = new UserInfo("Sabah",39390922,"99 AVE Peoria");
		
		user.userDetails("Zohal","99 AVE Peoria",39390922);
	}

}
