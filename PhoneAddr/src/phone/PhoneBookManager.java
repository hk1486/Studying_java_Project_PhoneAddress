package phone;

public class PhoneBookManager {
	
	final int MAX_CNT=100;
    PhoneInfo[] info = new PhoneInfo[MAX_CNT];
    int curCnt=0;

    public void dataInsert()
    {
        System.out.print("이름 : ");
        String name = MenuViewer.key.nextLine();
        System.out.print("전화번호 : ");
        String number = MenuViewer.key.nextLine();
        System.out.print("생년월일(모른다면 넘어가도 좋습니다) : ");
        String birth = MenuViewer.key.nextLine();
        info[curCnt++] = new PhoneInfo(name, number, birth);
        System.out.println();
        System.out.println("데이터 입력이 완료되었습니다.");
        System.out.println();
    }

    public void dataSearch()
    {
        System.out.println("\n데이터 검색을 시작합니다...");
        System.out.print("이름 : ");
        String sname = MenuViewer.key.nextLine();

        int dataIdx=search(sname);
        if(dataIdx<0)
            System.out.println("\n해당데이터가 존재하지 않습니다.");
        else
        {
            info[dataIdx].ShowInfo();
            System.out.println("데이터검색이 완료되었습니다.");
        }
    }

    public void dataDelete()
    {
        System.out.println("데이터 삭제를 시작합니다...");

        System.out.print("이름 : ");
        String dname = MenuViewer.key.nextLine();
        int dataIdx=search(dname);

        if(dataIdx<0)
            System.out.println("해당데이터가 존재하지 않습니다.");
        else
        {
            for(int idx=dataIdx; idx<curCnt-1; idx++)
                info[idx]=info[idx+1];
            curCnt--;
            System.out.println("데이터 삭제가 완료되었습니다.");
        }
    }

    private int search(String name)
    {
        for(int idx=0; idx<curCnt; idx++)
        {
            if(name.compareTo(info[idx].name)==0)
                return idx;
        }
        return -1;
    }

}
