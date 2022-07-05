
public class Student {
	int RollNo;
	int Mark1, Mark2, Mark3;
	float TlMark;
	String name;
	
	Student(int RollNo, int Mark1, int Mark2, int Mark3, String name ){
		this.RollNo = RollNo;
		this.Mark1 = Mark1;
		this.Mark2 = Mark2;
		this.Mark3 = Mark3;
		this.name = name;
	}
	
	public
		void CalcGrade() {
			if(Mark1 > 50 && Mark2 > 50 && Mark3 > 50) {
				TlMark = Mark1 + Mark2 + Mark3;
				float AvgTl = TlMark/300;
				if(AvgTl > 0.9) {
					System.out.println("Total Mark : "+TlMark+"\nGrade : A");
				}
				else if(AvgTl > 0.8) {
					System.out.println("Total Mark : "+TlMark+"\nGrade : B");
				}
				else if(AvgTl > 0.7) {
					System.out.println("Total Mark : "+TlMark+"\nGrade : C");
				}
				else if(AvgTl > 0.6) {
					System.out.println("Total Mark : "+TlMark+"\nGrade : D");
				}
				else {
					System.out.println("Total Mark : "+TlMark+"\nGrade : E");
				}
			}
			else {
				TlMark = 0;
				System.out.println("Total Mark : "+TlMark+"\nGrade : Fail");
			}
		
	}
		

}
