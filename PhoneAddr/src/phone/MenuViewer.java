package phone;

import java.util.Scanner;

public class MenuViewer {
	
	public static Scanner key = new Scanner(System.in);
    public static void showMenu()
    {
        System.out.println("선택하세요..");
        System.out.println("1.데이터 입력");
        System.out.println("2.데이터 검색");
        System.out.println("3.데이터 삭제");
        System.out.println("4.프로그램 종료");
        System.out.print("선택 : ");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	        PhoneBookManager per = new PhoneBookManager();
	        int choice;
	        while(true)
	        {
	            MenuViewer.showMenu();
	            choice=MenuViewer.key.nextInt();
	            MenuViewer.key.nextLine();

	            switch(choice)
	            {
	                case 1:
	                    per.dataInsert();
	                    break;
	                case 2:
	                    per.dataSearch();
	                    break;
	                case 3:
	                    per.dataDelete();
	                    break;
	                case 4:
	                    System.out.println("프로그램 종료");
	                    return;
	            }
	        }
		}
	}
}

