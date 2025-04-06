package patternPrograms;


               /*
*****
****
***
**
*
  
            */
public class QuestionNo_2 {

	public static void main(String[] args) {
		
		for (int i = 4; i >=0; i--) {
			for(int j=0 ; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//a[contains(class,'llll')]
//a[contains(text(),'llll')]

//a[starts-with(class,'llll')]
//a[starts-with(text(),'llll')]

//a[@class='llll']

//a[@class='llll'][placeholder='kkkk']

//a[text()='llll']

//a[normalize-space(text()='kkkk')]
