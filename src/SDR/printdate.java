package SDR;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class printdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Format f= new SimpleDateFormat("MM/dd/yy");
		String str=f.format(new Date());
		System.out.println("Date:"+str);
		

	}

}
