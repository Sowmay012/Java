package SDR;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class shuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] letters= {"P","Q","R","S","T"};
		System.out.println("Initial Array="+Arrays.toString(letters));
		List<String>list=Arrays.asList(letters);
		int len=list.size();
		System.out.println("Shuffled array....");
		for(int i=0;i<letters.length;i++)
		{
			int index=new Random().nextInt(len);
			String shuffle=list.get(index);
			System.out.print(shuffle);
		}
	}

}
