import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hanoi hanoi=new Hanoi();
      
      System.out.println("请输入想要移动的塔数");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      moveDisk(n,'A','C','B');
	}
    public static void moveDisk(int diskNumber,char startTower,char endTower,char midTower){
    	if(diskNumber==1){
    		System.out.println("将盘1从"+startTower+"塔移到"+endTower+"塔");
    	}
    	else{
    		moveDisk(diskNumber-1,startTower,midTower,endTower);
    	    System.out.println("将盘"+diskNumber+"从"+startTower+"塔移到"+endTower+"塔");
    	    moveDisk(diskNumber-1,midTower,endTower,startTower);
            
         }
    	
    }
}
