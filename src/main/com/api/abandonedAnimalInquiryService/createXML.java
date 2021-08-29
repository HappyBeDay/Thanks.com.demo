package main.com.api.abandonedAnimalInquiryService;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class createXML {
	BufferedWriter bs = null;

	private void close() {
		try {
			if (bs != null)
				bs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public createXML(StringBuilder sb) {
		try {
			bs = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("docs/xml/abandonedAnimalInquiryService.xml"), "UTF-8"));
			String str = sb.toString();
			bs.write(str); // Byte형으로만 넣을 수 있음
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			close();
		}
	}
}
