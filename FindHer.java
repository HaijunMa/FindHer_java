package dog;

/*
 * Title: Find Her
 @author: Haijun Ma
 Time:2018/10/12
 */

public class FindHer{
	
	public static void main(String[] args) {
		final  int lj = 1;
		FindHer a = new FindHer();
		for(int i=0;i < 5;i++) {
			a.searchInBaidu();              //众里寻他千百度
			if(lj == a.returnMyHead()) {    //蓦然回首
				a.discoverTheLoveInDark();  //那人却在灯火阑珊处
				//return;
			}
			try {
				Thread.currentThread().sleep(2000);
			}catch(Exception e){}
		}
		
	}
	
	public void searchInBaidu() {
		System.out.println("众里寻他千百度");
		try {
			Thread.currentThread().sleep(2000);
		}catch(Exception e){}
	}

	public int returnMyHead() {
	    System.out.println("蓦然回首");
	    
	    try {
			Thread.currentThread().sleep(2000);
		}catch(Exception e){}
	    
	    return 1;
	}
	public void discoverTheLoveInDark() {
		System.out.println("那人却在灯火阑珊处");
	}
	
}