package gov.mlms.cciio.cms.fileProcess.ejb.schedule;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShopXMLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/opt/lms/WebSphere/EFT/commonOutApp/MLM/MLM.ABINF1.D.T.T";

		String sDate = new SimpleDateFormat("yyMMdd").format(new Date());
		String sTime = new SimpleDateFormat("HHmmssSSS").format(new Timestamp(System.currentTimeMillis()));
		path = path.replace(".D.",".D" + sDate + ".");
		path = path.replace(".T.",".T" + sTime + ".");
		
		System.out.println(path);
	}

}
