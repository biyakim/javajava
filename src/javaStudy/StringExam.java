package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		 String str1 = new String("Hello world");
		 String str2 = new String("Hello world");
      
//	        if(str1 == str2){
//	            System.out.println("str1과 str2는 같은 인스턴스를 참조합니다.");
//	        }
//	        else{
//	            System.out.println("str1과 str2는 다른 인스턴스를 참조합니다.");
//	        }
		 if( str1.equals(str2) ){
	            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
	        }
	        else{
	            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
	        }
	}

}
