public class Main {
	static int a[]= new int[5];
	static{
		a[0]=100;
		int b = a[0];
	}

int bean;
	 public void getBean(int var) {  
        if (var > 0) {  
            this.bean = var;  
        } else {  
            throw new IllegalArgumentException();  
        }  
    }  

}