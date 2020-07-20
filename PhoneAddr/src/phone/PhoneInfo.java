package phone;


public class PhoneInfo {
	
	String name;
    String phoneNumber;
    String birthday;

    public PhoneInfo(String name, String phoneNumber, String birthday)
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.birthday=birthday;
    }

    public PhoneInfo(String name, String phoneNumber)
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.birthday=null;
    }

    public void ShowInfo()
    {
    	System.out.println("\n--------검색결과--------");
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
        if(birthday != null)
            System.out.println("생일 : " + birthday);
        System.out.println();

    }

}
